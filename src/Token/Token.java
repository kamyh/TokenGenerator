package Token;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Calendar;

public class Token
{
	public Token(Options options, ArrayList<String> datas)
	{
		this.options = options;
		this.datas = datas;
		this.token = "";
		this.existingTokens = new ArrayList<String>();
	}

	public void Compute() throws NoSuchAlgorithmException, UnsupportedEncodingException
	{
		if (this.options.getPrefix() != null)
		{
			this.token = computeTokenPart(this.options.getPrefix() + this.token);
		}

		if (this.options.getSuffix() != null)
		{
			this.token = computeTokenPart(this.options.getSuffix() + this.token);
		}

		if (this.options.getEpierd_time() != null)
		{
			this.token = computeTokenPart(this.options.getEpierd_time().toString() + this.token);
		}

		this.token = computeTokenPart(Long.toString(Calendar.getInstance().getTime().getTime()) + this.token);

		for (String data : datas)
		{
			this.token = computeTokenPart(data + this.token);
		}
		
		if(this.existingTokens.contains(this.token))
		{
			Compute();
		}
		
		this.existingTokens.add(this.token);
	}

	private String computeTokenPart(String txt) throws NoSuchAlgorithmException, UnsupportedEncodingException
	{

		MessageDigest crypt = MessageDigest.getInstance("SHA-1");
		crypt.reset();
		crypt.update(txt.getBytes("UTF-8"));

		return new BigInteger(1, crypt.digest()).toString(16);
	}

	public String getToken()
	{
		return this.token;
	}

	private String token;
	private Options options;
	private ArrayList<String> datas;
	private ArrayList<String> existingTokens;

}

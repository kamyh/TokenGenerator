package Test;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

import Token.Options;
import Token.Token;

public class Test
{

	public static void main(String[] args)
	{
		Options options = new Options("prefix", "suffix");

		ArrayList<String> datas = new ArrayList<String>();
		datas.add("Deruaz");
		datas.add("Vincent");

		Token t = new Token(options, datas);

		try
		{
			t.Compute();
		} catch (NoSuchAlgorithmException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(t.getToken());

	}

}

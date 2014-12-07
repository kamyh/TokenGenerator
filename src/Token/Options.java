package Token;

import java.util.Date;

public class Options
{
	public Options()
	{
		this.epierd_time = null;
		this.prefix = null;
		this.suffix = null;
	}

	public Options(Date expiered_time)
	{
		this.epierd_time = expiered_time;
		this.prefix = null;
		this.suffix = null;
	}

	public Options(Date expiered_time, String prefix)
	{
		this.epierd_time = expiered_time;
		this.prefix = prefix;
		this.suffix = null;
	}

	public Options(String suffix, Date expiered_time)
	{
		this.epierd_time = expiered_time;
		this.prefix = null;
		this.suffix = suffix;
	}

	public Options(Date expiered_time, String prefix, String suffix)
	{
		this.epierd_time = expiered_time;
		this.prefix = prefix;
		this.suffix = suffix;
	}

	public Options(String prefix, String suffix)
	{
		this.epierd_time = null;
		this.prefix = prefix;
		this.suffix = suffix;
	}

	public String getSuffix()
	{
		return suffix;
	}

	public String getPrefix()
	{
		return prefix;
	}

	public Date getEpierd_time()
	{
		return epierd_time;
	}

	public void setSuffix(String suffix)
	{
		this.suffix = suffix;
	}

	public void setPrefix(String prefix)
	{
		this.prefix = prefix;
	}

	public void setEpierd_time(Date epierd_time)
	{
		this.epierd_time = epierd_time;
	}

	private String suffix;
	private String prefix;
	private Date epierd_time;
}

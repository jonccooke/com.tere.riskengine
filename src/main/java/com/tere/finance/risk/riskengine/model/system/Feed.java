package com.tere.finance.risk.riskengine.model.system;

import java.io.Serializable;

import com.tere.finance.risk.riskengine.model.exceptions.ConstraintVoliationException;
import com.tere.finance.risk.riskengine.model.exceptions.LengthExceededException;
public  class Feed implements Comparable, Serializable
{
	public static String FEEDID_PROPERTY = "Feed.feedId.property";
	public static String FEEDCODE_PROPERTY = "Feed.feedCode.property";
	public static String FEEDLOADTIME_PROPERTY = "Feed.feedLoadTime.property";
	protected Long feedId; 
	protected String feedCode; 
	protected java.util.Date feedLoadTime; 

	public Feed()
	{
	}
	
	public Feed(Long feedId, String feedCode, java.util.Date feedLoadTime) throws ConstraintVoliationException
	{
		this.feedId = feedId;
		this.feedCode = feedCode;
		this.feedLoadTime = feedLoadTime;
	}

	public void setFeedId(Long feedId) throws ConstraintVoliationException
	{
		if (null != feedId)
		{
		}
		this.feedId = feedId;
	}
	public Long getFeedId()
	{
		return feedId;
	}
	public void setFeedCode(String feedCode) throws ConstraintVoliationException
	{
		if (null != feedCode)
		{
			if (feedCode.length() > 20)
			{
				throw new LengthExceededException("$classReflect.getLabelName($param)", 20, feedCode.length());
			}
		}
		this.feedCode = feedCode;
	}
	public String getFeedCode()
	{
		return feedCode;
	}
	public void setFeedLoadTime(java.util.Date feedLoadTime) throws ConstraintVoliationException
	{
		if (null != feedLoadTime)
		{
		}
		this.feedLoadTime = feedLoadTime;
	}
	public java.util.Date getFeedLoadTime()
	{
		return feedLoadTime;
	}

	public String toString()
	{
		StringBuffer buf = new StringBuffer();
		buf.append("feedId");
		buf.append("='");
		buf.append(feedId);
		buf.append("'");

		buf.append("feedCode");
		buf.append("='");
		buf.append(feedCode);
		buf.append("'");

		buf.append("feedLoadTime");
		buf.append("='");
		buf.append(feedLoadTime);
		buf.append("'");
		return buf.toString();	
	}
	
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((feedId == null) ? 0 : feedId.hashCode());
		result = prime * result + ((feedCode == null) ? 0 : feedCode.hashCode());
		result = prime * result + ((feedLoadTime == null) ? 0 : feedLoadTime.hashCode());
		return result;
	}
	
	public int compareTo(Object obj)
	{
	    final int BEFORE = -1;
	    final int EQUAL = 0;
	    final int AFTER = 1;
	
		if (this == obj)
			return EQUAL;
		if (obj == null)
			return BEFORE;
		if (getClass() != obj.getClass())
			return BEFORE;
		Feed other = (Feed) obj;
		int comp = 0;
		if (feedId == null)
		{
			if (other.feedId != null)
				return BEFORE;
		}
		comp = feedId.compareTo(other.feedId);
		if (EQUAL != comp)
		{
			return comp;
		}
		if (feedCode == null)
		{
			if (other.feedCode != null)
				return BEFORE;
		}
		comp = feedCode.compareTo(other.feedCode);
		if (EQUAL != comp)
		{
			return comp;
		}
		if (feedLoadTime == null)
		{
			if (other.feedLoadTime != null)
				return BEFORE;
		}
		comp = feedLoadTime.compareTo(other.feedLoadTime);
		if (EQUAL != comp)
		{
			return comp;
		}
		return comp;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Feed other = (Feed) obj;
		if (feedId == null)
		{
			if (other.feedId != null)
				return false;
		}
		else if (!feedId.equals(other.feedId))
			return false;
		if (feedCode == null)
		{
			if (other.feedCode != null)
				return false;
		}
		else if (!feedCode.equals(other.feedCode))
			return false;
		if (feedLoadTime == null)
		{
			if (other.feedLoadTime != null)
				return false;
		}
		else if (!feedLoadTime.equals(other.feedLoadTime))
			return false;
		return super.equals(obj);
	}


}


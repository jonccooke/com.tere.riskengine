package com.tere.finance.risk.riskengine.model.valuation;

import java.io.Serializable;

import com.tere.finance.risk.riskengine.model.exceptions.ConstraintVoliationException;
import com.tere.finance.risk.riskengine.model.exceptions.LengthExceededException;
import com.tere.finance.risk.riskengine.model.referencedata.Tenor;
public  class Rate implements Comparable, Serializable
{
	public static String RATEID_PROPERTY = "Rate.rateId.property";
	public static String RATETYPE_PROPERTY = "Rate.rateType.property";
	public static String RATEVALUE_PROPERTY = "Rate.rateValue.property";
	public static String TENOR_PROPERTY = "Rate.tenor.property";
	protected Long rateId; 
	protected String rateType; 
	protected java.math.BigDecimal rateValue; 
	protected Tenor tenor; 

	public Rate()
	{
	}
	
	public Rate(Long rateId, String rateType, java.math.BigDecimal rateValue, com.tere.finance.risk.riskengine.model.referencedata.Tenor tenor) throws ConstraintVoliationException
	{
		this.rateId = rateId;
		this.rateType = rateType;
		this.rateValue = rateValue;
		this.tenor = tenor;
	}

	public void setRateId(Long rateId) throws ConstraintVoliationException
	{
		if (null != rateId)
		{
		}
		this.rateId = rateId;
	}
	public Long getRateId()
	{
		return rateId;
	}
	public void setRateType(String rateType) throws ConstraintVoliationException
	{
		if (null != rateType)
		{
			if (rateType.length() > 50)
			{
				throw new LengthExceededException("$classReflect.getLabelName($param)", 50, rateType.length());
			}
		}
		this.rateType = rateType;
	}
	public String getRateType()
	{
		return rateType;
	}
	public void setRateValue(java.math.BigDecimal rateValue) throws ConstraintVoliationException
	{
		if (null != rateValue)
		{
		}
		this.rateValue = rateValue;
	}
	public java.math.BigDecimal getRateValue()
	{
		return rateValue;
	}
	public void setTenor(Tenor tenor) throws ConstraintVoliationException
	{
		this.tenor = tenor;
	}
	public Tenor getTenor()
	{
		return tenor;
	}

	public String toString()
	{
		StringBuffer buf = new StringBuffer();
		buf.append("rateId");
		buf.append("='");
		buf.append(rateId);
		buf.append("'");

		buf.append("rateType");
		buf.append("='");
		buf.append(rateType);
		buf.append("'");

		buf.append("rateValue");
		buf.append("='");
		buf.append(rateValue);
		buf.append("'");
		return buf.toString();	
	}
	
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((rateId == null) ? 0 : rateId.hashCode());
		result = prime * result + ((rateType == null) ? 0 : rateType.hashCode());
		result = prime * result + ((rateValue == null) ? 0 : rateValue.hashCode());
		result = prime * result + ((tenor == null) ? 0 : tenor.hashCode());
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
		Rate other = (Rate) obj;
		int comp = 0;
		if (rateId == null)
		{
			if (other.rateId != null)
				return BEFORE;
		}
		comp = rateId.compareTo(other.rateId);
		if (EQUAL != comp)
		{
			return comp;
		}
		if (rateType == null)
		{
			if (other.rateType != null)
				return BEFORE;
		}
		comp = rateType.compareTo(other.rateType);
		if (EQUAL != comp)
		{
			return comp;
		}
		if (rateValue == null)
		{
			if (other.rateValue != null)
				return BEFORE;
		}
		comp = rateValue.compareTo(other.rateValue);
		if (EQUAL != comp)
		{
			return comp;
		}
		if (tenor == null)
		{
			if (other.tenor != null)
				return BEFORE;
		}
		comp = tenor.compareTo(other.tenor);
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
		Rate other = (Rate) obj;
		if (rateId == null)
		{
			if (other.rateId != null)
				return false;
		}
		else if (!rateId.equals(other.rateId))
			return false;
		if (rateType == null)
		{
			if (other.rateType != null)
				return false;
		}
		else if (!rateType.equals(other.rateType))
			return false;
		if (rateValue == null)
		{
			if (other.rateValue != null)
				return false;
		}
		else if (!rateValue.equals(other.rateValue))
			return false;
		if (tenor == null)
		{
			if (other.tenor != null)
				return false;
		}
		else if (!tenor.equals(other.tenor))
			return false;
		return super.equals(obj);
	}


}


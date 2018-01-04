package com.tere.finance.risk.riskengine.model.risk;

import java.io.Serializable;

import com.tere.finance.risk.riskengine.model.exceptions.ConstraintVoliationException;
import com.tere.finance.risk.riskengine.model.exceptions.LengthExceededException;
public  class RiskLimit implements Comparable, Serializable
{
	public static String RISKLIMITID_PROPERTY = "RiskLimit.riskLimitId.property";
	public static String LIMITTYPE_PROPERTY = "RiskLimit.limitType.property";
	public static String LIMITAMOUNT_PROPERTY = "RiskLimit.limitAmount.property";
	public static String EXCESSLIMITAMOUNT_PROPERTY = "RiskLimit.excessLimitAmount.property";
	protected Long riskLimitId; 
	protected String limitType; 
	protected java.math.BigDecimal limitAmount; 
	protected java.math.BigDecimal excessLimitAmount; 

	public RiskLimit()
	{
	}
	
	public RiskLimit(Long riskLimitId, String limitType, java.math.BigDecimal limitAmount, java.math.BigDecimal excessLimitAmount) throws ConstraintVoliationException
	{
		this.riskLimitId = riskLimitId;
		this.limitType = limitType;
		this.limitAmount = limitAmount;
		this.excessLimitAmount = excessLimitAmount;
	}

	public void setRiskLimitId(Long riskLimitId) throws ConstraintVoliationException
	{
		if (null != riskLimitId)
		{
		}
		this.riskLimitId = riskLimitId;
	}
	public Long getRiskLimitId()
	{
		return riskLimitId;
	}
	public void setLimitType(String limitType) throws ConstraintVoliationException
	{
		if (null != limitType)
		{
			if (limitType.length() > 50)
			{
				throw new LengthExceededException("$classReflect.getLabelName($param)", 50, limitType.length());
			}
		}
		this.limitType = limitType;
	}
	public String getLimitType()
	{
		return limitType;
	}
	public void setLimitAmount(java.math.BigDecimal limitAmount) throws ConstraintVoliationException
	{
		if (null != limitAmount)
		{
		}
		this.limitAmount = limitAmount;
	}
	public java.math.BigDecimal getLimitAmount()
	{
		return limitAmount;
	}
	public void setExcessLimitAmount(java.math.BigDecimal excessLimitAmount) throws ConstraintVoliationException
	{
		if (null != excessLimitAmount)
		{
		}
		this.excessLimitAmount = excessLimitAmount;
	}
	public java.math.BigDecimal getExcessLimitAmount()
	{
		return excessLimitAmount;
	}

	public String toString()
	{
		StringBuffer buf = new StringBuffer();
		buf.append("riskLimitId");
		buf.append("='");
		buf.append(riskLimitId);
		buf.append("'");

		buf.append("limitType");
		buf.append("='");
		buf.append(limitType);
		buf.append("'");

		buf.append("limitAmount");
		buf.append("='");
		buf.append(limitAmount);
		buf.append("'");

		buf.append("excessLimitAmount");
		buf.append("='");
		buf.append(excessLimitAmount);
		buf.append("'");
		return buf.toString();	
	}
	
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((riskLimitId == null) ? 0 : riskLimitId.hashCode());
		result = prime * result + ((limitType == null) ? 0 : limitType.hashCode());
		result = prime * result + ((limitAmount == null) ? 0 : limitAmount.hashCode());
		result = prime * result + ((excessLimitAmount == null) ? 0 : excessLimitAmount.hashCode());
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
		RiskLimit other = (RiskLimit) obj;
		int comp = 0;
		if (riskLimitId == null)
		{
			if (other.riskLimitId != null)
				return BEFORE;
		}
		comp = riskLimitId.compareTo(other.riskLimitId);
		if (EQUAL != comp)
		{
			return comp;
		}
		if (limitType == null)
		{
			if (other.limitType != null)
				return BEFORE;
		}
		comp = limitType.compareTo(other.limitType);
		if (EQUAL != comp)
		{
			return comp;
		}
		if (limitAmount == null)
		{
			if (other.limitAmount != null)
				return BEFORE;
		}
		comp = limitAmount.compareTo(other.limitAmount);
		if (EQUAL != comp)
		{
			return comp;
		}
		if (excessLimitAmount == null)
		{
			if (other.excessLimitAmount != null)
				return BEFORE;
		}
		comp = excessLimitAmount.compareTo(other.excessLimitAmount);
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
		RiskLimit other = (RiskLimit) obj;
		if (riskLimitId == null)
		{
			if (other.riskLimitId != null)
				return false;
		}
		else if (!riskLimitId.equals(other.riskLimitId))
			return false;
		if (limitType == null)
		{
			if (other.limitType != null)
				return false;
		}
		else if (!limitType.equals(other.limitType))
			return false;
		if (limitAmount == null)
		{
			if (other.limitAmount != null)
				return false;
		}
		else if (!limitAmount.equals(other.limitAmount))
			return false;
		if (excessLimitAmount == null)
		{
			if (other.excessLimitAmount != null)
				return false;
		}
		else if (!excessLimitAmount.equals(other.excessLimitAmount))
			return false;
		return super.equals(obj);
	}


}


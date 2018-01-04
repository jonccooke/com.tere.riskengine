package com.tere.finance.risk.riskengine.model.instrument;

import java.io.Serializable;

import com.tere.finance.risk.riskengine.model.exceptions.ConstraintVoliationException;
import com.tere.finance.risk.riskengine.model.exceptions.LengthExceededException;
public  class InstrumentType implements Comparable, Serializable
{
	public static String INSTRUMENTTYPEID_PROPERTY = "InstrumentType.instrumentTypeId.property";
	public static String INSTRUMENTTYPENAME_PROPERTY = "InstrumentType.instrumentTypeName.property";
	protected Long instrumentTypeId; 
	protected String instrumentTypeName; 

	public InstrumentType()
	{
	}
	
	public InstrumentType(Long instrumentTypeId, String instrumentTypeName) throws ConstraintVoliationException
	{
		this.instrumentTypeId = instrumentTypeId;
		this.instrumentTypeName = instrumentTypeName;
	}

	public void setInstrumentTypeId(Long instrumentTypeId) throws ConstraintVoliationException
	{
		if (null != instrumentTypeId)
		{
		}
		this.instrumentTypeId = instrumentTypeId;
	}
	public Long getInstrumentTypeId()
	{
		return instrumentTypeId;
	}
	public void setInstrumentTypeName(String instrumentTypeName) throws ConstraintVoliationException
	{
		if (null != instrumentTypeName)
		{
			if (instrumentTypeName.length() > 50)
			{
				throw new LengthExceededException("$classReflect.getLabelName($param)", 50, instrumentTypeName.length());
			}
		}
		this.instrumentTypeName = instrumentTypeName;
	}
	public String getInstrumentTypeName()
	{
		return instrumentTypeName;
	}

	public String toString()
	{
		StringBuffer buf = new StringBuffer();
		buf.append("instrumentTypeId");
		buf.append("='");
		buf.append(instrumentTypeId);
		buf.append("'");

		buf.append("instrumentTypeName");
		buf.append("='");
		buf.append(instrumentTypeName);
		buf.append("'");
		return buf.toString();	
	}
	
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((instrumentTypeId == null) ? 0 : instrumentTypeId.hashCode());
		result = prime * result + ((instrumentTypeName == null) ? 0 : instrumentTypeName.hashCode());
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
		InstrumentType other = (InstrumentType) obj;
		int comp = 0;
		if (instrumentTypeId == null)
		{
			if (other.instrumentTypeId != null)
				return BEFORE;
		}
		comp = instrumentTypeId.compareTo(other.instrumentTypeId);
		if (EQUAL != comp)
		{
			return comp;
		}
		if (instrumentTypeName == null)
		{
			if (other.instrumentTypeName != null)
				return BEFORE;
		}
		comp = instrumentTypeName.compareTo(other.instrumentTypeName);
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
		InstrumentType other = (InstrumentType) obj;
		if (instrumentTypeId == null)
		{
			if (other.instrumentTypeId != null)
				return false;
		}
		else if (!instrumentTypeId.equals(other.instrumentTypeId))
			return false;
		if (instrumentTypeName == null)
		{
			if (other.instrumentTypeName != null)
				return false;
		}
		else if (!instrumentTypeName.equals(other.instrumentTypeName))
			return false;
		return super.equals(obj);
	}


}


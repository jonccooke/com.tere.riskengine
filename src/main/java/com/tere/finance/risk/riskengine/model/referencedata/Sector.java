package com.tere.finance.risk.riskengine.model.referencedata;

import java.io.Serializable;

import com.tere.finance.risk.riskengine.model.exceptions.ConstraintVoliationException;
import com.tere.finance.risk.riskengine.model.exceptions.LengthExceededException;

public  class Sector implements Comparable, Serializable
{
	public static String SECTORID_PROPERTY = "Sector.sectorId.property";
	public static String SECTORNAME_PROPERTY = "Sector.sectorName.property";
	protected Long sectorId; 
	protected String sectorName; 

	public Sector()
	{
	}
	
	public Sector(Long sectorId, String sectorName) throws ConstraintVoliationException
	{
		this.sectorId = sectorId;
		this.sectorName = sectorName;
	}

	public void setSectorId(Long sectorId) throws ConstraintVoliationException
	{
		if (null != sectorId)
		{
		}
		this.sectorId = sectorId;
	}
	public Long getSectorId()
	{
		return sectorId;
	}
	public void setSectorName(String sectorName) throws ConstraintVoliationException
	{
		if (null != sectorName)
		{
			if (sectorName.length() > 100)
			{
				throw new LengthExceededException("$classReflect.getLabelName($param)", 100, sectorName.length());
			}
		}
		this.sectorName = sectorName;
	}
	public String getSectorName()
	{
		return sectorName;
	}

	public String toString()
	{
		StringBuffer buf = new StringBuffer();
		buf.append("sectorId");
		buf.append("='");
		buf.append(sectorId);
		buf.append("'");

		buf.append("sectorName");
		buf.append("='");
		buf.append(sectorName);
		buf.append("'");
		return buf.toString();	
	}
	
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((sectorId == null) ? 0 : sectorId.hashCode());
		result = prime * result + ((sectorName == null) ? 0 : sectorName.hashCode());
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
		Sector other = (Sector) obj;
		int comp = 0;
		if (sectorId == null)
		{
			if (other.sectorId != null)
				return BEFORE;
		}
		comp = sectorId.compareTo(other.sectorId);
		if (EQUAL != comp)
		{
			return comp;
		}
		if (sectorName == null)
		{
			if (other.sectorName != null)
				return BEFORE;
		}
		comp = sectorName.compareTo(other.sectorName);
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
		Sector other = (Sector) obj;
		if (sectorId == null)
		{
			if (other.sectorId != null)
				return false;
		}
		else if (!sectorId.equals(other.sectorId))
			return false;
		if (sectorName == null)
		{
			if (other.sectorName != null)
				return false;
		}
		else if (!sectorName.equals(other.sectorName))
			return false;
		return super.equals(obj);
	}


}


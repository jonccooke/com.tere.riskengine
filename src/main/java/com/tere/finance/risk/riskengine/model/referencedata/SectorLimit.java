package com.tere.finance.risk.riskengine.model.referencedata;

import java.io.Serializable;

import com.tere.finance.risk.riskengine.model.exceptions.ConstraintVoliationException;
import com.tere.finance.risk.riskengine.model.risk.RiskLimit;

public class SectorLimit extends RiskLimit implements Comparable, Serializable
{
	public static String SECTOR_PROPERTY = "SectorLimit.sector.property";
	protected Sector sector;

	public SectorLimit()
	{
	}

	public SectorLimit(Long riskLimitId, String limitType,
			java.math.BigDecimal limitAmount,
			java.math.BigDecimal excessLimitAmount,
			com.tere.finance.risk.riskengine.model.referencedata.Sector sector)
			throws ConstraintVoliationException
	{
		this.riskLimitId = riskLimitId;
		this.limitType = limitType;
		this.limitAmount = limitAmount;
		this.excessLimitAmount = excessLimitAmount;
		this.sector = sector;
	}

	public void setSector(Sector sector) throws ConstraintVoliationException
	{
		this.sector = sector;
	}

	public Sector getSector()
	{
		return sector;
	}

	public String toString()
	{
		return super.toString();
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((sector == null) ? 0 : sector.hashCode());
		return result;
	}

	@Override
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
		SectorLimit other = (SectorLimit) obj;
		int comp = 0;
		if (sector == null)
		{
			if (other.sector != null)
				return BEFORE;
		}
		comp = sector.compareTo(other.sector);
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
		SectorLimit other = (SectorLimit) obj;
		if (sector == null)
		{
			if (other.sector != null)
				return false;
		}
		else if (!sector.equals(other.sector))
			return false;
		return super.equals(obj);
	}

}

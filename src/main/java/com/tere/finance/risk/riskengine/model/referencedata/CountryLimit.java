package com.tere.finance.risk.riskengine.model.referencedata;

import java.io.Serializable;

import com.tere.finance.risk.riskengine.model.exceptions.ConstraintVoliationException;
import com.tere.finance.risk.riskengine.model.risk.RiskLimit;
public  class CountryLimit extends RiskLimit  implements Comparable, Serializable
{
	public static String COUNTRY_PROPERTY = "CountryLimit.country.property";
	protected Country country; 

	public CountryLimit()
	{
	}
	
	public CountryLimit(Long riskLimitId, String limitType, java.math.BigDecimal limitAmount, java.math.BigDecimal excessLimitAmount, com.tere.finance.risk.riskengine.model.referencedata.Country country) throws ConstraintVoliationException
	{
		this.riskLimitId = riskLimitId;
		this.limitType = limitType;
		this.limitAmount = limitAmount;
		this.excessLimitAmount = excessLimitAmount;
		this.country = country;
	}

	public void setCountry(Country country) throws ConstraintVoliationException
	{
		this.country = country;
	}
	public Country getCountry()
	{
		return country;
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
		result = prime * result + ((country == null) ? 0 : country.hashCode());
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
		CountryLimit other = (CountryLimit) obj;
		int comp = 0;
		if (country == null)
		{
			if (other.country != null)
				return BEFORE;
		}
		comp = country.compareTo(other.country);
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
		CountryLimit other = (CountryLimit) obj;
		if (country == null)
		{
			if (other.country != null)
				return false;
		}
		else if (!country.equals(other.country))
			return false;
		return super.equals(obj);
	}


}


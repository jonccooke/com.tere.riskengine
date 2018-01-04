package com.tere.finance.risk.riskengine.model.referencedata;

import java.io.Serializable;

import com.tere.finance.risk.riskengine.model.exceptions.ConstraintVoliationException;
import com.tere.finance.risk.riskengine.model.risk.RiskLimit;
public  class CounterpartyLimit extends RiskLimit  implements Comparable, Serializable
{
	public static String COUNTERPARTY_PROPERTY = "CounterpartyLimit.counterparty.property";
	protected Counterparty counterparty; 

	public CounterpartyLimit()
	{
	}
	
	public CounterpartyLimit(Long riskLimitId, String limitType, java.math.BigDecimal limitAmount, java.math.BigDecimal excessLimitAmount, com.tere.finance.risk.riskengine.model.referencedata.Counterparty counterparty) throws ConstraintVoliationException
	{
		this.riskLimitId = riskLimitId;
		this.limitType = limitType;
		this.limitAmount = limitAmount;
		this.excessLimitAmount = excessLimitAmount;
		this.counterparty = counterparty;
	}

	public void setCounterparty(Counterparty counterparty) throws ConstraintVoliationException
	{
		this.counterparty = counterparty;
	}
	public Counterparty getCounterparty()
	{
		return counterparty;
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
		result = prime * result + ((counterparty == null) ? 0 : counterparty.hashCode());
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
		CounterpartyLimit other = (CounterpartyLimit) obj;
		int comp = 0;
		if (counterparty == null)
		{
			if (other.counterparty != null)
				return BEFORE;
		}
		comp = counterparty.compareTo(other.counterparty);
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
		CounterpartyLimit other = (CounterpartyLimit) obj;
		if (counterparty == null)
		{
			if (other.counterparty != null)
				return false;
		}
		else if (!counterparty.equals(other.counterparty))
			return false;
		return super.equals(obj);
	}


}


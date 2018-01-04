package com.tere.finance.risk.riskengine.model.referencedata;

import java.io.Serializable;

public class Counterparty implements Comparable, Serializable
{
	protected int counterpartyId;
	protected String counterpartyName;
	protected Country countryOfIncorporation;

	public Counterparty(int counterpartyId, String counterpartyName,
			Country countryOfIncorporation)
	{
		super();
		this.counterpartyId = counterpartyId;
		this.counterpartyName = counterpartyName;
		this.countryOfIncorporation = countryOfIncorporation;
	}

	public int getCounterpartyId()
	{
		return counterpartyId;
	}

	public String getCounterpartyName()
	{
		return counterpartyName;
	}

	public Country getCountryOfIncorporation()
	{
		return countryOfIncorporation;
	}

	@Override
	public int compareTo(Object o)
	{
		return 0;
	}

}

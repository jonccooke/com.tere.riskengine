package com.tere.finance.risk.riskengine.model.instrument.commodity;

import com.tere.finance.risk.riskengine.model.exceptions.ConstraintVoliationException;
import com.tere.finance.risk.riskengine.model.instrument.Instrument;

public class Commodity extends Instrument
{
	/** Size of a unit */
	private double unitAmount;

	private double price;
	
	/** Description of unit size */
	private String unitName = null;


	public Commodity(String name, double unitAmount, String unitName) throws ConstraintVoliationException
	{
		super();
		setInstrumentName(name);
		this.unitAmount = unitAmount;
		this.unitName = unitName;
	}


	public Commodity(double unitAmount, String unitName)
	{
		super();
		this.unitAmount = unitAmount;
		this.unitName = unitName;
	}

	public double getUnitAmount()
	{
		return unitAmount;
	}

	public String getUnitName()
	{
		return unitName;
	}


	public double getPrice()
	{
		return price;
	}


	public void setPrice(double price)
	{
		this.price = price;
	}

}

package com.tere.finance.risk.riskengine.model.instrument.equities;

import com.tere.finance.risk.riskengine.model.instrument.Exercise;
import com.tere.finance.risk.riskengine.model.instrument.VanillaOption;

public class EquityOption extends VanillaOption
{
	private Equity equity;
	private double exercisePrice;
	private int term;
	private double riskFreeRate;
	private double impliedVolatility;

	public EquityOption(Exercise exercise, Type type, Equity equity,
			double exercisePrice, int term, double impliedVolatility)
	{
		super(exercise, type);
		this.equity = equity;
		this.exercisePrice = exercisePrice;
		this.term = term;
		this.impliedVolatility = impliedVolatility;
	}

	public Equity getEquity()
	{
		return equity;
	}

	public double getExercisePrice()
	{
		return exercisePrice;
	}

	public int getTerm()
	{
		return term;
	}

	public double getRiskFreeRate()
	{
		return riskFreeRate;
	}

	public void setRiskFreeRate(double riskFreeRate)
	{
		this.riskFreeRate = riskFreeRate;
	}

	public double getImpliedVolatility()
	{
		return impliedVolatility;
	}

}

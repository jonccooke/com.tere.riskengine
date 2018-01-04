package com.tere.finance.risk.riskengine.model.instrument;

import com.tere.finance.risk.riskengine.valuation.Greeks;

public abstract class Option extends Instrument
{

	public enum Type
	{
		Call, Put
	}

	private Exercise exercise;
	private Type type;
	private Greeks greeks = new Greeks();
	
	public Option(Exercise exercise, Type type)
	{
		this.exercise = exercise;
		this.type = type;
	}

	public Exercise getExercise()
	{
		return exercise;
	}

	public Type getType()
	{
		return type;
	}

	public Greeks getGreeks()
	{
		return greeks;
	}

}

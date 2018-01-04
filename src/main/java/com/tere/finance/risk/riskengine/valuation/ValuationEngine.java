package com.tere.finance.risk.riskengine.valuation;

import java.util.Calendar;
import java.util.Date;

import com.tere.finance.risk.riskengine.model.instrument.Instrument;
import com.tere.finance.risk.riskengine.model.referencedata.DayCountConventionType;
import com.tere.finance.risk.riskengine.model.referencedata.HolidayCalendar;

public abstract class ValuationEngine<T extends Instrument>
{
	public enum ValueType
	{
		PV,
		Delta,
		Gamma,
		Theta,
		Rho,
		Vega
		
	}
	
	private T instrument;
	private HolidayCalendar calendar;
	private DayCountConventionType dayCountConventionType;
	
	public ValuationEngine(T instrument, HolidayCalendar calendar, DayCountConventionType dayCountConventionType)
	{
		this.instrument = instrument;
		this.calendar =calendar;
		this.dayCountConventionType = dayCountConventionType;
	}
	
	public T getInstrument()
	{
		return instrument;
	}

	public void setInstrument(T instrument)
	{
		this.instrument = instrument;
	}

	public HolidayCalendar getCalendar()
	{
		return calendar;
	}

	public void setCalendar(HolidayCalendar calendar)
	{
		this.calendar = calendar;
	}
	
	public DayCountConventionType getDayCountConventionType()
	{
		return dayCountConventionType;
	}

	public void setDayCountConventionType(
			DayCountConventionType dayCountConventionType)
	{
		this.dayCountConventionType = dayCountConventionType;
	}

	public abstract double calculate(ValueType valueType, Date valuationDate) throws ValuationException;

	public double calculate(ValueType valueType) throws ValuationException
	{
		return calculate(valueType, Calendar.getInstance().getTime());
	}
	

//	public abstract void calculateCashFlows() throws ValuationException;

}

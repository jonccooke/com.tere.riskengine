package com.tere.finance.risk.riskengine.utils;

import org.joda.time.LocalDate;

public interface DayCounter
{
	/* @Time */
	public double yearFraction(
			LocalDate dateStart,
			LocalDate dateEnd, 
			LocalDate refPeriodStart,
			LocalDate refPeriodEnd);

}

package com.tere.finance.risk.riskengine.valuation;

import org.joda.time.Days;
import org.joda.time.LocalDate;

import com.tere.TereException;
import com.tere.finance.risk.riskengine.model.referencedata.DayCountConventionType;

public class DayCountUtils
{

	public static double getDayCountFraction(LocalDate startDate,
			LocalDate endDate, DayCountConventionType conventionType)
			throws TereException
	{
		double fraction = 0.0;

		switch (conventionType)
		{
		case DC_Actual_365:
			return Days.daysBetween(startDate, endDate).getDays() / 365.0;
		case DC_Actual_360:
			return Days.daysBetween(startDate, endDate).getDays() / 360.0;
		}
		throw new TereException("Unsupported convention type:"
				+ conventionType.name());
	}
}

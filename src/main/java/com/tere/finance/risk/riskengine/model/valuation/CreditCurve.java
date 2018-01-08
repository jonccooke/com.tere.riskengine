package com.tere.finance.risk.riskengine.model.valuation;

import java.time.Period;
import java.util.ArrayList;
import java.util.Currency;
import java.util.List;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;

import com.tere.finance.risk.riskengine.model.referencedata.DayCountConventionType;
import com.tere.finance.risk.riskengine.model.referencedata.HolidayCalendar;
import com.tere.finance.risk.riskengine.model.risk.RatingType;

public class CreditCurve extends Curve
{

	private RatingType ratingType; 
	private List<Period> periodsList = new ArrayList();
	private List<Double> ratesList = new ArrayList();

	public CreditCurve(String curveName, RatingType ratingType, LocalDate effectiveDate, Currency currency,
			DayCountConventionType badDayConvention,
			DayCountConventionType dayConvention, DateTime snaptime,
			LocalDate spotdate, HolidayCalendar calendar)
	{
		super(curveName, effectiveDate, currency, badDayConvention, dayConvention,
				snaptime, spotdate, calendar);
		this.ratingType = ratingType;
	}

}

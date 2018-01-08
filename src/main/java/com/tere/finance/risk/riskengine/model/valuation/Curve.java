package com.tere.finance.risk.riskengine.model.valuation;

import java.util.Collection;
import java.util.Currency;
import java.util.LinkedHashMap;
import java.util.Map;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;

import com.tere.finance.risk.riskengine.model.referencedata.DayCountConventionType;
import com.tere.finance.risk.riskengine.model.referencedata.HolidayCalendar;

public class Curve
{
	private LocalDate effectiveDate;
	private Currency currency;
	private DayCountConventionType badDayConvention;
	private DayCountConventionType dayConvention;
	private HolidayCalendar calendar;
	private DateTime snaptime;
	private LocalDate spotdate;
	private LocalDate firstDate;
	private LocalDate lastDate;
	private String curveName;
	
	private Map<LocalDate, CurvePoint> curvePoints = new LinkedHashMap<LocalDate, CurvePoint>();

	public Curve(String curveName, LocalDate effectiveDate, Currency currency,
			DayCountConventionType badDayConvention,
			DayCountConventionType dayConvention, DateTime snaptime,
			LocalDate spotdate, HolidayCalendar calendar)
	{
		super();
		this.effectiveDate = effectiveDate;
		this.currency = currency;
		this.badDayConvention = badDayConvention;
		this.dayConvention = dayConvention;
		this.snaptime = snaptime;
		this.spotdate = spotdate;
		this.calendar = calendar;
		this.curveName = curveName;
	}

	public LocalDate getEffectiveDate()
	{
		return effectiveDate;
	}

	public Currency getCurrency()
	{
		return currency;
	}

	public DayCountConventionType getBadDayConvention()
	{
		return badDayConvention;
	}

	public DayCountConventionType getDayConvention()
	{
		return dayConvention;
	}

	public DateTime getSnaptime()
	{
		return snaptime;
	}

	public LocalDate getSpotdate()
	{
		return spotdate;
	}

	public Collection<CurvePoint> getPoints()
	{
		return curvePoints.values();
	}

	public void setCurvePoint(CurvePoint curvePoint)
	{
		LocalDate date = curvePoint.getDate();
		if (null == firstDate)
		{
			firstDate = date;
		}
		else
		{
			if (firstDate.isAfter(date))
			{
				firstDate = date;
			}
		}
		if (null == lastDate)
		{
			lastDate = date;
		}
		else
		{
			if (lastDate.isBefore(date))
			{
				lastDate = date;
			}
		}
		curvePoints.put(curvePoint.getDate(), curvePoint);
	}

	public CurvePoint getCurvePoint(LocalDate date)
	{
		return curvePoints.get(date);
	}

	public Collection<CurvePoint> getCurvePoints()
	{
		return curvePoints.values();
	}

	public HolidayCalendar getCalendar()
	{
		return calendar;
	}

	public LocalDate getFirstDate()
	{
		return firstDate;
	}

	public LocalDate getLastDate()
	{
		return lastDate;
	}

	public String getCurveName()
	{
		return curveName;
	}

	@Override
	public String toString()
	{
		return "{ \"effectiveDate\"=\"" + effectiveDate + "\", \"currency\"=\""
				+ currency + "\", \"badDayConvention\"=\"" + badDayConvention
				+ "\", \"dayConvention\"=\"" + dayConvention + "\", \"calendar\"=\"" + calendar
				+ "\", \"snaptime\"=\"" + snaptime + "\", \"spotdate\"=\"" + spotdate
				+ "\", \"firstDate\"=\"" + firstDate + "\", \"lastDate\"=\"" + lastDate
				+ "\", \"curveName\"=\"" + curveName + "\", \"curvePoints=[" + curvePoints
				+ "]" + "}";
	}


}

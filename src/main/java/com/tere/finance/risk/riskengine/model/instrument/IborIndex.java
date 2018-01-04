package com.tere.finance.risk.riskengine.model.instrument;

import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Currency;

import com.tere.finance.risk.riskengine.model.exceptions.ConstraintVoliationException;
import com.tere.finance.risk.riskengine.model.referencedata.DayCountConventionType;
import com.tere.finance.risk.riskengine.model.referencedata.HolidayCalendar;
import com.tere.finance.risk.riskengine.model.referencedata.Tenor;
import com.tere.finance.risk.riskengine.model.referencedata.TenorConvention;

public class IborIndex extends Index
{

	private Currency currency;
	private boolean active;
	private DayCountConventionType dayCount;
	private HolidayCalendar fixingCalendar;
	private int offsetDays;
	private HolidayCalendar offsetCalendar;
	private HolidayCalendar effectiveDateCalendar;
	private Tenor tenor;
	private TenorConvention tenorConvention;
	private LocalTime fixingTime;
	private ZoneId fixingZone;

	public IborIndex(String indexName, Currency currency, boolean active,
			DayCountConventionType dayCount, HolidayCalendar fixingCalendar,
			int offsetDays, HolidayCalendar offsetCalendar,
			HolidayCalendar effectiveDateCalendar, Tenor tenor,
			TenorConvention tenorConvention, LocalTime fixingTime,
			ZoneId fixingZone) 
	{
		this.instrumentName = indexName;
		this.currency = currency;
		this.active = active;
		this.dayCount = dayCount;
		this.fixingCalendar = fixingCalendar;
		this.offsetDays = offsetDays;
		this.offsetCalendar = offsetCalendar;
		this.effectiveDateCalendar = effectiveDateCalendar;
		this.tenor = tenor;
		this.tenorConvention = tenorConvention;
		this.fixingTime = fixingTime;
		this.fixingZone = fixingZone;
	}

	public Currency getCurrency()
	{
		return currency;
	}

	public boolean isActive()
	{
		return active;
	}

	public DayCountConventionType getDayCount()
	{
		return dayCount;
	}

	public HolidayCalendar getFixingCalendar()
	{
		return fixingCalendar;
	}

	public int getOffsetDays()
	{
		return offsetDays;
	}

	public HolidayCalendar getOffsetCalendar()
	{
		return offsetCalendar;
	}

	public HolidayCalendar getEffectiveDateCalendar()
	{
		return effectiveDateCalendar;
	}

	public Tenor getTenor()
	{
		return tenor;
	}

	public TenorConvention getTenorConvention()
	{
		return tenorConvention;
	}

	public LocalTime getFixingTime()
	{
		return fixingTime;
	}

	public ZoneId getFixingZone()
	{
		return fixingZone;
	}

}

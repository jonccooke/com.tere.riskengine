package com.tere.finance.risk.riskengine.model.referencedata;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentSkipListMap;

import org.joda.time.DateTimeConstants;
import org.joda.time.LocalDate;

public class HolidayCalendar
{
	private Map<LocalDate, TradingCalendarDay> days = new ConcurrentSkipListMap<LocalDate, TradingCalendarDay>();
	private Country country;
	private String holidayCalendarId;
	
	public HolidayCalendar(String holidayCalendarId, Country country)
	{
		this.country =  country;
		this.holidayCalendarId = holidayCalendarId;
	}
	
	public Country getCountry()
	{
		return country;
	}

	public String getHolidayCalendarId()
	{
		return holidayCalendarId;
	}

	public void setTradingDay(LocalDate date, TradingCalendarDay.Status status)
	{
		days.put(date, new TradingCalendarDay(date, status));
	}

	public void setTradingDay(LocalDate date, TradingCalendarDay tradingCalendarDay)
	{
		days.put(date, tradingCalendarDay);
	}

	public boolean isTradingDay(LocalDate date)
	{
		if (days.containsKey(date))
		{
			return days.get(date).getStatus() == TradingCalendarDay.Status.open; 
		}
		return !isWeekendDay(date);
	}

	public boolean isWeekendDay(LocalDate date)
	{
		if (days.containsKey(date))
		{
			return days.get(date).getStatus() == TradingCalendarDay.Status.open; 
		}
		return date.getDayOfWeek() == DateTimeConstants.SATURDAY || date.getDayOfWeek() == DateTimeConstants.SUNDAY;
	}

	public LocalDate nextTradingDay(LocalDate startDate)
	{
		LocalDate currentDate = startDate;
		
		while (!isTradingDay(currentDate))
		{
			currentDate = currentDate.plusDays(1);
		}
		return currentDate;
	}

	public Collection<TradingCalendarDay> getTradingDays()
	{
		return days.values();
	}
	@Override
	public String toString()
	{
		return "{ \"days\":" + days + ", \"country\":" + country
				+ ", \"holidayCalendarId\":\"" + holidayCalendarId + "\"}";
	}

}

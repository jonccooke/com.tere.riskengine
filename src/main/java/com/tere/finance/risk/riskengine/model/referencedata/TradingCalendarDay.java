package com.tere.finance.risk.riskengine.model.referencedata;

import java.util.Date;

import org.joda.time.LocalDate;
import org.joda.time.LocalTime;

public class TradingCalendarDay
{
	public enum Status
	{
		open, closed
	}

	private LocalDate date;
	private Status status;
	private LocalTime preMarketOpen;
	private LocalTime preMarketClose;
	private LocalTime marketOpen;
	private LocalTime marketClose;
	private LocalTime postMarketOpen;
	private LocalTime postMarketClose;

	public TradingCalendarDay(LocalDate date, Status status)
	{
		this.date = date;
		this.status = status;
	}

	public TradingCalendarDay(LocalDate date, Status status,
			LocalTime preMarketOpen, LocalTime preMarketClose,
			LocalTime marketOpen, LocalTime marketClose,
			LocalTime postMarketOpen, LocalTime postMarketClose)
	{
		this.date = date;
		this.status = status;
		this.preMarketOpen = preMarketOpen;
		this.preMarketClose = preMarketClose;
		this.marketOpen = marketOpen;
		this.marketClose = marketClose;
		this.postMarketOpen = postMarketOpen;
		this.postMarketClose = postMarketClose;
	}

	public LocalDate getDate()
	{
		return date;
	}

	public Status getStatus()
	{
		return status;
	}

	public LocalTime getPreMarketOpen()
	{
		return preMarketOpen;
	}

	public LocalTime getPreMarketClose()
	{
		return preMarketClose;
	}

	public LocalTime getMarketOpen()
	{
		return marketOpen;
	}

	public LocalTime getMarketClose()
	{
		return marketClose;
	}

	public LocalTime getPostMarketOpen()
	{
		return postMarketOpen;
	}

	public LocalTime getPostMarketClose()
	{
		return postMarketClose;
	}

}

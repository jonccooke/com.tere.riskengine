package com.tere.finance.risk.riskengine.model.referencedata;

import java.io.Serializable;

import com.tere.finance.risk.riskengine.model.exceptions.ConstraintVoliationException;

public class Exchange implements Serializable
{
	private String exchangeName;
	private Long exchangeId;
	private HolidayCalendar tradingCalendar;

	public Exchange(String exchangeName, Long exchangeId,
			HolidayCalendar tradingCalendar)
			throws ConstraintVoliationException
	{
		this.exchangeName = exchangeName;
		this.exchangeId = exchangeId;
		this.tradingCalendar = tradingCalendar;
	}

	public String getExchangeName()
	{
		return exchangeName;
	}

	public Long getExchangeId()
	{
		return exchangeId;
	}

	public HolidayCalendar getTradingCalendar()
	{
		return tradingCalendar;
	}

	public int compareTo(Exchange exchange)
	{
		return exchangeId.compareTo(exchange.exchangeId);
	}

}

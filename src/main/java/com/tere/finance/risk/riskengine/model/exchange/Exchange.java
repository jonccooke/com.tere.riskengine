package com.tere.finance.risk.riskengine.model.exchange;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.tere.finance.risk.riskengine.model.instrument.Instrument;
import com.tere.finance.risk.riskengine.model.referencedata.HolidayCalendar;

public class Exchange
{

	private String name;
	private Map<Instrument, HolidayCalendar> tradedInstruments;
	
	public Exchange()
	{
		tradedInstruments = new ConcurrentHashMap<Instrument, HolidayCalendar>();
	}

}

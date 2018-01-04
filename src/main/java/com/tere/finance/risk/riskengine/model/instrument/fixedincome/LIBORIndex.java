package com.tere.finance.risk.riskengine.model.instrument.fixedincome;

import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Currency;

import com.tere.finance.risk.riskengine.model.exceptions.ConstraintVoliationException;
import com.tere.finance.risk.riskengine.model.instrument.IborIndex;
import com.tere.finance.risk.riskengine.model.referencedata.DayCountConventionType;
import com.tere.finance.risk.riskengine.model.referencedata.HolidayCalendar;
import com.tere.finance.risk.riskengine.model.referencedata.Tenor;
import com.tere.finance.risk.riskengine.model.referencedata.TenorConvention;


public class LIBORIndex extends IborIndex
{

	public LIBORIndex(String indexName, Currency currency, boolean active,
			DayCountConventionType dayCount, HolidayCalendar fixingCalendar,
			int offsetDays, HolidayCalendar offsetCalendar,
			HolidayCalendar effectiveDateCalendar, Tenor tenor,
			TenorConvention tenorConvention, LocalTime fixingTime,
			ZoneId fixingZone) throws ConstraintVoliationException
	{
		super("LIBOR", currency, active, dayCount, fixingCalendar, offsetDays,
				offsetCalendar, effectiveDateCalendar, tenor, tenorConvention,
				fixingTime, fixingZone);
	}


}

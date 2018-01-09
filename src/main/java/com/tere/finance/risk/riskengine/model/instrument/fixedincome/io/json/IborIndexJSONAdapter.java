package com.tere.finance.risk.riskengine.model.instrument.fixedincome.io.json;

import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Currency;

import org.jglue.fluentjson.JsonBuilder;
import org.jglue.fluentjson.JsonBuilderFactory;
import org.jglue.fluentjson.JsonObjectBuilder;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.tere.finance.risk.riskengine.model.instrument.IborIndex;
import com.tere.finance.risk.riskengine.model.referencedata.DayCountConventionType;
import com.tere.finance.risk.riskengine.model.referencedata.HolidayCalendar;
import com.tere.finance.risk.riskengine.model.referencedata.Tenor;
import com.tere.finance.risk.riskengine.model.referencedata.TenorConvention;
import com.tere.finance.risk.riskengine.model.referencedata.io.json.HolidayCalendarJSONAdapter;
import com.tere.utils.io.json.JSONAdapter;
import com.tere.utils.io.json.JSONAdapterImpl;

public class IborIndexJSONAdapter extends JSONAdapterImpl<IborIndex>
		implements JSONAdapter<IborIndex>
{

	@Override
	public JsonBuilder toJsonBuilder(IborIndex value)
	{
		JsonObjectBuilder builder = JsonBuilderFactory.buildObject();

		builder
				.add("effectiveDate", value.getEffectiveDate() == null ? null : value.getEffectiveDate().toString())
				.add("instrumentName", value.getInstrumentName())
				.add("securitised", value.getSecuritised())
				.add("instrumentId", value.getInstrumentId())
				.add("offsetDays", value.getOffsetDays())
				.add("conventionType", value.getConventionType() == null ? null : value.getConventionType().name())
				.add("currency", value.getCurrency().getCurrencyCode())
				.add("tenor", value.getTenor().name())
				.add("tenorConvention", value.getTenorConvention().name())
				.add("active", value.isActive())
							.add("dayCount", value.getConventionType() == null ? null : value.getDayCount().name())
				.add("effectiveDateCalendar",
						new HolidayCalendarJSONAdapter().toJsonBuilder(
								value.getEffectiveDateCalendar()))
				.add("fixingDateCalendar",
						new HolidayCalendarJSONAdapter()
								.toJsonBuilder(value.getFixingCalendar()))
				.add("offsetDateCalendar",
						new HolidayCalendarJSONAdapter()
								.toJsonBuilder(value.getOffsetCalendar()))
				.add("dayCount", value.getConventionType() == null ? null : value.getTenor().name())
				.add("fixingTime", value.getFixingTime() == null ? null : value.getFixingTime().toString())
				.add("fixingZone", value.getFixingZone() == null ? null : value.getFixingZone().getId());
		return builder;
	}

	@Override
	public IborIndex fromJson(JsonElement jsonElement)
	{
		if (null == jsonElement)
		{
			return null;
		}

		JsonObject jsonObject = jsonElement.getAsJsonObject();

		String indexName = jsonObject.get("instrumentName").getAsString();
		Currency currency = Currency
				.getInstance(jsonObject.get("currency").getAsString());
		boolean active = jsonObject.get("active").getAsBoolean();
		DayCountConventionType dayCount = jsonObject.get("dayCount").isJsonNull() ? null : DayCountConventionType
				.valueOf(jsonObject.get("dayCount").getAsString());
		HolidayCalendarJSONAdapter holidayCalendarJSONAdapter = new HolidayCalendarJSONAdapter();
		HolidayCalendar fixingCalendar = holidayCalendarJSONAdapter
				.fromJson(jsonObject.get("fixingCalendar"));
		int offsetDays = jsonObject.get("offsetDays").getAsInt();
		HolidayCalendar offsetCalendar = holidayCalendarJSONAdapter
				.fromJson(jsonObject.get("offsetCalendar"));
		HolidayCalendar effectiveDateCalendar = holidayCalendarJSONAdapter
				.fromJson(jsonObject.get("effectiveDateCalendar"));
		Tenor tenor = jsonObject.get("tenor").isJsonNull() ? null : Tenor.valueOf(jsonObject.get("tenor").getAsString());
		TenorConvention tenorConvention = TenorConvention
				.valueOf(jsonObject.get("tenorConvention").getAsString());
		LocalTime fixingTime = LocalTime
				.parse(jsonObject.get("fixingTime").getAsString());
		ZoneId fixingZone = ZoneId
				.of(jsonObject.get("fixingZone").getAsString());

		return new IborIndex(indexName, currency, active, dayCount,
				fixingCalendar, offsetDays, offsetCalendar,
				effectiveDateCalendar, tenor, tenorConvention, fixingTime,
				fixingZone);
	}

}

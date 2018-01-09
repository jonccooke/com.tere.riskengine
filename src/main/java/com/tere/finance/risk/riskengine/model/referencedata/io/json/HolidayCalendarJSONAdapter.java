package com.tere.finance.risk.riskengine.model.referencedata.io.json;

import java.util.function.Consumer;

import org.jglue.fluentjson.JsonArrayBuilder;
import org.jglue.fluentjson.JsonBuilder;
import org.jglue.fluentjson.JsonBuilderFactory;
import org.jglue.fluentjson.JsonObjectBuilder;
import org.joda.time.LocalDate;
import org.joda.time.LocalTime;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.tere.finance.risk.riskengine.model.referencedata.Country;
import com.tere.finance.risk.riskengine.model.referencedata.HolidayCalendar;
import com.tere.finance.risk.riskengine.model.referencedata.TradingCalendarDay;
import com.tere.finance.risk.riskengine.model.referencedata.TradingCalendarDay.Status;
import com.tere.utils.io.json.JSONAdapter;
import com.tere.utils.io.json.JSONAdapterImpl;

public class HolidayCalendarJSONAdapter extends JSONAdapterImpl<HolidayCalendar>
		implements JSONAdapter<HolidayCalendar>
{

	@Override
	public JsonBuilder toJsonBuilder(HolidayCalendar value)
	{
		JsonObjectBuilder builder = JsonBuilderFactory.buildObject();

		builder.add("holidayCalendarId", value.getHolidayCalendarId()).add(
				"country",
				new CountryJSONAdapter().toJsonBuilder(value.getCountry()));
		JsonArrayBuilder days = builder.addArray("days");

		for (TradingCalendarDay tradingCalendarDay : value.getTradingDays())
		{
			days.addObject()
					.add("date", tradingCalendarDay.getDate().toString())
					.add("marketClose",
							tradingCalendarDay.getMarketClose().toString())
					.add("marketOpen",
							tradingCalendarDay.getMarketOpen().toString())
					.add("postMarketOpen",
							tradingCalendarDay.getPostMarketClose().toString())
					.add("postMarketClose",
							tradingCalendarDay.getPostMarketOpen().toString())
					.add("preMarketClose",
							tradingCalendarDay.getPreMarketClose().toString())
					.add("pretMarketOpen",
							tradingCalendarDay.getPreMarketOpen().toString())
					.add("status", tradingCalendarDay.getStatus().name()).end();
		}
		days.end();
		return builder;
	}

	@Override
	public HolidayCalendar fromJson(JsonElement jsonElement)
	{
		if (null == jsonElement)
		{
			return null;
		}
		JsonObject jsonObject = jsonElement.getAsJsonObject();

		String holidayCalendarId = jsonObject.get("holidayCalendarId")
				.getAsString();
		Country country = new CountryJSONAdapter()
				.fromJson(jsonObject.get("country"));

		HolidayCalendar holidayCalendar = new HolidayCalendar(holidayCalendarId,
				country);

		jsonObject.getAsJsonArray("days").forEach(new Consumer<JsonElement>()
		{

			@Override
			public void accept(JsonElement element)
			{
				JsonObject jsonObject = element.getAsJsonObject();
				LocalDate date = LocalDate
						.parse(jsonObject.get("date").getAsString());
				Status status = Status
						.valueOf(jsonObject.get("status").getAsString());
				LocalTime preMarketOpen = LocalTime
						.parse(jsonObject.get("preMarketOpen").getAsString());
				LocalTime preMarketClose = LocalTime
						.parse(jsonObject.get("preMarketClose").getAsString());
				LocalTime marketOpen = LocalTime
						.parse(jsonObject.get("marketOpen").getAsString());
				LocalTime marketClose = LocalTime
						.parse(jsonObject.get("marketClose").getAsString());
				LocalTime postMarketOpen = LocalTime
						.parse(jsonObject.get("postMarketOpen").getAsString());
				LocalTime postMarketClose = LocalTime
						.parse(jsonObject.get("postMarketClose").getAsString());

				holidayCalendar.setTradingDay(date,
						new TradingCalendarDay(date, status, preMarketOpen,
								preMarketClose, marketOpen, marketClose,
								postMarketOpen, postMarketClose));
			}
		});

		return holidayCalendar;
	}
}

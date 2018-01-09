package com.tere.finance.risk.riskengine.model.valuation.io.json;

import java.util.Currency;
import java.util.function.Consumer;

import org.jglue.fluentjson.JsonArrayBuilder;
import org.jglue.fluentjson.JsonBuilder;
import org.jglue.fluentjson.JsonBuilderFactory;
import org.jglue.fluentjson.JsonObjectBuilder;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.tere.finance.risk.riskengine.model.referencedata.DayCountConventionType;
import com.tere.finance.risk.riskengine.model.referencedata.HolidayCalendar;
import com.tere.finance.risk.riskengine.model.referencedata.Tenor;
import com.tere.finance.risk.riskengine.model.referencedata.io.json.HolidayCalendarJSONAdapter;
import com.tere.finance.risk.riskengine.model.valuation.Curve;
import com.tere.finance.risk.riskengine.model.valuation.CurvePoint;
import com.tere.utils.io.json.JSONAdapter;
import com.tere.utils.io.json.JSONAdapterImpl;

public class CurveJSONAdapter extends JSONAdapterImpl<Curve>
		implements JSONAdapter<Curve>
{

	@Override
	public JsonBuilder toJsonBuilder(Curve value)
	{
		JsonObjectBuilder builder = JsonBuilderFactory.buildObject();
		builder.add("curveName", value.getCurveName())
				.add("effectiveDate", value.getEffectiveDate().toString())
				.add("currency", value.getCurrency().getCurrencyCode())
				.add("badDayConvention", value.getBadDayConvention().name())
				.add("dayConvention", value.getDayConvention().name())
				.add("calendar",
						new HolidayCalendarJSONAdapter()
								.toJsonBuilder(value.getCalendar()))
				.add("snaptime", value.getSnaptime().toString())
				.add("spotdate", value.getSpotdate().toString());

		JsonArrayBuilder curvePoints = builder.addArray("points");

		for (CurvePoint curvePoint : value.getPoints())
		{
			curvePoints.addObject().add("date", curvePoint.getDate().toString())
					.add("tenor", curvePoint.getTenor().name())
					.add("point", curvePoint.getPoint());
		}
		return builder;
	}

	@Override
	public Curve fromJson(JsonElement jsonElement)
	{
		if (null == jsonElement)
		{
			return null;
		}

		JsonObject jsonObject = jsonElement.getAsJsonObject();

		String curveName = jsonObject.get("curveName").getAsString();
		LocalDate effectiveDate = LocalDate
				.parse(jsonObject.get("effectiveDate").getAsString());
		Currency currency = Currency
				.getInstance(jsonObject.get("currency").getAsString());
		DayCountConventionType badDayConvention = DayCountConventionType
				.valueOf(jsonObject.get("badDayConvention").getAsString());
		DayCountConventionType dayConvention = DayCountConventionType
				.valueOf(jsonObject.get("dayConvention").getAsString());
		HolidayCalendarJSONAdapter holidayCalendarJSONAdapter = new HolidayCalendarJSONAdapter();
		HolidayCalendar calendar = holidayCalendarJSONAdapter
				.fromJson(jsonObject.get("calendar"));
		DateTime snaptime = DateTime
				.parse(jsonObject.get("snaptime").getAsString());
		LocalDate spotdate = LocalDate
				.parse(jsonObject.get("spotdate").getAsString());

		Curve curve = new Curve(curveName, effectiveDate, currency,
				badDayConvention, dayConvention, snaptime, spotdate, calendar);
		
		jsonObject.getAsJsonArray("points").forEach(new Consumer<JsonElement>()
		{

			@Override
			public void accept(JsonElement element)
			{
				JsonObject jsonObject = element.getAsJsonObject();
				LocalDate pointDate = LocalDate
						.parse(jsonObject.get("date").getAsString());
				Tenor tenor = Tenor
						.valueOf(jsonObject.get("tenor").getAsString());
				double point = jsonObject.get("point").getAsDouble();
				
				curve.setCurvePoint(new CurvePoint(tenor, pointDate, point));
			}
		});
		return curve;
	}

}

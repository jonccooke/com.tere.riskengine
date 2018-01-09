package com.tere.finance.risk.riskengine.model.instrument.fixedincome.io.json;

import org.jglue.fluentjson.JsonBuilder;
import org.jglue.fluentjson.JsonBuilderFactory;
import org.jglue.fluentjson.JsonObjectBuilder;
import org.joda.time.DateTime;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.tere.finance.risk.riskengine.model.instrument.IborIndex;
import com.tere.finance.risk.riskengine.model.instrument.fixedincome.IborInterestRateSwap;
import com.tere.finance.risk.riskengine.model.valuation.Curve;
import com.tere.finance.risk.riskengine.model.valuation.io.json.CurveJSONAdapter;
import com.tere.logging.LogManager;
import com.tere.logging.Logger;
import com.tere.utils.io.json.JSONAdapter;
import com.tere.utils.io.json.JSONAdapterImpl;

public class VanillaFixedVsLibor3mSwapPvJSONAdapter
		extends JSONAdapterImpl<IborInterestRateSwapPvDAO>
		implements JSONAdapter<IborInterestRateSwapPvDAO>
{
	static final Logger logger = LogManager
			.getLogger(VanillaFixedVsLibor3mSwapPvJSONAdapter.class);
	private DateTime valuationDate = null;
	private IborIndex iborIndex = null;
	private Curve yeildCurve = null;
	private IborInterestRateSwap iborInterestRateSwap = null;

	public JsonBuilder toJsonBuilder(DateTime valuationDate,
			IborIndex iborIndex, Curve yeildCurve,
			IborInterestRateSwap iborInterestRateSwap)
	{
		JsonObjectBuilder requestBuilder = JsonBuilderFactory.buildObject();
		requestBuilder.add("valuationDate", valuationDate.toString())
				.add("index",
						new IborIndexJSONAdapter().toJsonBuilder(iborIndex))
				.add("yeildCurve",
						new CurveJSONAdapter().toJsonBuilder(yeildCurve))
				.add("swap", new IborInterestRateSwapJSONAdapter()
						.toJsonBuilder(iborInterestRateSwap));
		return requestBuilder;
	}

	@Override
	public JsonBuilder toJsonBuilder(IborInterestRateSwapPvDAO value)
	{
		JsonObjectBuilder requestBuilder = JsonBuilderFactory.buildObject();

		requestBuilder.add("valuationDate", valuationDate.toString())
				.add("index",
						new IborIndexJSONAdapter().toJsonBuilder(iborIndex))
				.add("yeildCurve",
						new CurveJSONAdapter().toJsonBuilder(yeildCurve))
				.add("swap", new IborInterestRateSwapJSONAdapter()
						.toJsonBuilder(iborInterestRateSwap));
		return requestBuilder;
	}

	@Override
	public IborInterestRateSwapPvDAO fromJson(JsonElement jsonElement)
	{
		JsonObject jsonObject = jsonElement.getAsJsonObject();
		DateTime valuationDate = DateTime
				.parse(jsonObject.get("valuationDate").getAsString());
		IborIndex iborIndex = new IborIndexJSONAdapter()
				.fromJson(jsonObject.get("index"));
		Curve yeildCurve = new CurveJSONAdapter()
				.fromJson(jsonObject.get("yeildCurve"));
		IborInterestRateSwap iborInterestRateSwap = new IborInterestRateSwapJSONAdapter()
				.fromJson(jsonObject.get("swap"));
		return new IborInterestRateSwapPvDAO(valuationDate, iborIndex, yeildCurve, iborInterestRateSwap);
	}

}

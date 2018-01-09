package com.tere.finance.risk.riskengine.model.instrument.fixedincome.io.json;

import org.jglue.fluentjson.JsonBuilder;
import org.jglue.fluentjson.JsonBuilderFactory;
import org.jglue.fluentjson.JsonObjectBuilder;
import org.joda.time.LocalDate;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.tere.finance.risk.riskengine.model.instrument.IborIndex;
import com.tere.finance.risk.riskengine.model.instrument.fixedincome.IborInterestRateSwap;
import com.tere.finance.risk.riskengine.model.referencedata.Frequency;
import com.tere.utils.io.json.JSONAdapter;
import com.tere.utils.io.json.JSONAdapterImpl;

public class IborInterestRateSwapJSONAdapter
		extends JSONAdapterImpl<IborInterestRateSwap>
		implements JSONAdapter<IborInterestRateSwap>
{

	@Override
	public JsonBuilder toJsonBuilder(IborInterestRateSwap value)
	{
		JsonObjectBuilder builder = JsonBuilderFactory.buildObject();

		builder.add("instrumentName", value.getInstrumentName())
				.add("securitised", value.getSecuritised())
				.add("instrumentId", value.getInstrumentId())
				.add("notional", value.getNotional())
				.add("issueDate", value.getIssueDate().toString())
				.add("maturityDate", value.getMaturityDate().toString())
				.add("couponFrequency", value.getCouponFrequency().name())
				.add("fixedRate", value.getFixedRate())
				.add("floatingSpread", value.getFloatingSpread())
				.add("index", new IborIndexJSONAdapter()
						.toJsonBuilder(value.getIndex()));
		return builder;
	}

	@Override
	public IborInterestRateSwap fromJson(JsonElement jsonElement)
	{
		JsonObject jsonObject = jsonElement.getAsJsonObject();

		double fixedRate = jsonObject.get("fixedRate").getAsDouble();
		double floatingSpread = jsonObject.get("floatingSpread").getAsDouble();
		IborIndex index = new IborIndexJSONAdapter()
				.fromJson(jsonObject.get("jsonElement"));
		long notional = jsonObject.get("notional").getAsLong();
		LocalDate issueDate = LocalDate
				.parse(jsonObject.get("issueDate").getAsString());
		LocalDate maturityDate = LocalDate
				.parse(jsonObject.get("maturityDate").getAsString());
		Frequency couponFrequency = Frequency
				.valueOf(jsonObject.get("couponFrequency").getAsString());

		return new IborInterestRateSwap(fixedRate, floatingSpread, index,
				notional, issueDate, maturityDate, couponFrequency);

	}

}

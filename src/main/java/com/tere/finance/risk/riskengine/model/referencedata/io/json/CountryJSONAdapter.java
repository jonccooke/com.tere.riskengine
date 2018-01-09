package com.tere.finance.risk.riskengine.model.referencedata.io.json;

import org.jglue.fluentjson.JsonBuilder;
import org.jglue.fluentjson.JsonBuilderFactory;
import org.jglue.fluentjson.JsonObjectBuilder;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.tere.finance.risk.riskengine.model.referencedata.Country;
import com.tere.utils.io.json.JSONAdapter;
import com.tere.utils.io.json.JSONAdapterImpl;

public class CountryJSONAdapter extends JSONAdapterImpl<Country> implements JSONAdapter<Country>
{

	@Override
	public JsonBuilder toJsonBuilder(Country value)
	{
		JsonObjectBuilder builder = JsonBuilderFactory.buildObject();

		builder.add("countryId", value.getCountryId())
				.add("countryName", value.getCountryName())
				.add("alpha2", value.getAlpha2())
				.add("alpha3", value.getAlpha3())
				.add("iSONumber", value.getiSONumber()).end();
		return builder;
	}

	@Override
	public Country fromJson(JsonElement jsonElement)
	{
		if (null == jsonElement)
		{
			return null;
		}

		JsonObject jsonObject = jsonElement.getAsJsonObject();

		int countryId = jsonObject.get("countryId").getAsInt();
		String countryName= jsonObject.get("countryName").getAsString();
		String alpha2= jsonObject.get("alpha2").getAsString();
		String alpha3= jsonObject.get("alpha3").getAsString();
		String iSONumber= jsonObject.get("iSONumber").getAsString();
		
		Country country = new Country(countryId, countryName, alpha2, alpha3, iSONumber);
		
		return country;
	}



}

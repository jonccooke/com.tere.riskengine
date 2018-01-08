package com.tere.finance.risk.riskengine.model.instrument;

import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.tere.finance.risk.riskengine.model.exceptions.ConstraintVoliationException;
import com.tere.finance.risk.riskengine.model.exceptions.LengthExceededException;

public class Instrument implements Comparable, Serializable
{
	public static String INSTRUMENTID_PROPERTY = "Instrument.instrumentId.property";
	public static String INSTRUMENTNAME_PROPERTY = "Instrument.instrumentName.property";
	public static String SECURITISED_PROPERTY = "Instrument.securitised.property";
	protected Long instrumentId;
	protected String instrumentName;
	protected Boolean securitised;

	protected Map<String, String> externalReferences  = new ConcurrentHashMap<String, String>();
	
	public Instrument()
	{
	}

	public Instrument(Long instrumentId, String instrumentName,
			Boolean securitised) throws ConstraintVoliationException
	{
		this.instrumentId = instrumentId;
		this.instrumentName = instrumentName;
		this.securitised = securitised;
	}

	public void setInstrumentId(Long instrumentId)
			throws ConstraintVoliationException
	{
		if (null != instrumentId)
		{
		}
		this.instrumentId = instrumentId;
	}

	public Long getInstrumentId()
	{
		return instrumentId;
	}

	public void setInstrumentName(String instrumentName)
			throws ConstraintVoliationException
	{
		if (null != instrumentName)
		{
			if (instrumentName.length() > 50)
			{
				throw new LengthExceededException(
						"$classReflect.getLabelName($param)", 50,
						instrumentName.length());
			}
		}
		this.instrumentName = instrumentName;
	}

	public String getInstrumentName()
	{
		return instrumentName;
	}

	public void setSecuritised(Boolean securitised)
			throws ConstraintVoliationException
	{
		if (null != securitised)
		{
		}
		this.securitised = securitised;
	}

	public Boolean getSecuritised()
	{
		return securitised;
	}


	@Override
	public String toString()
	{
		return "{\"instrumentId\":\"" + instrumentId + "\", \"instrumentName\":\""
				+ instrumentName + "\", \"securitised\":\"" + securitised
				+ "\", \"externalReferences\":" + externalReferences + " ";
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((instrumentId == null) ? 0 : instrumentId.hashCode());
		result = prime * result
				+ ((instrumentName == null) ? 0 : instrumentName.hashCode());
		result = prime * result
				+ ((securitised == null) ? 0 : securitised.hashCode());
		return result;
	}

	public int compareTo(Object obj)
	{
		final int BEFORE = -1;
		final int EQUAL = 0;
		final int AFTER = 1;

		if (this == obj)
			return EQUAL;
		if (obj == null)
			return BEFORE;
		if (getClass() != obj.getClass())
			return BEFORE;
		Instrument other = (Instrument) obj;
		int comp = 0;
		if (instrumentId == null)
		{
			if (other.instrumentId != null)
				return BEFORE;
		}
		comp = instrumentId.compareTo(other.instrumentId);
		if (EQUAL != comp)
		{
			return comp;
		}
		if (instrumentName == null)
		{
			if (other.instrumentName != null)
				return BEFORE;
		}
		comp = instrumentName.compareTo(other.instrumentName);
		if (EQUAL != comp)
		{
			return comp;
		}
		if (securitised == null)
		{
			if (other.securitised != null)
				return BEFORE;
		}
		comp = securitised.compareTo(other.securitised);
		if (EQUAL != comp)
		{
			return comp;
		}
		return comp;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Instrument other = (Instrument) obj;
		if (instrumentId == null)
		{
			if (other.instrumentId != null)
				return false;
		}
		else if (!instrumentId.equals(other.instrumentId))
			return false;
		if (instrumentName == null)
		{
			if (other.instrumentName != null)
				return false;
		}
		else if (!instrumentName.equals(other.instrumentName))
			return false;
		if (securitised == null)
		{
			if (other.securitised != null)
				return false;
		}
		else if (!securitised.equals(other.securitised))
			return false;
		return super.equals(obj);
	}

}

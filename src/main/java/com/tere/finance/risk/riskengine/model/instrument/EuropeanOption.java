package com.tere.finance.risk.riskengine.model.instrument;

import java.io.Serializable;

import com.tere.finance.risk.riskengine.model.exceptions.ConstraintVoliationException;
import com.tere.finance.risk.riskengine.model.referencedata.Sector;
import com.tere.finance.risk.riskengine.model.trade.OTCTrade;

public class EuropeanOption extends OTCTrade implements Comparable,
		Serializable
{
	public static String DIVIDEND_PROPERTY = "EuropeanOption.dividend.property";
	public static String MATURITYDATE_PROPERTY = "EuropeanOption.maturityDate.property";
	public static String OPTIONTYPE_PROPERTY = "EuropeanOption.optionType.property";
	public static String STOCK_PROPERTY = "EuropeanOption.stock.property";
	protected java.math.BigDecimal dividend;
	protected java.util.Date maturityDate;
	protected OptionType optionType;
	protected Instrument stock;

	public EuropeanOption()
	{
	}

	public EuropeanOption(java.math.BigDecimal strike, String counterpartyName,
			Long tradeId, java.math.BigDecimal notional,
			String externalTradeId, java.util.Date tradeDate,
			java.util.Date settlementDate, java.math.BigDecimal dividend,
			java.util.Date maturityDate, OptionType optionType,
			com.tere.finance.risk.riskengine.model.referencedata.Counterparty counterpartyId,
			com.tere.finance.risk.riskengine.model.instrument.Instrument instrument,
			com.tere.finance.risk.riskengine.model.referencedata.Country countryId,
			com.tere.finance.risk.riskengine.model.referencedata.Sector sectorId,
			com.tere.finance.risk.riskengine.model.instrument.Instrument stock)
			throws ConstraintVoliationException
	{
		this.strike = strike;
		this.counterpartyName = counterpartyName;
		this.tradeId = tradeId;
		this.notional = notional;
		this.externalTradeId = externalTradeId;
		this.tradeDate = tradeDate;
		this.settlementDate = settlementDate;
		this.dividend = dividend;
		this.maturityDate = maturityDate;
		this.optionType = optionType;
		this.buyCounterparty = counterpartyId;
		this.instrument = instrument;
		this.countryId = countryId;
		this.sectorId = sectorId;
		this.stock = stock;
	}

	public void setDividend(java.math.BigDecimal dividend)
			throws ConstraintVoliationException
	{
		if (null != dividend)
		{
		}
		this.dividend = dividend;
	}

	public java.math.BigDecimal getDividend()
	{
		return dividend;
	}

	public void setMaturityDate(java.util.Date maturityDate)
			throws ConstraintVoliationException
	{
		if (null != maturityDate)
		{
		}
		this.maturityDate = maturityDate;
	}

	public java.util.Date getMaturityDate()
	{
		return maturityDate;
	}

	public void setOptionType(OptionType optionType)
			throws ConstraintVoliationException
	{
		if (null != optionType)
		{
		}
		this.optionType = optionType;
	}

	public OptionType getOptionType()
	{
		return optionType;
	}

	public void setStock(Instrument stock) throws ConstraintVoliationException
	{
		this.stock = stock;
	}

	public Instrument getStock()
	{
		return stock;
	}

	public String toString()
	{
		StringBuffer buf = new StringBuffer();
		buf.append("dividend");
		buf.append("='");
		buf.append(dividend);
		buf.append("'");

		buf.append("maturityDate");
		buf.append("='");
		buf.append(maturityDate);
		buf.append("'");

		buf.append("optionType");
		buf.append("='");
		buf.append(optionType);
		buf.append("'");
		return buf.toString();
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((dividend == null) ? 0 : dividend.hashCode());
		result = prime * result
				+ ((maturityDate == null) ? 0 : maturityDate.hashCode());
		result = prime * result
				+ ((optionType == null) ? 0 : optionType.hashCode());
		result = prime * result + ((stock == null) ? 0 : stock.hashCode());
		return result;
	}

	@Override
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
		EuropeanOption other = (EuropeanOption) obj;
		int comp = 0;
		if (dividend == null)
		{
			if (other.dividend != null)
				return BEFORE;
		}
		comp = dividend.compareTo(other.dividend);
		if (EQUAL != comp)
		{
			return comp;
		}
		if (maturityDate == null)
		{
			if (other.maturityDate != null)
				return BEFORE;
		}
		comp = maturityDate.compareTo(other.maturityDate);
		if (EQUAL != comp)
		{
			return comp;
		}
		if (optionType == null)
		{
			if (other.optionType != null)
				return BEFORE;
		}
		comp = optionType.compareTo(other.optionType);
		if (EQUAL != comp)
		{
			return comp;
		}
		if (stock == null)
		{
			if (other.stock != null)
				return BEFORE;
		}
		comp = stock.compareTo(other.stock);
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
		EuropeanOption other = (EuropeanOption) obj;
		if (dividend == null)
		{
			if (other.dividend != null)
				return false;
		}
		else if (!dividend.equals(other.dividend))
			return false;
		if (maturityDate == null)
		{
			if (other.maturityDate != null)
				return false;
		}
		else if (!maturityDate.equals(other.maturityDate))
			return false;
		if (optionType == null)
		{
			if (other.optionType != null)
				return false;
		}
		else if (!optionType.equals(other.optionType))
			return false;
		if (stock == null)
		{
			if (other.stock != null)
				return false;
		}
		else if (!stock.equals(other.stock))
			return false;
		return super.equals(obj);
	}

}

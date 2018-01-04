package com.tere.finance.risk.riskengine.model.referencedata;

import java.io.Serializable;

import com.tere.finance.risk.riskengine.model.exceptions.ConstraintVoliationException;
import com.tere.finance.risk.riskengine.model.exceptions.LengthExceededException;
import com.tere.finance.risk.riskengine.model.exceptions.ManditoryElementNotSpecifiedException;
import com.tere.finance.risk.riskengine.model.risk.Facility;
public  class Collateral implements Comparable, Serializable
{
	public static String CLIENTTYPE_PROPERTY = "Collateral.clientType.property";
	public static String COLLATERALNAME_PROPERTY = "Collateral.collateralName.property";
	public static String COLLATERALCCY_PROPERTY = "Collateral.collateralCcy.property";
	public static String COLLATERALCURRENTPROPOSED_PROPERTY = "Collateral.collateralCurrentProposed.property";
	public static String COLLATERALEXPIRYDATE_PROPERTY = "Collateral.collateralExpiryDate.property";
	public static String COLLATERALPROVIDER_PROPERTY = "Collateral.collateralProvider.property";
	public static String COLLATERALVALUE_PROPERTY = "Collateral.collateralValue.property";
	public static String COLLATERALVALUEINGBP_PROPERTY = "Collateral.collateralValueInGbp.property";
	public static String COUNTRYOFISSUEORASSETS_PROPERTY = "Collateral.countryOfIssueOrAssets.property";
	public static String FACILITYSECUREDAMOUNTGBP_PROPERTY = "Collateral.facilitySecuredAmountGbp.property";
	public static String LIMITINGBP_PROPERTY = "Collateral.limitInGbp.property";
	public static String RISKFACTOR_PROPERTY = "Collateral.riskFactor.property";
	public static String SECUREDAMOUNT_PROPERTY = "Collateral.securedAmount.property";
	public static String SECUREDCCY_PROPERTY = "Collateral.securedCcy.property";
	public static String COLLATERALID_PROPERTY = "Collateral.collateralId.property";
	public static String FACILITYLIMITINGBP_PROPERTY = "Collateral.facilityLimitInGbp.property";
	public static String COLLATERALTYPE_PROPERTY = "Collateral.collateralType.property";
	public static String COLLATERALCOUNTERPARTY_PROPERTY = "Collateral.collateralCounterParty.property";
	public static String FAC_PROPERTY = "Collateral.fac.property";
	protected String clientType; 
	protected String collateralName; 
	protected String collateralCcy; 
	protected String collateralCurrentProposed; 
	protected java.util.Date collateralExpiryDate; 
	protected String collateralProvider; 
	protected String collateralValue; 
	protected String collateralValueInGbp; 
	protected String countryOfIssueOrAssets; 
	protected java.math.BigDecimal facilitySecuredAmountGbp; 
	protected String limitInGbp; 
	protected String riskFactor; 
	protected String securedAmount; 
	protected String securedCcy; 
	protected Long collateralId; 
	protected String facilityLimitInGbp; 
	protected String collateralType; 
	protected Counterparty collateralCounterParty; 
	protected Facility fac; 

	public Collateral()
	{
	}
	
	public Collateral(String clientType, String collateralName, String collateralCcy, String collateralCurrentProposed, java.util.Date collateralExpiryDate, String collateralProvider, String collateralValue, String collateralValueInGbp, String countryOfIssueOrAssets, java.math.BigDecimal facilitySecuredAmountGbp, String limitInGbp, String riskFactor, String securedAmount, String securedCcy, Long collateralId, String facilityLimitInGbp, String collateralType, com.tere.finance.risk.riskengine.model.referencedata.Counterparty collateralCounterParty, com.tere.finance.risk.riskengine.model.risk.Facility fac) throws ConstraintVoliationException
	{
		this.clientType = clientType;
		this.collateralName = collateralName;
		this.collateralCcy = collateralCcy;
		this.collateralCurrentProposed = collateralCurrentProposed;
		this.collateralExpiryDate = collateralExpiryDate;
		this.collateralProvider = collateralProvider;
		this.collateralValue = collateralValue;
		this.collateralValueInGbp = collateralValueInGbp;
		this.countryOfIssueOrAssets = countryOfIssueOrAssets;
		this.facilitySecuredAmountGbp = facilitySecuredAmountGbp;
		this.limitInGbp = limitInGbp;
		this.riskFactor = riskFactor;
		this.securedAmount = securedAmount;
		this.securedCcy = securedCcy;
		this.collateralId = collateralId;
		this.facilityLimitInGbp = facilityLimitInGbp;
		this.collateralType = collateralType;
		this.collateralCounterParty = collateralCounterParty;
		this.fac = fac;
	}

	public void setClientType(String clientType) throws ConstraintVoliationException
	{
		if (null != clientType)
		{
			if (clientType.length() > 1000)
			{
				throw new LengthExceededException("$classReflect.getLabelName($param)", 1000, clientType.length());
			}
		}
		this.clientType = clientType;
	}
	public String getClientType()
	{
		return clientType;
	}
	public void setCollateralName(String collateralName) throws ConstraintVoliationException
	{
		if (null != collateralName)
		{
			if (collateralName.length() > 1000)
			{
				throw new LengthExceededException("$classReflect.getLabelName($param)", 1000, collateralName.length());
			}
		}
		this.collateralName = collateralName;
	}
	public String getCollateralName()
	{
		return collateralName;
	}
	public void setCollateralCcy(String collateralCcy) throws ConstraintVoliationException
	{
		if (null != collateralCcy)
		{
			if (collateralCcy.length() > 1000)
			{
				throw new LengthExceededException("$classReflect.getLabelName($param)", 1000, collateralCcy.length());
			}
		}
		this.collateralCcy = collateralCcy;
	}
	public String getCollateralCcy()
	{
		return collateralCcy;
	}
	public void setCollateralCurrentProposed(String collateralCurrentProposed) throws ConstraintVoliationException
	{
		if (null != collateralCurrentProposed)
		{
			if (collateralCurrentProposed.length() > 1000)
			{
				throw new LengthExceededException("$classReflect.getLabelName($param)", 1000, collateralCurrentProposed.length());
			}
		}
		this.collateralCurrentProposed = collateralCurrentProposed;
	}
	public String getCollateralCurrentProposed()
	{
		return collateralCurrentProposed;
	}
	public void setCollateralExpiryDate(java.util.Date collateralExpiryDate) throws ConstraintVoliationException
	{
		if (null != collateralExpiryDate)
		{
		}
		this.collateralExpiryDate = collateralExpiryDate;
	}
	public java.util.Date getCollateralExpiryDate()
	{
		return collateralExpiryDate;
	}
	public void setCollateralProvider(String collateralProvider) throws ConstraintVoliationException
	{
		if (null != collateralProvider)
		{
			if (collateralProvider.length() > 1000)
			{
				throw new LengthExceededException("$classReflect.getLabelName($param)", 1000, collateralProvider.length());
			}
		}
		this.collateralProvider = collateralProvider;
	}
	public String getCollateralProvider()
	{
		return collateralProvider;
	}
	public void setCollateralValue(String collateralValue) throws ConstraintVoliationException
	{
		if (null != collateralValue)
		{
			if (collateralValue.length() > 1000)
			{
				throw new LengthExceededException("$classReflect.getLabelName($param)", 1000, collateralValue.length());
			}
		}
		this.collateralValue = collateralValue;
	}
	public String getCollateralValue()
	{
		return collateralValue;
	}
	public void setCollateralValueInGbp(String collateralValueInGbp) throws ConstraintVoliationException
	{
		if (null != collateralValueInGbp)
		{
			if (collateralValueInGbp.length() > 1000)
			{
				throw new LengthExceededException("$classReflect.getLabelName($param)", 1000, collateralValueInGbp.length());
			}
		}
		this.collateralValueInGbp = collateralValueInGbp;
	}
	public String getCollateralValueInGbp()
	{
		return collateralValueInGbp;
	}
	public void setCountryOfIssueOrAssets(String countryOfIssueOrAssets) throws ConstraintVoliationException
	{
		if (null != countryOfIssueOrAssets)
		{
			if (countryOfIssueOrAssets.length() > 1000)
			{
				throw new LengthExceededException("$classReflect.getLabelName($param)", 1000, countryOfIssueOrAssets.length());
			}
		}
		this.countryOfIssueOrAssets = countryOfIssueOrAssets;
	}
	public String getCountryOfIssueOrAssets()
	{
		return countryOfIssueOrAssets;
	}
	public void setFacilitySecuredAmountGbp(java.math.BigDecimal facilitySecuredAmountGbp) throws ConstraintVoliationException
	{
		if (null != facilitySecuredAmountGbp)
		{
		}
		this.facilitySecuredAmountGbp = facilitySecuredAmountGbp;
	}
	public java.math.BigDecimal getFacilitySecuredAmountGbp()
	{
		return facilitySecuredAmountGbp;
	}
	public void setLimitInGbp(String limitInGbp) throws ConstraintVoliationException
	{
		if (null != limitInGbp)
		{
			if (limitInGbp.length() > 1000)
			{
				throw new LengthExceededException("$classReflect.getLabelName($param)", 1000, limitInGbp.length());
			}
		}
		this.limitInGbp = limitInGbp;
	}
	public String getLimitInGbp()
	{
		return limitInGbp;
	}
	public void setRiskFactor(String riskFactor) throws ConstraintVoliationException
	{
		if (null != riskFactor)
		{
			if (riskFactor.length() > 1000)
			{
				throw new LengthExceededException("$classReflect.getLabelName($param)", 1000, riskFactor.length());
			}
		}
		this.riskFactor = riskFactor;
	}
	public String getRiskFactor()
	{
		return riskFactor;
	}
	public void setSecuredAmount(String securedAmount) throws ConstraintVoliationException
	{
		if (null != securedAmount)
		{
			if (securedAmount.length() > 1000)
			{
				throw new LengthExceededException("$classReflect.getLabelName($param)", 1000, securedAmount.length());
			}
		}
		this.securedAmount = securedAmount;
	}
	public String getSecuredAmount()
	{
		return securedAmount;
	}
	public void setSecuredCcy(String securedCcy) throws ConstraintVoliationException
	{
		if (null != securedCcy)
		{
			if (securedCcy.length() > 1000)
			{
				throw new LengthExceededException("$classReflect.getLabelName($param)", 1000, securedCcy.length());
			}
		}
		this.securedCcy = securedCcy;
	}
	public String getSecuredCcy()
	{
		return securedCcy;
	}
	public void setCollateralId(Long collateralId) throws ConstraintVoliationException
	{
		if (null != collateralId)
		{
		}
		this.collateralId = collateralId;
	}
	public Long getCollateralId()
	{
		return collateralId;
	}
	public void setFacilityLimitInGbp(String facilityLimitInGbp) throws ConstraintVoliationException
	{
		if (null != facilityLimitInGbp)
		{
			if (facilityLimitInGbp.length() > 1000)
			{
				throw new LengthExceededException("$classReflect.getLabelName($param)", 1000, facilityLimitInGbp.length());
			}
		}
		this.facilityLimitInGbp = facilityLimitInGbp;
	}
	public String getFacilityLimitInGbp()
	{
		return facilityLimitInGbp;
	}
	public void setCollateralType(String collateralType) throws ConstraintVoliationException
	{
		if (null != collateralType)
		{
			if (collateralType.length() > 1000)
			{
				throw new LengthExceededException("$classReflect.getLabelName($param)", 1000, collateralType.length());
			}
		}
		this.collateralType = collateralType;
	}
	public String getCollateralType()
	{
		return collateralType;
	}
	public void setCollateralCounterParty(Counterparty collateralCounterParty) throws ConstraintVoliationException
	{
		if (null == collateralCounterParty)
		{
			throw new ManditoryElementNotSpecifiedException("$classReflect.getLabelName($param)");
		}
		this.collateralCounterParty = collateralCounterParty;
	}
	public Counterparty getCollateralCounterParty()
	{
		return collateralCounterParty;
	}
	public void setFac(Facility fac) throws ConstraintVoliationException
	{
		if (null == fac)
		{
			throw new ManditoryElementNotSpecifiedException("$classReflect.getLabelName($param)");
		}
		this.fac = fac;
	}
	public Facility getFac()
	{
		return fac;
	}

	public String toString()
	{
		StringBuffer buf = new StringBuffer();
		buf.append("clientType");
		buf.append("='");
		buf.append(clientType);
		buf.append("'");

		buf.append("collateralName");
		buf.append("='");
		buf.append(collateralName);
		buf.append("'");

		buf.append("collateralCcy");
		buf.append("='");
		buf.append(collateralCcy);
		buf.append("'");

		buf.append("collateralCurrentProposed");
		buf.append("='");
		buf.append(collateralCurrentProposed);
		buf.append("'");

		buf.append("collateralExpiryDate");
		buf.append("='");
		buf.append(collateralExpiryDate);
		buf.append("'");

		buf.append("collateralProvider");
		buf.append("='");
		buf.append(collateralProvider);
		buf.append("'");

		buf.append("collateralValue");
		buf.append("='");
		buf.append(collateralValue);
		buf.append("'");

		buf.append("collateralValueInGbp");
		buf.append("='");
		buf.append(collateralValueInGbp);
		buf.append("'");

		buf.append("countryOfIssueOrAssets");
		buf.append("='");
		buf.append(countryOfIssueOrAssets);
		buf.append("'");

		buf.append("facilitySecuredAmountGbp");
		buf.append("='");
		buf.append(facilitySecuredAmountGbp);
		buf.append("'");

		buf.append("limitInGbp");
		buf.append("='");
		buf.append(limitInGbp);
		buf.append("'");

		buf.append("riskFactor");
		buf.append("='");
		buf.append(riskFactor);
		buf.append("'");

		buf.append("securedAmount");
		buf.append("='");
		buf.append(securedAmount);
		buf.append("'");

		buf.append("securedCcy");
		buf.append("='");
		buf.append(securedCcy);
		buf.append("'");

		buf.append("collateralId");
		buf.append("='");
		buf.append(collateralId);
		buf.append("'");

		buf.append("facilityLimitInGbp");
		buf.append("='");
		buf.append(facilityLimitInGbp);
		buf.append("'");

		buf.append("collateralType");
		buf.append("='");
		buf.append(collateralType);
		buf.append("'");
		return buf.toString();	
	}
	
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((clientType == null) ? 0 : clientType.hashCode());
		result = prime * result + ((collateralName == null) ? 0 : collateralName.hashCode());
		result = prime * result + ((collateralCcy == null) ? 0 : collateralCcy.hashCode());
		result = prime * result + ((collateralCurrentProposed == null) ? 0 : collateralCurrentProposed.hashCode());
		result = prime * result + ((collateralExpiryDate == null) ? 0 : collateralExpiryDate.hashCode());
		result = prime * result + ((collateralProvider == null) ? 0 : collateralProvider.hashCode());
		result = prime * result + ((collateralValue == null) ? 0 : collateralValue.hashCode());
		result = prime * result + ((collateralValueInGbp == null) ? 0 : collateralValueInGbp.hashCode());
		result = prime * result + ((countryOfIssueOrAssets == null) ? 0 : countryOfIssueOrAssets.hashCode());
		result = prime * result + ((facilitySecuredAmountGbp == null) ? 0 : facilitySecuredAmountGbp.hashCode());
		result = prime * result + ((limitInGbp == null) ? 0 : limitInGbp.hashCode());
		result = prime * result + ((riskFactor == null) ? 0 : riskFactor.hashCode());
		result = prime * result + ((securedAmount == null) ? 0 : securedAmount.hashCode());
		result = prime * result + ((securedCcy == null) ? 0 : securedCcy.hashCode());
		result = prime * result + ((collateralId == null) ? 0 : collateralId.hashCode());
		result = prime * result + ((facilityLimitInGbp == null) ? 0 : facilityLimitInGbp.hashCode());
		result = prime * result + ((collateralType == null) ? 0 : collateralType.hashCode());
		result = prime * result + ((collateralCounterParty == null) ? 0 : collateralCounterParty.hashCode());
		result = prime * result + ((fac == null) ? 0 : fac.hashCode());
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
		Collateral other = (Collateral) obj;
		int comp = 0;
		if (clientType == null)
		{
			if (other.clientType != null)
				return BEFORE;
		}
		comp = clientType.compareTo(other.clientType);
		if (EQUAL != comp)
		{
			return comp;
		}
		if (collateralName == null)
		{
			if (other.collateralName != null)
				return BEFORE;
		}
		comp = collateralName.compareTo(other.collateralName);
		if (EQUAL != comp)
		{
			return comp;
		}
		if (collateralCcy == null)
		{
			if (other.collateralCcy != null)
				return BEFORE;
		}
		comp = collateralCcy.compareTo(other.collateralCcy);
		if (EQUAL != comp)
		{
			return comp;
		}
		if (collateralCurrentProposed == null)
		{
			if (other.collateralCurrentProposed != null)
				return BEFORE;
		}
		comp = collateralCurrentProposed.compareTo(other.collateralCurrentProposed);
		if (EQUAL != comp)
		{
			return comp;
		}
		if (collateralExpiryDate == null)
		{
			if (other.collateralExpiryDate != null)
				return BEFORE;
		}
		comp = collateralExpiryDate.compareTo(other.collateralExpiryDate);
		if (EQUAL != comp)
		{
			return comp;
		}
		if (collateralProvider == null)
		{
			if (other.collateralProvider != null)
				return BEFORE;
		}
		comp = collateralProvider.compareTo(other.collateralProvider);
		if (EQUAL != comp)
		{
			return comp;
		}
		if (collateralValue == null)
		{
			if (other.collateralValue != null)
				return BEFORE;
		}
		comp = collateralValue.compareTo(other.collateralValue);
		if (EQUAL != comp)
		{
			return comp;
		}
		if (collateralValueInGbp == null)
		{
			if (other.collateralValueInGbp != null)
				return BEFORE;
		}
		comp = collateralValueInGbp.compareTo(other.collateralValueInGbp);
		if (EQUAL != comp)
		{
			return comp;
		}
		if (countryOfIssueOrAssets == null)
		{
			if (other.countryOfIssueOrAssets != null)
				return BEFORE;
		}
		comp = countryOfIssueOrAssets.compareTo(other.countryOfIssueOrAssets);
		if (EQUAL != comp)
		{
			return comp;
		}
		if (facilitySecuredAmountGbp == null)
		{
			if (other.facilitySecuredAmountGbp != null)
				return BEFORE;
		}
		comp = facilitySecuredAmountGbp.compareTo(other.facilitySecuredAmountGbp);
		if (EQUAL != comp)
		{
			return comp;
		}
		if (limitInGbp == null)
		{
			if (other.limitInGbp != null)
				return BEFORE;
		}
		comp = limitInGbp.compareTo(other.limitInGbp);
		if (EQUAL != comp)
		{
			return comp;
		}
		if (riskFactor == null)
		{
			if (other.riskFactor != null)
				return BEFORE;
		}
		comp = riskFactor.compareTo(other.riskFactor);
		if (EQUAL != comp)
		{
			return comp;
		}
		if (securedAmount == null)
		{
			if (other.securedAmount != null)
				return BEFORE;
		}
		comp = securedAmount.compareTo(other.securedAmount);
		if (EQUAL != comp)
		{
			return comp;
		}
		if (securedCcy == null)
		{
			if (other.securedCcy != null)
				return BEFORE;
		}
		comp = securedCcy.compareTo(other.securedCcy);
		if (EQUAL != comp)
		{
			return comp;
		}
		if (collateralId == null)
		{
			if (other.collateralId != null)
				return BEFORE;
		}
		comp = collateralId.compareTo(other.collateralId);
		if (EQUAL != comp)
		{
			return comp;
		}
		if (facilityLimitInGbp == null)
		{
			if (other.facilityLimitInGbp != null)
				return BEFORE;
		}
		comp = facilityLimitInGbp.compareTo(other.facilityLimitInGbp);
		if (EQUAL != comp)
		{
			return comp;
		}
		if (collateralType == null)
		{
			if (other.collateralType != null)
				return BEFORE;
		}
		comp = collateralType.compareTo(other.collateralType);
		if (EQUAL != comp)
		{
			return comp;
		}
		if (collateralCounterParty == null)
		{
			if (other.collateralCounterParty != null)
				return BEFORE;
		}
		comp = collateralCounterParty.compareTo(other.collateralCounterParty);
		if (EQUAL != comp)
		{
			return comp;
		}
		if (fac == null)
		{
			if (other.fac != null)
				return BEFORE;
		}
		comp = fac.compareTo(other.fac);
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
		Collateral other = (Collateral) obj;
		if (clientType == null)
		{
			if (other.clientType != null)
				return false;
		}
		else if (!clientType.equals(other.clientType))
			return false;
		if (collateralName == null)
		{
			if (other.collateralName != null)
				return false;
		}
		else if (!collateralName.equals(other.collateralName))
			return false;
		if (collateralCcy == null)
		{
			if (other.collateralCcy != null)
				return false;
		}
		else if (!collateralCcy.equals(other.collateralCcy))
			return false;
		if (collateralCurrentProposed == null)
		{
			if (other.collateralCurrentProposed != null)
				return false;
		}
		else if (!collateralCurrentProposed.equals(other.collateralCurrentProposed))
			return false;
		if (collateralExpiryDate == null)
		{
			if (other.collateralExpiryDate != null)
				return false;
		}
		else if (!collateralExpiryDate.equals(other.collateralExpiryDate))
			return false;
		if (collateralProvider == null)
		{
			if (other.collateralProvider != null)
				return false;
		}
		else if (!collateralProvider.equals(other.collateralProvider))
			return false;
		if (collateralValue == null)
		{
			if (other.collateralValue != null)
				return false;
		}
		else if (!collateralValue.equals(other.collateralValue))
			return false;
		if (collateralValueInGbp == null)
		{
			if (other.collateralValueInGbp != null)
				return false;
		}
		else if (!collateralValueInGbp.equals(other.collateralValueInGbp))
			return false;
		if (countryOfIssueOrAssets == null)
		{
			if (other.countryOfIssueOrAssets != null)
				return false;
		}
		else if (!countryOfIssueOrAssets.equals(other.countryOfIssueOrAssets))
			return false;
		if (facilitySecuredAmountGbp == null)
		{
			if (other.facilitySecuredAmountGbp != null)
				return false;
		}
		else if (!facilitySecuredAmountGbp.equals(other.facilitySecuredAmountGbp))
			return false;
		if (limitInGbp == null)
		{
			if (other.limitInGbp != null)
				return false;
		}
		else if (!limitInGbp.equals(other.limitInGbp))
			return false;
		if (riskFactor == null)
		{
			if (other.riskFactor != null)
				return false;
		}
		else if (!riskFactor.equals(other.riskFactor))
			return false;
		if (securedAmount == null)
		{
			if (other.securedAmount != null)
				return false;
		}
		else if (!securedAmount.equals(other.securedAmount))
			return false;
		if (securedCcy == null)
		{
			if (other.securedCcy != null)
				return false;
		}
		else if (!securedCcy.equals(other.securedCcy))
			return false;
		if (collateralId == null)
		{
			if (other.collateralId != null)
				return false;
		}
		else if (!collateralId.equals(other.collateralId))
			return false;
		if (facilityLimitInGbp == null)
		{
			if (other.facilityLimitInGbp != null)
				return false;
		}
		else if (!facilityLimitInGbp.equals(other.facilityLimitInGbp))
			return false;
		if (collateralType == null)
		{
			if (other.collateralType != null)
				return false;
		}
		else if (!collateralType.equals(other.collateralType))
			return false;
		if (collateralCounterParty == null)
		{
			if (other.collateralCounterParty != null)
				return false;
		}
		else if (!collateralCounterParty.equals(other.collateralCounterParty))
			return false;
		if (fac == null)
		{
			if (other.fac != null)
				return false;
		}
		else if (!fac.equals(other.fac))
			return false;
		return super.equals(obj);
	}


}


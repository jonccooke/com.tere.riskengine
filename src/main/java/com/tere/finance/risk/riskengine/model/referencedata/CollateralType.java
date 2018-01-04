package com.tere.finance.risk.riskengine.model.referencedata;

import java.io.Serializable;

import com.tere.finance.risk.riskengine.model.exceptions.ConstraintVoliationException;
import com.tere.finance.risk.riskengine.model.exceptions.LengthExceededException;
public  class CollateralType implements Comparable, Serializable
{
	public static String BASELCOLLATERALTYPE_PROPERTY = "CollateralType.baselCollateralType.property";
	public static String CHARGE_PROPERTY = "CollateralType.charge.property";
	public static String COLLATERALTYPENAME_PROPERTY = "CollateralType.collateralTypeName.property";
	public static String COLLATERALTYPEID_PROPERTY = "CollateralType.collateralTypeId.property";
	public static String COUNTRY_PROPERTY = "CollateralType.country.property";
	public static String DEFAULTCOUNTRYRISKTRANSFER_PROPERTY = "CollateralType.defaultCountryRiskTransfer.property";
	public static String HELDAT_PROPERTY = "CollateralType.heldAt.property";
	public static String MONEYMARKET_PROPERTY = "CollateralType.moneyMarket.property";
	public static String PICKFLAG_PROPERTY = "CollateralType.pickFlag.property";
	public static String RISKFACTOR_PROPERTY = "CollateralType.riskFactor.property";
	public static String RISKTRANSFER_PROPERTY = "CollateralType.riskTransfer.property";
	protected String baselCollateralType; 
	protected Boolean charge; 
	protected String collateralTypeName; 
	protected Long collateralTypeId; 
	protected String country; 
	protected Boolean defaultCountryRiskTransfer; 
	protected String heldAt; 
	protected Boolean moneyMarket; 
	protected Boolean pickFlag; 
	protected Boolean riskFactor; 
	protected Boolean riskTransfer; 

	public CollateralType()
	{
	}
	
	public CollateralType(String baselCollateralType, Boolean charge, String collateralTypeName, Long collateralTypeId, String country, Boolean defaultCountryRiskTransfer, String heldAt, Boolean moneyMarket, Boolean pickFlag, Boolean riskFactor, Boolean riskTransfer) throws ConstraintVoliationException
	{
		this.baselCollateralType = baselCollateralType;
		this.charge = charge;
		this.collateralTypeName = collateralTypeName;
		this.collateralTypeId = collateralTypeId;
		this.country = country;
		this.defaultCountryRiskTransfer = defaultCountryRiskTransfer;
		this.heldAt = heldAt;
		this.moneyMarket = moneyMarket;
		this.pickFlag = pickFlag;
		this.riskFactor = riskFactor;
		this.riskTransfer = riskTransfer;
	}

	public void setBaselCollateralType(String baselCollateralType) throws ConstraintVoliationException
	{
		if (null != baselCollateralType)
		{
			if (baselCollateralType.length() > 1000)
			{
				throw new LengthExceededException("$classReflect.getLabelName($param)", 1000, baselCollateralType.length());
			}
		}
		this.baselCollateralType = baselCollateralType;
	}
	public String getBaselCollateralType()
	{
		return baselCollateralType;
	}
	public void setCharge(Boolean charge) throws ConstraintVoliationException
	{
		if (null != charge)
		{
		}
		this.charge = charge;
	}
	public Boolean getCharge()
	{
		return charge;
	}
	public void setCollateralTypeName(String collateralTypeName) throws ConstraintVoliationException
	{
		if (null != collateralTypeName)
		{
			if (collateralTypeName.length() > 1000)
			{
				throw new LengthExceededException("$classReflect.getLabelName($param)", 1000, collateralTypeName.length());
			}
		}
		this.collateralTypeName = collateralTypeName;
	}
	public String getCollateralTypeName()
	{
		return collateralTypeName;
	}
	public void setCollateralTypeId(Long collateralTypeId) throws ConstraintVoliationException
	{
		if (null != collateralTypeId)
		{
		}
		this.collateralTypeId = collateralTypeId;
	}
	public Long getCollateralTypeId()
	{
		return collateralTypeId;
	}
	public void setCountry(String country) throws ConstraintVoliationException
	{
		if (null != country)
		{
			if (country.length() > 1000)
			{
				throw new LengthExceededException("$classReflect.getLabelName($param)", 1000, country.length());
			}
		}
		this.country = country;
	}
	public String getCountry()
	{
		return country;
	}
	public void setDefaultCountryRiskTransfer(Boolean defaultCountryRiskTransfer) throws ConstraintVoliationException
	{
		if (null != defaultCountryRiskTransfer)
		{
		}
		this.defaultCountryRiskTransfer = defaultCountryRiskTransfer;
	}
	public Boolean getDefaultCountryRiskTransfer()
	{
		return defaultCountryRiskTransfer;
	}
	public void setHeldAt(String heldAt) throws ConstraintVoliationException
	{
		if (null != heldAt)
		{
			if (heldAt.length() > 1000)
			{
				throw new LengthExceededException("$classReflect.getLabelName($param)", 1000, heldAt.length());
			}
		}
		this.heldAt = heldAt;
	}
	public String getHeldAt()
	{
		return heldAt;
	}
	public void setMoneyMarket(Boolean moneyMarket) throws ConstraintVoliationException
	{
		if (null != moneyMarket)
		{
		}
		this.moneyMarket = moneyMarket;
	}
	public Boolean getMoneyMarket()
	{
		return moneyMarket;
	}
	public void setPickFlag(Boolean pickFlag) throws ConstraintVoliationException
	{
		if (null != pickFlag)
		{
		}
		this.pickFlag = pickFlag;
	}
	public Boolean getPickFlag()
	{
		return pickFlag;
	}
	public void setRiskFactor(Boolean riskFactor) throws ConstraintVoliationException
	{
		if (null != riskFactor)
		{
		}
		this.riskFactor = riskFactor;
	}
	public Boolean getRiskFactor()
	{
		return riskFactor;
	}
	public void setRiskTransfer(Boolean riskTransfer) throws ConstraintVoliationException
	{
		if (null != riskTransfer)
		{
		}
		this.riskTransfer = riskTransfer;
	}
	public Boolean getRiskTransfer()
	{
		return riskTransfer;
	}

	public String toString()
	{
		StringBuffer buf = new StringBuffer();
		buf.append("baselCollateralType");
		buf.append("='");
		buf.append(baselCollateralType);
		buf.append("'");

		buf.append("charge");
		buf.append("='");
		buf.append(charge);
		buf.append("'");

		buf.append("collateralTypeName");
		buf.append("='");
		buf.append(collateralTypeName);
		buf.append("'");

		buf.append("collateralTypeId");
		buf.append("='");
		buf.append(collateralTypeId);
		buf.append("'");

		buf.append("country");
		buf.append("='");
		buf.append(country);
		buf.append("'");

		buf.append("defaultCountryRiskTransfer");
		buf.append("='");
		buf.append(defaultCountryRiskTransfer);
		buf.append("'");

		buf.append("heldAt");
		buf.append("='");
		buf.append(heldAt);
		buf.append("'");

		buf.append("moneyMarket");
		buf.append("='");
		buf.append(moneyMarket);
		buf.append("'");

		buf.append("pickFlag");
		buf.append("='");
		buf.append(pickFlag);
		buf.append("'");

		buf.append("riskFactor");
		buf.append("='");
		buf.append(riskFactor);
		buf.append("'");

		buf.append("riskTransfer");
		buf.append("='");
		buf.append(riskTransfer);
		buf.append("'");
		return buf.toString();	
	}
	
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((baselCollateralType == null) ? 0 : baselCollateralType.hashCode());
		result = prime * result + ((charge == null) ? 0 : charge.hashCode());
		result = prime * result + ((collateralTypeName == null) ? 0 : collateralTypeName.hashCode());
		result = prime * result + ((collateralTypeId == null) ? 0 : collateralTypeId.hashCode());
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + ((defaultCountryRiskTransfer == null) ? 0 : defaultCountryRiskTransfer.hashCode());
		result = prime * result + ((heldAt == null) ? 0 : heldAt.hashCode());
		result = prime * result + ((moneyMarket == null) ? 0 : moneyMarket.hashCode());
		result = prime * result + ((pickFlag == null) ? 0 : pickFlag.hashCode());
		result = prime * result + ((riskFactor == null) ? 0 : riskFactor.hashCode());
		result = prime * result + ((riskTransfer == null) ? 0 : riskTransfer.hashCode());
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
		CollateralType other = (CollateralType) obj;
		int comp = 0;
		if (baselCollateralType == null)
		{
			if (other.baselCollateralType != null)
				return BEFORE;
		}
		comp = baselCollateralType.compareTo(other.baselCollateralType);
		if (EQUAL != comp)
		{
			return comp;
		}
		if (charge == null)
		{
			if (other.charge != null)
				return BEFORE;
		}
		comp = charge.compareTo(other.charge);
		if (EQUAL != comp)
		{
			return comp;
		}
		if (collateralTypeName == null)
		{
			if (other.collateralTypeName != null)
				return BEFORE;
		}
		comp = collateralTypeName.compareTo(other.collateralTypeName);
		if (EQUAL != comp)
		{
			return comp;
		}
		if (collateralTypeId == null)
		{
			if (other.collateralTypeId != null)
				return BEFORE;
		}
		comp = collateralTypeId.compareTo(other.collateralTypeId);
		if (EQUAL != comp)
		{
			return comp;
		}
		if (country == null)
		{
			if (other.country != null)
				return BEFORE;
		}
		comp = country.compareTo(other.country);
		if (EQUAL != comp)
		{
			return comp;
		}
		if (defaultCountryRiskTransfer == null)
		{
			if (other.defaultCountryRiskTransfer != null)
				return BEFORE;
		}
		comp = defaultCountryRiskTransfer.compareTo(other.defaultCountryRiskTransfer);
		if (EQUAL != comp)
		{
			return comp;
		}
		if (heldAt == null)
		{
			if (other.heldAt != null)
				return BEFORE;
		}
		comp = heldAt.compareTo(other.heldAt);
		if (EQUAL != comp)
		{
			return comp;
		}
		if (moneyMarket == null)
		{
			if (other.moneyMarket != null)
				return BEFORE;
		}
		comp = moneyMarket.compareTo(other.moneyMarket);
		if (EQUAL != comp)
		{
			return comp;
		}
		if (pickFlag == null)
		{
			if (other.pickFlag != null)
				return BEFORE;
		}
		comp = pickFlag.compareTo(other.pickFlag);
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
		if (riskTransfer == null)
		{
			if (other.riskTransfer != null)
				return BEFORE;
		}
		comp = riskTransfer.compareTo(other.riskTransfer);
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
		CollateralType other = (CollateralType) obj;
		if (baselCollateralType == null)
		{
			if (other.baselCollateralType != null)
				return false;
		}
		else if (!baselCollateralType.equals(other.baselCollateralType))
			return false;
		if (charge == null)
		{
			if (other.charge != null)
				return false;
		}
		else if (!charge.equals(other.charge))
			return false;
		if (collateralTypeName == null)
		{
			if (other.collateralTypeName != null)
				return false;
		}
		else if (!collateralTypeName.equals(other.collateralTypeName))
			return false;
		if (collateralTypeId == null)
		{
			if (other.collateralTypeId != null)
				return false;
		}
		else if (!collateralTypeId.equals(other.collateralTypeId))
			return false;
		if (country == null)
		{
			if (other.country != null)
				return false;
		}
		else if (!country.equals(other.country))
			return false;
		if (defaultCountryRiskTransfer == null)
		{
			if (other.defaultCountryRiskTransfer != null)
				return false;
		}
		else if (!defaultCountryRiskTransfer.equals(other.defaultCountryRiskTransfer))
			return false;
		if (heldAt == null)
		{
			if (other.heldAt != null)
				return false;
		}
		else if (!heldAt.equals(other.heldAt))
			return false;
		if (moneyMarket == null)
		{
			if (other.moneyMarket != null)
				return false;
		}
		else if (!moneyMarket.equals(other.moneyMarket))
			return false;
		if (pickFlag == null)
		{
			if (other.pickFlag != null)
				return false;
		}
		else if (!pickFlag.equals(other.pickFlag))
			return false;
		if (riskFactor == null)
		{
			if (other.riskFactor != null)
				return false;
		}
		else if (!riskFactor.equals(other.riskFactor))
			return false;
		if (riskTransfer == null)
		{
			if (other.riskTransfer != null)
				return false;
		}
		else if (!riskTransfer.equals(other.riskTransfer))
			return false;
		return super.equals(obj);
	}


}


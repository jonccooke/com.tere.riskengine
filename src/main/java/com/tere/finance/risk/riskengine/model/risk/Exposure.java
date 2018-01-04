package com.tere.finance.risk.riskengine.model.risk;

import java.io.Serializable;

import com.tere.finance.risk.riskengine.model.exceptions.ConstraintVoliationException;
import com.tere.finance.risk.riskengine.model.exceptions.LengthExceededException;
import com.tere.finance.risk.riskengine.model.referencedata.Counterparty;
public  class Exposure implements Comparable, Serializable
{
	public static String COLLATERALIND_PROPERTY = "Exposure.collateralInd.property";
	public static String CPARTYTYPE_PROPERTY = "Exposure.cpartyType.property";
	public static String EXPOSUREVALUE_PROPERTY = "Exposure.exposureValue.property";
	public static String PRODUCTGRPID_PROPERTY = "Exposure.productGrpId.property";
	public static String SCENARIOID_PROPERTY = "Exposure.scenarioId.property";
	public static String SITEID_PROPERTY = "Exposure.siteId.property";
	public static String STRESSIND_PROPERTY = "Exposure.stressInd.property";
	public static String STRESSTESTID_PROPERTY = "Exposure.stressTestId.property";
	public static String TOTALMTMVALUE_PROPERTY = "Exposure.totalMTMValue.property";
	public static String EXPOSUREID_PROPERTY = "Exposure.exposureId.property";
	public static String COUNTERPARTY_PROPERTY = "Exposure.counterParty.property";
	protected Long collateralInd; 
	protected String cpartyType; 
	protected Integer exposureValue; 
	protected Long productGrpId; 
	protected Long scenarioId; 
	protected Long siteId; 
	protected Long stressInd; 
	protected Long stressTestId; 
	protected java.math.BigDecimal totalMTMValue; 
	protected Long exposureId; 
	protected Counterparty counterParty; 

	public Exposure()
	{
	}
	
	public Exposure(Long collateralInd, String cpartyType, Integer exposureValue, Long productGrpId, Long scenarioId, Long siteId, Long stressInd, Long stressTestId, java.math.BigDecimal totalMTMValue, Long exposureId, com.tere.finance.risk.riskengine.model.referencedata.Counterparty counterParty) throws ConstraintVoliationException
	{
		this.collateralInd = collateralInd;
		this.cpartyType = cpartyType;
		this.exposureValue = exposureValue;
		this.productGrpId = productGrpId;
		this.scenarioId = scenarioId;
		this.siteId = siteId;
		this.stressInd = stressInd;
		this.stressTestId = stressTestId;
		this.totalMTMValue = totalMTMValue;
		this.exposureId = exposureId;
		this.counterParty = counterParty;
	}

	public void setCollateralInd(Long collateralInd) throws ConstraintVoliationException
	{
		if (null != collateralInd)
		{
		}
		this.collateralInd = collateralInd;
	}
	public Long getCollateralInd()
	{
		return collateralInd;
	}
	public void setCpartyType(String cpartyType) throws ConstraintVoliationException
	{
		if (null != cpartyType)
		{
			if (cpartyType.length() > 1000)
			{
				throw new LengthExceededException("$classReflect.getLabelName($param)", 1000, cpartyType.length());
			}
		}
		this.cpartyType = cpartyType;
	}
	public String getCpartyType()
	{
		return cpartyType;
	}
	public void setExposureValue(Integer exposureValue) throws ConstraintVoliationException
	{
		if (null != exposureValue)
		{
		}
		this.exposureValue = exposureValue;
	}
	public Integer getExposureValue()
	{
		return exposureValue;
	}
	public void setProductGrpId(Long productGrpId) throws ConstraintVoliationException
	{
		if (null != productGrpId)
		{
		}
		this.productGrpId = productGrpId;
	}
	public Long getProductGrpId()
	{
		return productGrpId;
	}
	public void setScenarioId(Long scenarioId) throws ConstraintVoliationException
	{
		if (null != scenarioId)
		{
		}
		this.scenarioId = scenarioId;
	}
	public Long getScenarioId()
	{
		return scenarioId;
	}
	public void setSiteId(Long siteId) throws ConstraintVoliationException
	{
		if (null != siteId)
		{
		}
		this.siteId = siteId;
	}
	public Long getSiteId()
	{
		return siteId;
	}
	public void setStressInd(Long stressInd) throws ConstraintVoliationException
	{
		if (null != stressInd)
		{
		}
		this.stressInd = stressInd;
	}
	public Long getStressInd()
	{
		return stressInd;
	}
	public void setStressTestId(Long stressTestId) throws ConstraintVoliationException
	{
		if (null != stressTestId)
		{
		}
		this.stressTestId = stressTestId;
	}
	public Long getStressTestId()
	{
		return stressTestId;
	}
	public void setTotalMTMValue(java.math.BigDecimal totalMTMValue) throws ConstraintVoliationException
	{
		if (null != totalMTMValue)
		{
		}
		this.totalMTMValue = totalMTMValue;
	}
	public java.math.BigDecimal getTotalMTMValue()
	{
		return totalMTMValue;
	}
	public void setExposureId(Long exposureId) throws ConstraintVoliationException
	{
		if (null != exposureId)
		{
		}
		this.exposureId = exposureId;
	}
	public Long getExposureId()
	{
		return exposureId;
	}
	public void setCounterParty(Counterparty counterParty) throws ConstraintVoliationException
	{
		this.counterParty = counterParty;
	}
	public Counterparty getCounterParty()
	{
		return counterParty;
	}

	public String toString()
	{
		StringBuffer buf = new StringBuffer();
		buf.append("collateralInd");
		buf.append("='");
		buf.append(collateralInd);
		buf.append("'");

		buf.append("cpartyType");
		buf.append("='");
		buf.append(cpartyType);
		buf.append("'");

		buf.append("exposureValue");
		buf.append("='");
		buf.append(exposureValue);
		buf.append("'");

		buf.append("productGrpId");
		buf.append("='");
		buf.append(productGrpId);
		buf.append("'");

		buf.append("scenarioId");
		buf.append("='");
		buf.append(scenarioId);
		buf.append("'");

		buf.append("siteId");
		buf.append("='");
		buf.append(siteId);
		buf.append("'");

		buf.append("stressInd");
		buf.append("='");
		buf.append(stressInd);
		buf.append("'");

		buf.append("stressTestId");
		buf.append("='");
		buf.append(stressTestId);
		buf.append("'");

		buf.append("totalMTMValue");
		buf.append("='");
		buf.append(totalMTMValue);
		buf.append("'");

		buf.append("exposureId");
		buf.append("='");
		buf.append(exposureId);
		buf.append("'");
		return buf.toString();	
	}
	
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((collateralInd == null) ? 0 : collateralInd.hashCode());
		result = prime * result + ((cpartyType == null) ? 0 : cpartyType.hashCode());
		result = prime * result + ((exposureValue == null) ? 0 : exposureValue.hashCode());
		result = prime * result + ((productGrpId == null) ? 0 : productGrpId.hashCode());
		result = prime * result + ((scenarioId == null) ? 0 : scenarioId.hashCode());
		result = prime * result + ((siteId == null) ? 0 : siteId.hashCode());
		result = prime * result + ((stressInd == null) ? 0 : stressInd.hashCode());
		result = prime * result + ((stressTestId == null) ? 0 : stressTestId.hashCode());
		result = prime * result + ((totalMTMValue == null) ? 0 : totalMTMValue.hashCode());
		result = prime * result + ((exposureId == null) ? 0 : exposureId.hashCode());
		result = prime * result + ((counterParty == null) ? 0 : counterParty.hashCode());
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
		Exposure other = (Exposure) obj;
		int comp = 0;
		if (collateralInd == null)
		{
			if (other.collateralInd != null)
				return BEFORE;
		}
		comp = collateralInd.compareTo(other.collateralInd);
		if (EQUAL != comp)
		{
			return comp;
		}
		if (cpartyType == null)
		{
			if (other.cpartyType != null)
				return BEFORE;
		}
		comp = cpartyType.compareTo(other.cpartyType);
		if (EQUAL != comp)
		{
			return comp;
		}
		if (exposureValue == null)
		{
			if (other.exposureValue != null)
				return BEFORE;
		}
		comp = exposureValue.compareTo(other.exposureValue);
		if (EQUAL != comp)
		{
			return comp;
		}
		if (productGrpId == null)
		{
			if (other.productGrpId != null)
				return BEFORE;
		}
		comp = productGrpId.compareTo(other.productGrpId);
		if (EQUAL != comp)
		{
			return comp;
		}
		if (scenarioId == null)
		{
			if (other.scenarioId != null)
				return BEFORE;
		}
		comp = scenarioId.compareTo(other.scenarioId);
		if (EQUAL != comp)
		{
			return comp;
		}
		if (siteId == null)
		{
			if (other.siteId != null)
				return BEFORE;
		}
		comp = siteId.compareTo(other.siteId);
		if (EQUAL != comp)
		{
			return comp;
		}
		if (stressInd == null)
		{
			if (other.stressInd != null)
				return BEFORE;
		}
		comp = stressInd.compareTo(other.stressInd);
		if (EQUAL != comp)
		{
			return comp;
		}
		if (stressTestId == null)
		{
			if (other.stressTestId != null)
				return BEFORE;
		}
		comp = stressTestId.compareTo(other.stressTestId);
		if (EQUAL != comp)
		{
			return comp;
		}
		if (totalMTMValue == null)
		{
			if (other.totalMTMValue != null)
				return BEFORE;
		}
		comp = totalMTMValue.compareTo(other.totalMTMValue);
		if (EQUAL != comp)
		{
			return comp;
		}
		if (exposureId == null)
		{
			if (other.exposureId != null)
				return BEFORE;
		}
		comp = exposureId.compareTo(other.exposureId);
		if (EQUAL != comp)
		{
			return comp;
		}
		if (counterParty == null)
		{
			if (other.counterParty != null)
				return BEFORE;
		}
		comp = counterParty.compareTo(other.counterParty);
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
		Exposure other = (Exposure) obj;
		if (collateralInd == null)
		{
			if (other.collateralInd != null)
				return false;
		}
		else if (!collateralInd.equals(other.collateralInd))
			return false;
		if (cpartyType == null)
		{
			if (other.cpartyType != null)
				return false;
		}
		else if (!cpartyType.equals(other.cpartyType))
			return false;
		if (exposureValue == null)
		{
			if (other.exposureValue != null)
				return false;
		}
		else if (!exposureValue.equals(other.exposureValue))
			return false;
		if (productGrpId == null)
		{
			if (other.productGrpId != null)
				return false;
		}
		else if (!productGrpId.equals(other.productGrpId))
			return false;
		if (scenarioId == null)
		{
			if (other.scenarioId != null)
				return false;
		}
		else if (!scenarioId.equals(other.scenarioId))
			return false;
		if (siteId == null)
		{
			if (other.siteId != null)
				return false;
		}
		else if (!siteId.equals(other.siteId))
			return false;
		if (stressInd == null)
		{
			if (other.stressInd != null)
				return false;
		}
		else if (!stressInd.equals(other.stressInd))
			return false;
		if (stressTestId == null)
		{
			if (other.stressTestId != null)
				return false;
		}
		else if (!stressTestId.equals(other.stressTestId))
			return false;
		if (totalMTMValue == null)
		{
			if (other.totalMTMValue != null)
				return false;
		}
		else if (!totalMTMValue.equals(other.totalMTMValue))
			return false;
		if (exposureId == null)
		{
			if (other.exposureId != null)
				return false;
		}
		else if (!exposureId.equals(other.exposureId))
			return false;
		if (counterParty == null)
		{
			if (other.counterParty != null)
				return false;
		}
		else if (!counterParty.equals(other.counterParty))
			return false;
		return super.equals(obj);
	}


}


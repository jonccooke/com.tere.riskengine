package com.tere.finance.risk.riskengine.model.referencedata;

import java.io.Serializable;

public class Book implements Serializable
{
	private Long bookId;
	private String bookCode;
	private String bookName;
	private Long masterBookId;
	private boolean master;
	private int accountingTreatment;
	private boolean tradingBanking;
	private String region;
	private Long mainTraderId;
	private String mainTraderName;
	private Long businessOwnerId;
	private Long subProductId;
	private Long businessAreaId;
	private Long productAreaId;

	public Book(Long bookId, String bookCode, String bookName, Long masterBookId)
	{
		this.bookId = bookId;
		this.bookCode = bookCode;
		this.bookName = bookName;
		this.masterBookId = masterBookId;
	}

	public Book(Long bookId, String bookCode, String bookName,
			Long masterBookId, boolean master, int accountingTreatment,
			boolean tradingBanking, String region, Long mainTraderId,
			String mainTraderName, Long businessOwnerId, Long subProductId,
			Long businessAreaId, Long productAreaId)
	{
		this.bookId = bookId;
		this.bookCode = bookCode;
		this.bookName = bookName;
		this.masterBookId = masterBookId;
		this.master = master;
		this.accountingTreatment = accountingTreatment;
		this.tradingBanking = tradingBanking;
		this.region = region;
		this.mainTraderId = mainTraderId;
		this.mainTraderName = mainTraderName;
		this.businessOwnerId = businessOwnerId;
		this.subProductId = subProductId;
		this.businessAreaId = businessAreaId;
		this.productAreaId = productAreaId;
	}

	public Long getBookId()
	{
		return bookId;
	}

	public void setBookId(Long bookId)
	{
		this.bookId = bookId;
	}

	public String getBookCode()
	{
		return bookCode;
	}

	public void setBookCode(String bookCode)
	{
		this.bookCode = bookCode;
	}

	public String getBookName()
	{
		return bookName;
	}

	public void setBookName(String bookName)
	{
		this.bookName = bookName;
	}

	public Long getMasterBookId()
	{
		return masterBookId;
	}

	public void setMasterBookId(Long masterBookId)
	{
		this.masterBookId = masterBookId;
	}

	public boolean getMaster()
	{
		return master;
	}

	public void setMaster(boolean master)
	{
		this.master = master;
	}

	public int getAccountingTreatment()
	{
		return accountingTreatment;
	}

	public void setAccountingTreatment(int accountingTreatment)
	{
		this.accountingTreatment = accountingTreatment;
	}

	public boolean getTradingBanking()
	{
		return tradingBanking;
	}

	public void setTradingBanking(boolean tradingBanking)
	{
		this.tradingBanking = tradingBanking;
	}

	public String getRegion()
	{
		return region;
	}

	public void setRegion(String region)
	{
		this.region = region;
	}

	public Long getMainTraderId()
	{
		return mainTraderId;
	}

	public void setMainTraderId(Long mainTraderId)
	{
		this.mainTraderId = mainTraderId;
	}

	public String getMainTraderName()
	{
		return mainTraderName;
	}

	public void setMainTraderName(String mainTraderName)
	{
		this.mainTraderName = mainTraderName;
	}

	public Long getBusinessOwnerId()
	{
		return businessOwnerId;
	}

	public void setBusinessOwnerId(Long businessOwnerId)
	{
		this.businessOwnerId = businessOwnerId;
	}

	public Long getSubProductId()
	{
		return subProductId;
	}

	public void setSubProductId(Long subProductId)
	{
		this.subProductId = subProductId;
	}

	public Long getBusinessAreaId()
	{
		return businessAreaId;
	}

	public void setBusinessAreaId(Long businessAreaId)
	{
		this.businessAreaId = businessAreaId;
	}

	public Long getProductAreaId()
	{
		return productAreaId;
	}

	public void setProductAreaId(Long productAreaId)
	{
		this.productAreaId = productAreaId;
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + accountingTreatment;
		result = prime * result
				+ ((bookCode == null) ? 0 : bookCode.hashCode());
		result = prime * result + ((bookId == null) ? 0 : bookId.hashCode());
		result = prime * result
				+ ((bookName == null) ? 0 : bookName.hashCode());
		result = prime * result
				+ ((businessAreaId == null) ? 0 : businessAreaId.hashCode());
		result = prime * result
				+ ((businessOwnerId == null) ? 0 : businessOwnerId.hashCode());
		result = prime * result
				+ ((mainTraderId == null) ? 0 : mainTraderId.hashCode());
		result = prime * result
				+ ((mainTraderName == null) ? 0 : mainTraderName.hashCode());
		result = prime * result + (master ? 1231 : 1237);
		result = prime * result
				+ ((masterBookId == null) ? 0 : masterBookId.hashCode());
		result = prime * result
				+ ((productAreaId == null) ? 0 : productAreaId.hashCode());
		result = prime * result + ((region == null) ? 0 : region.hashCode());
		result = prime * result
				+ ((subProductId == null) ? 0 : subProductId.hashCode());
		result = prime * result + (tradingBanking ? 1231 : 1237);
		return result;
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
		Book other = (Book) obj;
		if (accountingTreatment != other.accountingTreatment)
			return false;
		if (bookCode == null)
		{
			if (other.bookCode != null)
				return false;
		}
		else if (!bookCode.equals(other.bookCode))
			return false;
		if (bookId == null)
		{
			if (other.bookId != null)
				return false;
		}
		else if (!bookId.equals(other.bookId))
			return false;
		if (bookName == null)
		{
			if (other.bookName != null)
				return false;
		}
		else if (!bookName.equals(other.bookName))
			return false;
		if (businessAreaId == null)
		{
			if (other.businessAreaId != null)
				return false;
		}
		else if (!businessAreaId.equals(other.businessAreaId))
			return false;
		if (businessOwnerId == null)
		{
			if (other.businessOwnerId != null)
				return false;
		}
		else if (!businessOwnerId.equals(other.businessOwnerId))
			return false;
		if (mainTraderId == null)
		{
			if (other.mainTraderId != null)
				return false;
		}
		else if (!mainTraderId.equals(other.mainTraderId))
			return false;
		if (mainTraderName == null)
		{
			if (other.mainTraderName != null)
				return false;
		}
		else if (!mainTraderName.equals(other.mainTraderName))
			return false;
		if (master != other.master)
			return false;
		if (masterBookId == null)
		{
			if (other.masterBookId != null)
				return false;
		}
		else if (!masterBookId.equals(other.masterBookId))
			return false;
		if (productAreaId == null)
		{
			if (other.productAreaId != null)
				return false;
		}
		else if (!productAreaId.equals(other.productAreaId))
			return false;
		if (region == null)
		{
			if (other.region != null)
				return false;
		}
		else if (!region.equals(other.region))
			return false;
		if (subProductId == null)
		{
			if (other.subProductId != null)
				return false;
		}
		else if (!subProductId.equals(other.subProductId))
			return false;
		if (tradingBanking != other.tradingBanking)
			return false;
		return true;
	}
	
}

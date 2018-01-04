package com.tere.finance.risk.riskengine.model.referencedata;

public enum Frequency
{
	/** null frequency */
	NoFrequency(-1),
	/** only once */
	Once(0),
	/** once a year */
	Annual(1),
	/** twice a year */
	Semiannual(2),
	/** every fourth month */
	EveryFourthMonth(3),
	/** every third month */
	Quarterly(4),
	/** every second month */
	Bimonthly(6),
	/** once a month */
	Monthly(12),
	/** every fourth week */
	EveryFourthWeek(13),
	/** every second week */
	Biweekly(26),
	/** once a week */
	Weekly(52),
	/** once a day */
	Daily(365),
	/** some other unknown frequency */
	OtherFrequency(999);

	private int multipler;

	private Frequency(int multipler)
	{
		this.multipler = multipler;
	}

	public int getMultipler()
	{
		return multipler;
	}
}

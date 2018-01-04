package com.tere.finance.risk.riskengine.model.referencedata;

public enum DayCountConventionType
{
	DC_Actual_Actual, //(actual) - The number of days in both a period and a year is the actual number of days (as per calendar).
	DC_Actual_Actual_Bond, // (bond) - The number of days in a period is equal to the actual number of days, but the number of days in a year is the actual number of days in the relevant coupon period multiplied by the coupon frequency. Eg, if a bond has semi-annual coupon payments and the current coupon period is 181 days, the assumed number of days in a year will be 362.
	DC_Actual_360, // - The number of days in a period is equal to the actual number of days however the number of days in a year is 360.
	DC_Actual_365, // - The number of days in a period is equal to the actual number of days however the number of days in a year is 365 (even in a leap year).
	DC_Actual_365_ISDA, // - The DayCount fraction (the proportion of a year) is calculated using the following formula:
	// Result = Daysly /366 + Daysny / 365
	// Daysly = Actual number of days in period that fall in a leap year.
	// Daysny = Actual number of days in period that fall in a normal year.
	// This contrasts the Actual/365 DayCount fraction which is determined by dividing the actual number of days in the period (regardless if there is a leap year) by 365.
	DC_Actual_365_JGB,// (NL) - The number of days in a period is equal to the actual number of days, with the exception of leap days (29th February) which are ignored. The number of days in a year is 365 (even in a leap year).
	DC_30_360_ISDA,// - The number of days in every month is set to 30 except for February where it is the actual number of days. If the start date of the period is the 31st of a month, the start date is set to the 30th while if the start date is the 30th of a month and the end date is the 31st, the end date is set to the 30th. The number of days in a year is 360.
	DC_30_360_PSA, // - The number of days in every month is set to 30 (including February). If the start date of the period is either the 31st of a month or the last day of February, the start date is set to the 30th while if the start date is the 30th of a month and the end date is the 31st, the end date is set to the 30th. The number of days in a year is 360.
	DC_30E_360, // - The number of days in every month is set to 30 except for February where it is equal to the actual number of days. If the start date or the end date of the period is the 31st of a month, that date is set to the 30th. The number of days in a year is 360.
	DC_30E_Plus_360, // - The number of days in every month is set to 30 except for February where it is equal to the actual number of days. If the start date of the period is the 31st of a month, the start date is set to the 30th while if the end date is the 31st of a month, the end date is set to the 1st of the following month. The number of days in a year is 360.
	DC_Actual_365L, // - The number of days in a period is set to the actual number of days. The number of days in a year is 365 in every year except when the end date of the period falls in a leap year, in which case the result is 366.

//	 DC_30_360_US,
//	 DC_30E_360,
//	 DC_30E_360_ISDA,
//	 DC_Actual_Actual_ICMA,
//	 DC_Actual_Actual_ISDA,
//	 DC_Actual_365_Fixed,
//	 DC_Actual_360,
//	 DC_Actual_364,
//	 DC_Actual_365L,
//	 DC_Actual_Actual_AFB,
//	 DC_1_1,
//	 M
}

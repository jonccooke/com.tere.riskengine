package com.tere.finance.risk.riskengine.valuation;

//import org.jquantlib.math.distributions.NormalDistribution;

public class Valuer
{
//	final static double pi = 3.14159265358979;
//
//	/*
//	 * 'Black-Scholes option pricing model 'Arguments: 'underly price of
//	 * underlying instrument 'iv Implied Volatility, or historical volatility in
//	 * most recent period 'rfrate annualized risk-free return (i.e. T-bill
//	 * interest rate) 'strike strike price of option 'is_call set to True if you
//	 * want the call price, False for put price 'expdays calendar days to
//	 * expiration
//	 */
//	public static double blackscholes(double underly, double iv, double rfrate,
//			double strike, boolean is_call, int expdays)
//	{
//		double t;
//		double dtmp;
//		double d1;
//		double d2;
//		double vcall;
//		t = expdays / 365d; // 'expiration time as fraction of a year
//		dtmp = iv * Math.sqrt(t);
//		d1 = (Math.log(underly / strike) + rfrate * t) / dtmp + 0.5 * dtmp;
//		d2 = d1 - dtmp;
//
//		dtmp = strike * Math.exp(-rfrate * t);
//		NormalDistribution nd = new NormalDistribution();
//		vcall = underly * nd.op(d1) - dtmp * nd.op(d2);
//		// Note: call delta is normsdist(d1), put delta is (1 - call delta)
//
//		if (is_call)
//		{
//			return vcall;
//		}
//		else
//		{
//			return dtmp + vcall - underly;
//		}
//	}
//
//	/*
//	 * Implied volatility calculation - numerical convergence using
//	 * blackscholes() Arguments: 'underly price of underlying instrument
//	 * 'optprice price of option 'rfrate annualized risk-free return (i.e.
//	 * T-bill interest rate) 'strike strike price of option 'is_call True if
//	 * option is a call, False if option is a put 'expdays calendar days to
//	 * expiration
//	 */
//
//	public static double impliedVolatility(double underly, double optprice,
//			double rfrate, double strike, boolean is_call, int expdays)
//	{
//		double iv;
//		double ivstep;
//		double p;
//		double impliedVolatility;
//		if (underly <= 0d || optprice <= 0 || strike <= 0)
//		{
//			return 0.0d;
//		}
//		if ((is_call && strike < underly && optprice <= underly - strike)
//				|| (!is_call && strike > underly && optprice <= strike
//						- underly))
//		{
//			return 0.0d;
//		}
//		iv = 0.5d;
//		ivstep = 0.25d;// 'initial values
//		do
//		{
//			p = blackscholes(underly, iv, rfrate, strike, is_call, expdays);
//			if ((p > optprice && ivstep > 0) || (p < optprice && ivstep < 0))
//			{
//				ivstep = -ivstep * 0.5;
//			}
//			for (; -ivstep >= iv; ivstep = ivstep * 0.5)
//			{
//
//			}
//			if (iv < 0.0000000001 || iv > 100000)
//			{
//				return 0;
//			}
//			iv = iv + ivstep;
//		}
//		while (Math.abs(p - optprice) >= 0.0000001);
//		return iv;
//	}
//
//	/*
//	 * Call Option Greeks 'Arguments: 'underly price of underlying instrument
//	 * 'iv implied volatility (sigma) 'rfrate annualized risk-free return (i.e.
//	 * T-bill interest rate) 'strike strike price of option 'expdays calendar
//	 * days to expiration
//	 * 
//	 * 'Returns an array containing the following: 'delta call price sensitivity
//	 * to change in underly price; ' put delta = 1 - call delta 'gamma delta's
//	 * sensitivity to change in underly price (call & put) 'theta daily rate of
//	 * price decay (theta<0 always); ' usually theta is large & negative when
//	 * gamma is large & positive 'vega option price sensitivity to changes in
//	 * volatility; ' also known as zeta, kappa, or lambda 'rho option price
//	 * sensitivity to changes in risk-free interest rate
//	 * 
//	 * 'not returned: Epsilon, also known as DDeltaDVol, is the ' change in
//	 * delta with a small change to implied volatility, ' also the change in
//	 * vega with respect to change in asset price. 'See:
//	 * 'http://ecampus.bentley.edu/dept/hcfs/tradingroom/tutorials/optionpricing.pdf
//	 */
//
//	public static void greeks(double underly, double iv, double rfrate,
//			double strike, boolean is_call, int expdays, Greeks greeks)
//	{
//		double t;
//		double dtmp;
//		double d1;
//		double d2;
//		double n_d1;
//		double n_d2;
//		double tsqrt;
//		NormalDistribution nd = new NormalDistribution();
//		t = expdays / 365d; // expiration time as fraction of a year
//		tsqrt = Math.sqrt(t);
//		dtmp = iv * tsqrt;
//		d1 = (Math.log(underly / strike) + rfrate * t) / dtmp + 0.5 * dtmp;
//		d2 = d1 - dtmp;
//		n_d1 = nd.op(d1);
//		n_d2 = nd.op(d2);
//
//		if (is_call)
//		{
//			greeks.setDelta(nd.op(d1));
//			greeks.setTheta(-(underly * iv * n_d1) / (2.0d * tsqrt) - rfrate
//					* strike * Math.exp(-rfrate * t) * n_d2);
//			greeks.setRho(0.01 * strike * t * Math.exp(-rfrate * t) * n_d2);
//		}
//		else
//		{
//			greeks.setDelta(nd.op(d1) - 1.0d);
//			greeks.setTheta(-(underly * iv * n_d1) / (2.0d * tsqrt) + rfrate
//					* strike * Math.exp(-rfrate * t) * (1.0d - n_d2));
//			greeks.setRho(-0.01 * strike * t * Math.exp(-rfrate * t)
//					* (1 - n_d2));
//		}
//
//		greeks.setGamma(n_d1 / (underly * dtmp));
//		greeks.setVega(0.01 * underly * tsqrt * n_d1);
//		greeks.setTheta(greeks.getTheta() / 365.0d); // 'convert to daily rather
//														// than annualized theta
//	}
//
////	public static double valueEuropeanOption(Option.Type type,
////			final double strike, final double underlying,
////			final double dividendYield, Date todaysDate, Date maturityDate,
////			Date settlementDate, final double dividend,
////			final double riskFreeRate, final double volatility,
////			final double tolerance)
////	{
//
////		final Calendar calendar = new Target();
////		// final Date todaysDate = new Date(15, Month.May, 1998);
////		// final Date settlementDate = new Date(17, Month.May, 1998);
////		new Settings().setEvaluationDate(todaysDate);
////
////		// our options
////		// final Option.Type type = Option.Type.Put;
////		// final double riskFreeRate = 0.06;
////		// final double volatility = 0.2;
////		// final double dividendYield = 0.00;
////
////		// final Date maturity = new Date(17, Month.May, 1999);
////		final DayCounter dayCounter = new Actual365Fixed();
////
////		// Define exercise for European Options
////		final Exercise europeanExercise = new EuropeanExercise(maturityDate);
////
////		// Define exercise for Bermudan Options
////		final int bermudanForwards = 4;
////		final Date[] exerciseDates = new Date[bermudanForwards];
////		for (int i = 1; i <= bermudanForwards; i++)
////		{
////			exerciseDates[i - 1] = settlementDate.add(new Period(3 * i,
////					TimeUnit.Months));
////		}
////
////		// bootstrap the yield/dividend/volatility curves
////		final Handle<Quote> underlyingH = new Handle<Quote>(new SimpleQuote(
////				underlying));
////		final Handle<YieldTermStructure> flatDividendTS = new Handle<YieldTermStructure>(
////				new FlatForward(settlementDate, dividendYield, dayCounter));
////		final Handle<YieldTermStructure> flatTermStructure = new Handle<YieldTermStructure>(
////				new FlatForward(settlementDate, riskFreeRate, dayCounter));
////		final Handle<BlackVolTermStructure> flatVolTS = new Handle<BlackVolTermStructure>(
////				new BlackConstantVol(settlementDate, calendar, volatility,
////						dayCounter));
////		final Payoff payoff = new PlainVanillaPayoff(type, strike);
////
////		final BlackScholesMertonProcess bsmProcess = new BlackScholesMertonProcess(
////				underlyingH, flatDividendTS, flatTermStructure, flatVolTS);
////
////		// European Options
////		final VanillaOption option = new EuropeanOption(payoff,
////				europeanExercise);
////
////		// Analytic formulas:
////
////		// Black-Scholes for European
////		option.setPricingEngine(new AnalyticEuropeanEngine(bsmProcess));
////
////		return option.NPV();
////		return 0.0f;
////	}
//
}

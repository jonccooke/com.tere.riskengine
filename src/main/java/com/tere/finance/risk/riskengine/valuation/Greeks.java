package com.tere.finance.risk.riskengine.valuation;


public class Greeks
{
	private double delta;
	private double gamma;
	private double theta;
	private double rho;
	private double vega;

	public double getDelta()
	{
		return delta;
	}

	public void setDelta(double delta)
	{
		this.delta = delta;
	}

	public double getGamma()
	{
		return gamma;
	}

	public void setGamma(double gamma)
	{
		this.gamma = gamma;
	}

	public double getTheta()
	{
		return theta;
	}

	public void setTheta(double theta)
	{
		this.theta = theta;
	}

	public double getRho()
	{
		return rho;
	}

	public void setRho(double rho)
	{
		this.rho = rho;
	}

	public double getVega()
	{
		return vega;
	}

	public void setVega(double vega)
	{
		this.vega = vega;
	}

}

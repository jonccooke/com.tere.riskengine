package com.tere.finance.risk.riskengine.model.instrument;

import java.util.ArrayList;
import java.util.List;

import org.joda.time.LocalDate;

public enum Exercise
{
    American, Bermudan, European;
    
    private List<LocalDate> dates = new ArrayList<LocalDate>();

    public List<LocalDate> getDates()
    {
    	return dates;
    }

    public LocalDate getFirstDate()
    {
    	return dates.size() >0 ? dates.get(dates.size()-1) : null;
    }

    public LocalDate getLastDate()
    {
    	return dates.size() > 0 ? dates.get(dates.size()-1) : null;
    }

}

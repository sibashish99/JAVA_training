package com.training;

import com.training.ifaces.Billable;

public class CivilEngineer implements Billable {

	@Override
	public double calculate(Object obj) {
		
		double amount=(double)obj;
		return (amount*3*12);
	}

}

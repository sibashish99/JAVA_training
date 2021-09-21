package com.training;

import com.training.ifaces.Billable;

public class SoftwareEngineer implements Billable {
	
	@Override
	public double calculate(Object obj) {

		double amount=(double)obj;
		return (amount*5*12);
	}

}

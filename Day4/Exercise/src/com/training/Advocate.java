package com.training;

import com.training.ifaces.Billable;

public class Advocate implements Billable {

	@Override
	public double calculate(Object obj) {
		// TODO Auto-generated method stub
		double amount=(double)obj;
		return amount*9*12;
	}

}

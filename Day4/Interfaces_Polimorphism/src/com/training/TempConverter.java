package com.training;

import com.training.ifaces.IFunction;

public class TempConverter implements IFunction {

	@Override
	public double apply(double age) {
		// TODO Auto-generated method stub
		return (5.00/9.00)*(age-32);
	}

}

package com.training;

import com.training.ifaces.IFunction;

public class CurrencyConverter implements IFunction {
	public interface User{
		public double add(int a, int b);
	}

	@Override
	public double apply(double age) {
		// TODO Auto-generated method stub
		return ((age*45)/9.5);
		
	}


}
class Test implements CurrencyConverter.User{

	@Override
	public double add(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
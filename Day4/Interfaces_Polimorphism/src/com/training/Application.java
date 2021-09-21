package com.training;

import com.training.ifaces.IFunction;

public class Application {
	public static void print(IFunction func, double age) {
		System.out.println(func.apply(age));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IFunction c1= new CurrencyConverter();
        //System.out.println("currency is "+c1.apply(34));
        
		IFunction t1= new TempConverter();
        System.out.println("temparature is "+t1.apply(45));
        
        print(c1,100);
        print(t1,34);
	}

}

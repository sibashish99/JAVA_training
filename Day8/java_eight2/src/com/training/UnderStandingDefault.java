package com.training;

public class UnderStandingDefault implements Condition, Validator {

	@Override
	public boolean validate() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean test() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String show() {
		// TODO Auto-generated method stub
		return Condition.super.show() +" || "+Validator.super.show() +" || This is from class";
	}

//	@Override
//	public String show() {
//		// TODO Auto-generated method stub
//		return "This is from class";
//	}

}

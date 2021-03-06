package com.training.demo;

public class MyExceptionHandler {
	public void usingClassCastException() {
		Object ageObj = "twenty";
		Integer age;
		
		try {
			age = (Integer)ageObj;
			System.out.println(age);
		} catch (ClassCastException e) {
			System.err.println("ageObj should be a number [0-9]");
			e.printStackTrace();
		}
		
	}
	
	public void usingMultiCatch(String strNumber) {
		
		try {
			
			int num = Integer.parseInt(strNumber);
			System.out.println(num);
			
		} catch(NumberFormatException e) {
			
			System.err.println("Argument should be a number[0-9]");
			e.printStackTrace();
		
		} catch(NullPointerException e) {
		
			System.err.println("Argument should not be NULL");
		
		}catch(Exception e) {
			
			e.printStackTrace();
		
		}
	}
	
	public void tryWithMultipleCatch() {
		try {
			int numerator=20;
			int[] denominator= {10,0};
			
			System.out.println(numerator/denominator[1]);
		}catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
	}
	
	public void useFinallyBlock() {
		try {
			int numerator=20;
			int[] denominator= {10,0};
			
			System.out.println(numerator/denominator[1]);
		}catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}finally {
			System.out.println("inside finally...");
		}
	}
	
}

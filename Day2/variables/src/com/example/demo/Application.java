package com.example.demo;

public class Application {
	public static void print(CreditCard card) {
		System.out.println(card.getCardHolderName());
		System.out.println(card.getCardNumber());
		System.out.println(CreditCard.getCardProvider()); //we have to access static method by class name
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CreditCard card= new CreditCard(1010101028, "Sibashish");
		/** 
		 * since print is static method of same class it can be call without Application.print
		 */ 
		//Application.print(card);
		
		LocalAndParameterExample obj= new LocalAndParameterExample();
		obj.usingLocal();
		obj.usingInstance();
		System.out.println(card.getCardHolderName());
		obj.usingParameter(card);
		System.out.println(card.getCardHolderName());
		 
		int num=90;
		obj.usingPrimitive(num);
		System.out.println("number "+num);
		
		

	}

}

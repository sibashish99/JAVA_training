package com.example.demo;

public class LocalAndParameterExample {
    private int number;
    private static String name="Sibashish";
    
    public void usingLocal() {
    	int age=1;  //local var need to be initialized
    	System.out.println(age);
    }
    public void usingInstance(){
    	System.out.println(number);  // instance var have default value
    }
    //passing arg => parameter var
    public CreditCard usingParameter(CreditCard card) {
    	// instance method can access both static and instance var
    	System.out.println(name);
    	System.out.println(number);
    	card.setCardHolderName("mr "+card.getCardHolderName());
    	
    	return card;
    }
    public  void usingInstance1() {
    	// static method can access static var
    	System.out.println(number);
    }
    public int usingPrimitive(int num) {
    	
    	return num;
    }
}

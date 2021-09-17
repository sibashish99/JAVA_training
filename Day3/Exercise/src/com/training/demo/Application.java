package com.training.demo;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreditCard ram1= new CreditCard(101, "ram1 reddy");
		CreditCard ram2= new CreditCard(102, "ram2 sharma");
		CreditCard ram3= new CreditCard(103, "ram3 reddy");
		
		CreditCardService service= new CreditCardService();
		
		service.addList(ram1);
		service.addList(ram2);
		service.addList(ram3);
		
		CreditCard[] list=service.getList(); 
		
		int countR=0;
		int countS=0;
		for(CreditCard eachCard: list) {
			String name= eachCard.getCardHolderName();
			if(name.contains("reddy")) {
				countR++;
			}
			else {
				countS++;
			}
			System.out.println(eachCard);
		}
		
		System.out.println("Nos of Reddy "+countR+" nos of sharma "+countS);
		
		
	}

}

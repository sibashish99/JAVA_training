package com.training.demo;

public class Application {
  public static void main(String[] args) {
	SavingsAccount account= new SavingsAccount(114,1300,"Sibashish");
	
	account.deposit(1000);
	account.deposit(124);
	
	System.out.println("Expectes 2424 =>"+account.getBalance());
	
	account.withdraw(500);
	System.out.println("Expectes 1924=>"+account.getBalance());
	System.out.println(account.showGreeting());
	
	BankAccount parent = new SavingsAccount(115, 12500, "Siba");
	//System.out.println(parent.showGreeting()); // error because showGreeting is there in superclass
    
	System.out.println(((SavingsAccount)parent).showGreeting()); //dynamic method dispatch
  
  } 
}

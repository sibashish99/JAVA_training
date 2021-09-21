package com.example.thread;

public class BankAccount {
   private double balance;
   public synchronized double deposite(double amopunt) {
	   balance = this.balance + amopunt;
	   
	   notifyAll();
	   return this.balance;
   }
   public synchronized double withdraw(double amount) {
	   while(this.balance< amount) {
		   System.out.println("waiting for the amount to be trasffered");
		   try {
			wait();
		   } catch (Exception e) {
			 e.printStackTrace();
		   }
	   }
	   this.balance= this.balance - amount;
	   return this.balance;
   }
}

package com.training.demo;

public abstract class BankAccount {
	private int accountNumber;
	private double balance;
	
	
	public BankAccount(int accountNumber,  double balance) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
	}


	public int getAccountNumber() {
		return accountNumber;
	}


	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public double getBalance() {
		return balance;
	}


	
	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "BankAccount [accountNumber=" + accountNumber + ", balance=" + balance + "]";
	}


	public abstract double deposit(double amount) ;
	public abstract double withdraw(double amount);
	 
	public String showGreeting() {
		return "Welcome msg...";
	}
	
	
}

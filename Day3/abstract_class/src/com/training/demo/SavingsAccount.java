package com.training.demo;

public class SavingsAccount extends BankAccount {
     
	public String nominee;
	
	public SavingsAccount(int accountNumber, double balance, String nominee) {
		super(accountNumber, balance);
		this.nominee = nominee;
	}
	
	public String getnominee() {
		return nominee;
	}

	public void setnominee(String nominee) {
		this.nominee = nominee;
	}


	@Override
	public double deposit(double amount) {
		// TODO Auto-generated method stub
		double currentBalance= getBalance();
		setBalance(currentBalance+amount);
		return (currentBalance+amount);
	}

	@Override
	public double withdraw(double amount) {
		
		// TODO Auto-generated method stub
		double currentBalance= getBalance();
		
		if((currentBalance-amount)>1000) {
			setBalance(currentBalance-amount);
			
		}else {
			System.out.println("Exiciding min limit...");
		}
		return (currentBalance-amount);
		
	}
	
	

}

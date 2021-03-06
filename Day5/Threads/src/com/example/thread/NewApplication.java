package com.example.thread;
class DepositTask implements Runnable{
	BankAccount account;

	public DepositTask(BankAccount account) {
		super();
		this.account = account;
		Thread t1 = new Thread(this);
		t1.start();
	}
	public void run() {
		System.out.println("amount after deposit=" +account.deposite(4000));
	}
}


class withdrawTask implements Runnable{
	BankAccount account;

	public withdrawTask(BankAccount account) {
		super();
		this.account = account;
		Thread t2=new Thread(this);
		t2.start();
	}
	
	public void run() {
		System.out.println("amount after withdraw=" +account.withdraw(4000));
	}
	
	
	
}

public class NewApplication {

	public static void main(String[] args) {
	
		BankAccount account = new BankAccount();
		
	  
		new DepositTask(account);
		new withdrawTask(account);
	
		

	}

}

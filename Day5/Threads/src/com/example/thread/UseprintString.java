package com.example.thread;

public class UseprintString implements Runnable {

	private String s1;
	private String s2;
	
	public UseprintString(String s1, String s2) {
		super();
		this.s1 = s1;
		this.s2 = s2;
		Thread thread = new Thread(this);
		thread.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		PrintStrings.print(s1, s2);
	}

}

package com.example.thread;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Runnable TenCounter= new count(10); 
	        Thread t1= new Thread(TenCounter,"10th");
//	        Thread t2= new Thread(TenCounter,"Second");
//	        Thread t3= new Thread(TenCounter,"Third");
	        
	        t1.start();
//	        t2.start();
//	        t3.start();
	        Thread.sleep(1000);
	        Runnable hTenCounter= new count(100); 
	        Thread t2= new Thread(hTenCounter,"100th");
	        t2.start();
	        
	        
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}

package com.example.thread;

public class TaskJoin implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
	   System.out.println("Started reading....");
       try {
		System.in.read();
	   }catch (Exception e) {
		e.printStackTrace();
	   }
       System.out.println("Finished reading");
	}

}

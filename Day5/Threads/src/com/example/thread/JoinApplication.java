package com.example.thread;

public class JoinApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         System.out.println("main started");
         TaskJoin task= new TaskJoin();
         Thread t1= new Thread(task);
         t1.start();
         try {
			t1.join();
		} catch (Exception e) {
			e.printStackTrace();
		}
         System.out.println("main finieshed");
	}

}

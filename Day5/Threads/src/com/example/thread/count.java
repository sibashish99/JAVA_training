package com.example.thread;

public class count implements Runnable{
	
	   @SuppressWarnings("unused")
	   private int countUpTo;
	   
	   NewCounter obj=null;
       public count(int countUpTo) {
		super();
		this.countUpTo = countUpTo;
		 obj= new NewCounter(countUpTo);
	  }


	@Override
       public void run() {
//    	   System.out.println("Thread => " + Thread.currentThread().getName());
//    	   for(int i=1; i<=5;i++) {
//    		   System.out.println(i);
//    	   }
		System.out.println(Thread.currentThread().getName()+" sum => " +obj.sumNumber());
    	   
       }
}

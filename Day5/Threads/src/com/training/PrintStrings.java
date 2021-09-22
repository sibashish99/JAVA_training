package com.training;
//Executable eg
public class PrintStrings {
   public synchronized static void print(String s1, String s2) {
	   System.out.println(s1);
	   
	   try {
		 Thread.sleep(500);
	    }catch (InterruptedException e) {
		 e.printStackTrace();
	   }
	   
	   System.out.println(s2);
   }
}

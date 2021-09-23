package com.training;

import java.util.Arrays;
//import java.util.function.Predicate;

public class UsingLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//       Runnable task=() ->{
//    	   for(int i=0;i<5;i++) {
//    		   System.out.println(i);
//    	   }
//       };
//       Thread thread= new Thread(task);
//       thread.start();
	
	Condition passMark = () -> "ramesh".length() > 10;
	
	System.out.println(passMark.test());
	System.out.println(passMark.show());
	
//	Predicate<Integer> isPassMark = (mark) -> mark>60; 
//			
//	System.out.println("status "+isPassMark.test(74));
//	}
		
//    String[] nameList = { "Ramesh", "anand", "Suresh", "Anand", "Magesh" }; 
//    Arrays.sort(nameList, String::compareToIgnoreCase); 
//    for(String name:nameList) {
//       System.out.print(name+" "); 
//	}
 }
		
		
}

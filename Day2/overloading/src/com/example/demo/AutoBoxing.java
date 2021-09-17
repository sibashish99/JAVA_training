package com.example.demo;

public class AutoBoxing {
	public static void print(int a , int b) { 
		System.out.println(a+b);
	}
	public static void printUsingWrapper(Integer a , Integer b) { 
		System.out.println(a+b+100);
		//System.out.println(a.intValue() +b.intValue() +100);
		
	}
	

	public static void main(String[] args){
		// TODO Auto-generated method stub
		print(56,44);
		printUsingWrapper(56,44); //primitive into object => autoboxing
        //printUsingWrapper(new Integer(56),new Integer(44)); 

	}

}

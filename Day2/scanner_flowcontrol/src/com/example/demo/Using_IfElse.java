package com.example.demo;

public class Using_IfElse {
   public static void main(String[] args) {
	 int mark=67;
	 if(mark>60) {
		 System.out.println("Good mark");
	 }
	 else {
		 System.out.println("Avg");
	 }
	 
	 String message1="Hello World";
	 String message2="Hello World";
	 
	 System.out.println(message1==message2);
	 System.out.println(message1.equals(message2));
	 
	 String message3= "Hello";
	 String message4=message3;
	 
	 System.out.println(message3==message4);
	 System.out.println(message3.equals(message4));
	 
	 
	 String message5= new String("Hello");
	 String message6=new String("Hello");
	 
	 System.out.println(message5==message6);
	 System.out.println(message5.equals(message6));
	 
	 
	 Student ram1= new Student(101,"ram",85,"ram@abc.com");
	 Student ram2= new Student(101,"ram",85,"ram@abc.com");
	 
	 System.out.println("is both are same? " + ram1.equals(ram2));
	 
	   
	   
	 
  }
}

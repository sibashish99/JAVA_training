package com.training;
public class Application {

	public static void main(String[] args) {
		
           Student ram= new Student();
           System.out.println(ram.email);
           //System.out.println(ram.rollNumber); //rollno is marked private in same pkg another class
           System.out.println(ram.markScored);
           System.out.println(ram.studentName);
           
	}

}

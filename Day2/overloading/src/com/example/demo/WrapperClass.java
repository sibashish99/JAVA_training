package com.example.demo;

public class WrapperClass {

	public static void main(String[] args) {
		
		 int rollNumber= Integer.parseInt(args[0]);
		 String studentName= args[1];
		 double markScored=Double.parseDouble(args[2]);
		 String email= args[3];
		
		// TODO Auto-generated method stub
         Student ram = new Student (rollNumber, studentName, markScored, email);
         System.out.println(ram.getMarkScored()+" "+ram.getEmail()+" "+ram.getRollNumber()+" "+ram.getStudentName());
	
	     int phone= 22344;
	     String strPhone= Integer.toString(phone);
	     System.out.println(strPhone+" "+strPhone.length());
	}

}

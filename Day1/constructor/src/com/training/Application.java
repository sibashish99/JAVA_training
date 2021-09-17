package com.training;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Student ram = new Student();
         ram.setRollNumber(14);
         ram.setStudentName("Ram Sharma");
         ram.setEmail("ramlumen@.com");
         ram.setMarkScored(92.5);
         
         
         System.out.println(ram.getEmail()+" "+ram.getStudentName()+" "+ram.getMarkScored()+" "+ram.getRollNumber());
	      
         Student sham= new Student(13 ,"Sham Sharma",83, "sham@abc.com");
         System.out.println(sham.getEmail()+" "+sham.getStudentName()+" "+sham.getMarkScored()+" "+sham.getRollNumber());
          
         
	}

}

package com.example.demo;

public class Overloaded {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student Sibashish=new Student(101,"Sibashish", 90, "Sibashish@abc.com");
		Student ram=new Student(102,"ram", 70, "ram@abc.com");
		
		StudentService service= new StudentService();
		
		
		System.out.println("Sibashish grade is O =>"+service.assignGrade(Sibashish,"Urban"));
		System.out.println("Rams grade is A => "+service.assignGrade(ram));
	}

}

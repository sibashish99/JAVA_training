package com.example.demo;
import java.util.*;

public class UsingScanner {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter roll");
		int rollNumber= sc.nextInt();
		
		System.out.println("Enter name");
		String studentName= sc.next();
		
		System.out.println("Enter roll");
		double markScored= sc.nextDouble();
		
		System.out.println("Enter email");
		String email= sc.next();
		
		Student obj= new Student(rollNumber,studentName,markScored,email);
		System.out.println(obj.getStudentName()+" "+obj.getEmail()+" "+obj.getMarkScored()+" "+obj.getRollNumber());
		
		sc.close();

	}

}

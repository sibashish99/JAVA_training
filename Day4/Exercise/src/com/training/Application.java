package com.training;

import java.util.*;

import com.training.ifaces.Billable;

public class Application {
	
	public static void printSalary(Billable[] bill,Object obj) {
		
		for(Billable x:bill) {
		
		System.out.println(x.getClass()+" salary : "+x.calculate(obj));
		}
		
	}

	public static void main(String[] args) {

		CivilEngineer civil = new CivilEngineer();
		SoftwareEngineer software = new SoftwareEngineer();
		Advocate advocate = new Advocate();
		
		System.out.println("Enter the amount");
		
		Scanner sc = new Scanner(System.in);
		
		double salary = sc.nextDouble();
		
		Object obj = Double.valueOf(salary);
		
		Billable[] bill = {civil,software,advocate};
		
		printSalary(bill, obj);
		
		sc.close();
		

	}

}

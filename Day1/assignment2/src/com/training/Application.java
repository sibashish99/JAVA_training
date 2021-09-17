package com.training;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1= new Employee();
		e1.setSalary(0);
		System.out.println(e1.getSalary());
		
		System.out.println("----------------------");
		
		e1.setSalary(6780);
		System.out.println(e1.getSalary());
		
		System.out.println("----------------------");
		Employee e2= new Employee();
		e2.setEmployeeId(319951);
		e2.setEmployeeName("Sibashish Biswas");
	    e2.setSalary(7000);
	    
	    System.out.println( e2.getEmployeeId()+" "+e2.getEmployeeName() +" "+e2.getSalary());
	    
	    
		
		

	}

}

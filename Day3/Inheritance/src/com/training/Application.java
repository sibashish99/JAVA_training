package com.training;

public class Application {

	public static void main(String[] args) {
      //Book book1= new Book(101, "abc","bvc",100);
      //System.out.println(book1);
		
//		Insurance lifeInsurance= new Insurance(100, "Sibashish",200000);
//		System.out.println("insurance is 100000 =>"+lifeInsurance.calculatePremium());
		
		VehicleInsurance vehicleInsurance= new VehicleInsurance(1000,"Sibashish",60000,"bike");
		System.out.println("insurance is 800=>"+vehicleInsurance.calculatePremium());
	}

}

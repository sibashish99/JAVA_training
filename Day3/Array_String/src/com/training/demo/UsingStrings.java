package com.training.demo;

public class UsingStrings {

	public static void main(String[] args) {
		String city="Hydrabad";
		String firstName="RAMESH";
		String lastName="sharma";
		
		System.out.println("Length =>"+city.length());
		System.out.println("lower =>"+firstName.toLowerCase());
		System.out.println("upper =>"+lastName.toUpperCase());
		System.out.println("Subs =>"+city.substring(0,5));
		System.out.println("Char at position 3 =>"+ city.charAt(3));
		System.out.println("index of y =>"+city.indexOf("y"));
	}

}

package com.example.demo;

public class PrimitiveCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int age=23;
        long maxAge= age;
        
        long sal=45000;
        int salary= (int)(sal); //casting long to int => down casting 
        
        System.out.println(maxAge+" "+salary);
        
        
        
	}

}

package com.training;
import java.util.*;
public class MapApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		   Student ram= new Student(111,"Sibashish1",92,"siba@abc.com");	
		   Student ram1= new Student(103,"Sibashish1",92,"siba@abc.com");
		   
		   HashMap<Integer, Student> list= new HashMap<>();
		   
		   list.put(200, ram);
		   list.put(201, ram1);
		   Object obj= list.put(201, ram1);
		   
		   System.out.println(obj);
		   System.out.println(list.get(201));
		   	
		   
		   
	}

}

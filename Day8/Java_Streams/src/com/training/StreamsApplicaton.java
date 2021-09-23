package com.training;

import java.util.List;
import java.util.function.Predicate;

public class StreamsApplicaton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          StudentService service= new StudentService();
          
//          System.out.println("Mark get above 90..");
//          //List<Student> mark= service.useFilter();
//          //mark.forEach(System.out::println);
//          service.useFilter().forEach(System.out::println);
        
//          System.out.println("Greater than 90 ...");
//          Predicate<Student> condition= e -> e.getMarkScored() >85;
//          service.useFilter(condition).forEach(System.out::println);
          
//          service.getStudentName().forEach(System.out::println);
//          System.out.println("---------------");
//          service.transformToMap().forEach((key,value) -> System.out.println(key+" => "+value));
            
           //System.out.println("Highest mark "+ service.highestMark());
            
            System.out.println("Sorted...");
            service.sortedByName().forEach(System.out::println);
          
	}

}

package com.training;
import java.time.LocalDate;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
public class BuiltInFunctionalInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<String> names= Arrays.asList("ramesh","suresh","magesh"); 
        List<String> cities= Arrays.asList("chennai","mumbai","delhi"); 
       // Arrays.sort(names);
//        for(String each:names) {
//        	System.out.println(each);
//        }
//        System.out.println("-------------");
//        names.forEach(e -> System.out.println(e));
//        
//        System.out.println("-----------------");
//        Consumer<String> print= (e) ->  System.out.println(e);
//        names.forEach(print);
//        cities.forEach(print);
        
//        System.out.println("-----------------");
//        Consumer<String> print1= System.out::println;
//        names.forEach(print1);
//        cities.forEach(print1);
        
        Student ram= new Student(101,"ram1",LocalDate.now(),95);
        Predicate<Student> result= (obj) -> obj.getMarkScored()>80;
        System.out.println("result "+result.test(ram));
        
        
        Supplier<String> message = () -> "happy diwali";
        System.out.println("Greeting "+message.get());
        
        Function<String, Integer> func= (arg) -> arg.length();
        System.out.println(func.apply(message.get()));
	}

}

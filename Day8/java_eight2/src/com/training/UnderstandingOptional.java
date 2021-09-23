package com.training;
import java.util.Optional;
public class UnderstandingOptional {
     
	public static String getMessage(int key) {
		switch (key) {
		case 1:
			return "Happy birthday";
		case 2:
			return "Happy diwali";
		case 3:
			return "Happy Puja";
		default:
			return null;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //System.out.println(getMessage(4).toUpperCase());
          Optional<String> res= Optional.ofNullable(getMessage(4));
        
//        if(res.isPresent()) {
//        	System.out.println(res.get().toUpperCase());
//        }
//        else {
//        	System.out.println("Invalid choice");
//        }
        
        //res.orElseThrow(RuntimeException::new);
        
        System.out.println( res.orElseGet( () ->getMessage(2).toUpperCase()));
	}

}
/*
 public class UnderstandingOptional {

	public static  String getMessage(int key) {
		switch(key) {
		case 'a':
			return "happy birthday";
		case 'b':
			return "diwali";
		case 'c':
			return "dussera";
		default:
			return null;
		}
	}
	public static Optional<String> getMessage(char key) {
		switch(key) {
		case 'a':
			return Optional.of("happy birthday");
		case 'b':
			return Optional.of("diwali");
		case 'c':
			return Optional.of("dussera");
		default:
			return Optional.empty();
		}
	}
	public static void main(String[] args) {
	//	System.out.println(getMessage(4).toUpperCase());
		Optional<String> resp=Optional.ofNullable(getMessage(4));
//		if(resp.isPresent()) {
//			System.out.println(resp.get().toUpperCase());
//		}
//		else {
//			System.out.println("invalid choice");
//		}
	//	resp.orElseThrow(RuntimeException::new);
		
		System.out.println(resp.orElseGet(  ()-> getMessage(2)));
		
		Optional<String> value=getMessage('a');
		if(value.isPresent()) {
			System.out.println(value.get());
		}
	}
} 
 */



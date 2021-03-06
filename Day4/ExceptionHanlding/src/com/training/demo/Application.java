package com.training.demo;
import java.util.InputMismatchException;
import java.util.Scanner;
import com.training.Student;
import com.training.demo.exception.RangechangeException;


public class Application {

	public static void main(String[] args) {
		
	 MyExceptionHandler handler = new MyExceptionHandler();
		
	//handler.usingMultiCatch("four");
		
	 try (Scanner sc= new Scanner(System.in);){
		    System.out.println("Enter choice [1/2/3/4/5/6]");
		    int key=sc.nextInt();
			
			switch (key) {
			 case 1: 
				handler.usingClassCastException();
				break;
	         case 2: 
				handler.usingMultiCatch("234");
				break;
	         case 3:
				handler.tryWithMultipleCatch();
				break;
	         case 4:
	        	handler.useFinallyBlock();
	        	break;
	         case 5:
	        	 Student ram= new Student();
	        	 ram.setMarkScored(85);
	        	 System.out.println(ram.getMarkScored());
	        	 break;
	         case 6:
	        	 Student ram1= new Student(201, "ram1",78,"hysdu@.com");
	        	  System.out.println(ram1.getMarkScored());
	        	  System.out.println(ram1);
	        	 break;
			 default:
				break;
			
		    } 
			sc.close();
			
	   } catch (InputMismatchException | RangechangeException e) {
		 // TODO: handle exception
		   System.err.println("Exception...");
		  
	   }
	
	}

}

package com.example.demo;
import java.util.*;
import org.apache.log4j.Logger;
public class App 
{
    
	public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
    	
		 Logger log = Logger.getRootLogger();
	     System.out.println("Enter the number");
	      try(Scanner sc = new Scanner(System.in);) {
	            
	            double number = sc.nextDouble();
	            log.info("You entered number: "+number);
	            
	            if(number<0) {
	                log.error("number should be positive integer");
	                
	                throw new Exception("Invalid Number");
	            }
	            
	            double result = Math.sqrt(number);
	            log.info("Completed Square Root:="+result);
	            
	        } catch (Exception e) {
	            
	            log.debug(e.getMessage());
	            e.printStackTrace();
	            
	        }
    }
}

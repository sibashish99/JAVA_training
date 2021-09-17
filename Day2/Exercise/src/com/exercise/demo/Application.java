package com.exercise.demo;
import java.util.*;
public class Application {

	public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        boolean flag=true;
        
        while(flag) {
        	System.out.println("Enter item :");
            long itemId= sc.nextLong();
            
            System.out.println("Enter name :");
            String itemName= sc.next();
            
            System.out.println("Enter per unit :");
            int ratePerUnit= sc.nextInt();
            
            System.out.println("Enter cata :");
            String catagory= sc.next();
            
            System.out.println("Enter customer type :");
            String customerType= sc.next();
            
            Item item = new Item(itemId,itemName,ratePerUnit,catagory);
            Customer ram = new Customer(customerType);
            
            ItemService discount= new ItemService();
            System.out.println("Discount is: "+discount.findDiscount(item));
            System.out.println("Discount is: "+discount.findDiscount(item,ram));
            
            
            System.out.println("Do you want continue (true/false)");
            flag= sc.nextBoolean();
            
            sc.close();
        }
        
        
        
        
        
        
        
	}

}

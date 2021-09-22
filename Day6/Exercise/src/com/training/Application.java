package com.training;
import java.util.ArrayList;

 
public class Application {

 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
   
    	ProductService ser = new ProductService();
        
        FoodItem food1 = new FoodItem(1, "milk", 5, 10, true);
        FoodItem food2 = new FoodItem(2, "sugar", 4, 20, true);
        FoodItem food3 = new FoodItem(3, "rice", 6, 30, true);
        FoodItem food4 = new FoodItem(4, "rice", 10, 30, true);
        
        
        ser.addItem(food1);
        ser.addItem(food2);
        ser.addItem(food3);
        ser.addItem(food4);
        
        System.out.println("FoodItem ordering");
        ser.print();
        
        Electronics e1 = new Electronics(1, "mobile", 25, 40, 2);
        Electronics e2 = new Electronics(2, "laptop", 14, 40, 3);
        Electronics e3 = new Electronics(3, "printer", 3, 40, 4);
        
        ser.addItem(e1);
        ser.addItem(e2);
        ser.addItem(e3);
        
        
        ArrayList<Product>l=ser.get();
        
        System.out.println(l.size());
        
        System.out.println("Electronics Item ordering");
        
        ser.print();
        
        
        

 

    }

 

}

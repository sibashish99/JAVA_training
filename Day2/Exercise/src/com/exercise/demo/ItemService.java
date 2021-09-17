package com.exercise.demo;

public class ItemService {
	   public double findDiscount(Item item) {
		   double discount= (item.getRatePerUnit() * 0.05);
		   return discount;
	   }
	   
	   public double findDiscount(Item item,Customer customer) {
		   double unit = item.getRatePerUnit();
		   String type=(customer.getCustomerType()).toLowerCase();
		   
		   double discount=0;
		   if(type.equals("corporate")) {
			   discount=(unit * 0.15);
		   }
		   else {
			   discount =(unit*0.10);
		   }
		   return discount;
	   }
}

package com.exercise.demo;

public class Customer {
   private String customerType;
   public Customer() {
	 super();
	// TODO Auto-generated constructor stub
   }
   public Customer( String customerType) {
	 super();
	 this.customerType = customerType;
   }
   public String getCustomerType() {
	 return customerType;
   }
   public void setCustomerType(String customerType) {
	 this.customerType = customerType;
   }
   
}

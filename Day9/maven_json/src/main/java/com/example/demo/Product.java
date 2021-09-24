package com.example.demo;

public class Product {
   private int id;
   private String productName;
   private double ratePerUnit;
   public Product() {
	super();
	// TODO Auto-generated constructor stub
  }
   public Product(int id, String productName, double ratePerUnit) {
	super();
	this.id = id;
	this.productName = productName;
	this.ratePerUnit = ratePerUnit;
   }
   public int getId() {
	return id;
   }
   public void setId(int id) {
	this.id = id;
   }
   public String getProductName() {
	return productName;
    }
   public void setProductName(String productName) {
	this.productName = productName;
   }
   public double getRatePerUnit() {
	return ratePerUnit;
   }
   public void setRatePerUnit(double ratePerUnit) {
	this.ratePerUnit = ratePerUnit;
    }
   @Override
   public String toString() {
	 return "Product [id=" + id + ", productName=" + productName + ", ratePerUnit=" + ratePerUnit + "]";
    }
   
   
}

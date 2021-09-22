package com.training;

public class Apreal extends Product{
	
	 private int size;
	 private String material;
	 
	 public Apreal(int itemCode, String itemName, double quantity, double unitPrice, int size, String material) {
			super(itemCode, itemName, quantity, unitPrice);
			// TODO Auto-generated constructor stub
			this.size=size;
			this.material=material;
		}
	

}

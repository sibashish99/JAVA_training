package com.exercise.demo;

public class Item {
	    private long itemId; 
	    private String itemName; 
	    private int ratePerUnit;
	    private String catagory;
	    
		public Item() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Item(long itemId, String itemName, int ratePerUnit, String catagory) {
			super();
			this.itemId = itemId;
			this.itemName = itemName;
			this.ratePerUnit = ratePerUnit;
			this.catagory = catagory;
		}

		public long getItemId() {
			return itemId;
		}

		public void setItemId(long itemId) {
			this.itemId = itemId;
		}

		public String getItemName() {
			return itemName;
		}

		public void setItemName(String itemName) {
			this.itemName = itemName;
		}

		public int getRatePerUnit() {
			return ratePerUnit;
		}

		public void setRatePerUnit(int ratePerUnit) {
			this.ratePerUnit = ratePerUnit;
		}

		public String getCatagory() {
			return catagory;
		}

		public void setCatagory(String catagory) {
			this.catagory = catagory;
		}
	    
}

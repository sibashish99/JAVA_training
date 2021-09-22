package com.training;

public abstract class Product implements Comparable<Product> {
    
    private int itemCode;
    private String itemName;
    private double quantity;
    private double unitPrice;

    public Product(int itemCode, String itemName, double quantity, double unitPrice) {
        super();
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    @Override
    public String toString() {
        return "Product [itemCode=" + itemCode + ", itemName=" + itemName + ", quantity=" + quantity + ", unitPrice="
                + unitPrice + "]";
    }

 
    @Override
    public int compareTo(Product o) {
        return (this.quantity<o.quantity)?1:-1;
    }

 

}
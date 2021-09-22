package com.training;

public class Electronics extends Product {
    
    private int warrantyMonths;

    public Electronics(int itemCode, String itemName, double quantity, double unitPrice, int warrantyMonths) {
        super(itemCode, itemName, quantity, unitPrice);
        this.warrantyMonths = warrantyMonths;
    }

}

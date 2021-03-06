package com.training.demo;
import java.util.Arrays;

public class CreditCardService {
	private CreditCard[] cardHolderList;
    private static int maxSize =3;
    private static int count=0;
    
	public CreditCardService(CreditCard[] cardHolderList) {
		super();
		this.cardHolderList = cardHolderList;
	}
	
	public CreditCardService() {
		super();
		this.cardHolderList=new CreditCard[maxSize];
	}
	
	public boolean addList(CreditCard creditcard) {
		if(count<maxSize) {
			this.cardHolderList[count]= creditcard;
			count++;
			return true;
		} else {
			System.out.println("Array size full..");
			return false;
		}
	}
	public CreditCard[] getList() {
		return this.cardHolderList;
	}

    
    
}

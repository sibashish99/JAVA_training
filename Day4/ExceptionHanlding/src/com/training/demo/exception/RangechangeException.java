package com.training.demo.exception;

public class RangechangeException extends Exception {
	/*
	 * if we extend exception => checked
	 * if RuntimeException => unchecked
	 * */
    private  String message;
    
    public RangechangeException(String message) {
    	super(message);
    	this.message= message;
    }
    
	@Override
	public String getMessage() {
		return "Exception: ="+message;
	}
    
    
    
} 

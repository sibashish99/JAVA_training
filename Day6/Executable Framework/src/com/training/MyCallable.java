package com.training;
import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {

	private String message;
	
	

	public MyCallable(String message) {
		super();
		this.message = message;
	}


	@Override
	public String call() throws Exception {
		return ("Hello - "+message);
	}
     
}

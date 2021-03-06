package com.training;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MyCallabeApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   ExecutorService service = Executors.newFixedThreadPool(3); 
		   Callable task = new MyCallable("Sibashish");
		   Future<String> result= service.submit(task);
		   
		   try {
			  System.out.println("Task completed? "+result.isDone());
			  System.out.println(result.get());
			  System.out.println("Task completed? "+result.isDone());
		   } catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		  }
		   
		   service.shutdown();
	}

}

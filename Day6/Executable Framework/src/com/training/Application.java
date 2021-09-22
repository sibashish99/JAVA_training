package com.training;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.example.thread.UseprintString;

public class Application {

	public static void main(String[] args) {
		Runnable task1= new UseprintString("idli","sambar");
		   Runnable task2=new UseprintString("idli1","sambar1");
		   Runnable task3=new UseprintString("idli2","sambar2");
		   
		   Runnable[] taskList= {task1,task2,task3};
		   //ExecutorService executors = Executors.newSingleThreadExecutor() ;
		   ExecutorService executors = Executors.newFixedThreadPool(3); 
		   
		   for(Runnable each: taskList) {
			   executors.submit(each);
		   }
		   executors.shutdown();
		
	}
		   
         
	

}

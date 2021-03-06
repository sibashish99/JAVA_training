package com.training;
import com.training.services.BookServiceImp;
import com.training.services.ObjectBookServiceStream;
import com.training.ifaces.BookService;
import com.training.model.Book;

public class Application {

	public static void main(String[] args) {
		System.out.println("Main thread => "+Thread.currentThread().getName());
	  BookService  service=new BookServiceImp();
	  ObjectBookServiceStream obj= new ObjectBookServiceStream();
      int key =4;
       
      try {
       switch(key) {
	    case 1: 
		  Book book= new Book(102,"adbcd2","1saab",300);
		  boolean result=service.write(book);
		  if(result) {
			  System.out.println("added to the file");
		  }
		  break;
	    
	    case 2:
	    	Book[] list= service.read();
	    	for(Book each:list) {
	    		if(each!=null) {
	    			System.out.println(each);
	    		}
	    	}
	    	break;
	    case 3:
	    	Book book1= new Book(103,"java","abc",101);
	    	
	    	boolean status= obj.write(book1);
	    	
	    	if(status) {
	    		System.out.println("book serialized...");
	    	}
	    	break;
	    case 4:
	    	Book[] list1= obj.read();
	    	System.out.println(list1[0]);
	    	break;
	    default:
		throw new IllegalArgumentException("Unexpected value: " + key);
	    }
      }catch(Exception e) {
    	  e.printStackTrace();
      }
	}

}

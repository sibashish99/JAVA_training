package com.training.services;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.training.ifaces.BookService;
import com.training.model.Book;

public class ObjectBookServiceStream implements BookService {

	@Override
	public boolean write(Book book) throws IOException {
	    boolean result=false;
	    try (ObjectOutputStream outStream= new ObjectOutputStream(new FileOutputStream(new File("book.ser")))){
	    	outStream.writeObject(book);
	    	result= true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public Book[] read() throws IOException {
		Book[] bookList= new Book[2];
		int pos=0;
		
		try(ObjectInputStream inputStream= new ObjectInputStream(new FileInputStream(new File("book.ser")))) {
			Book bk= (Book)inputStream.readObject();
			bookList[pos]=bk;
			pos++;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return bookList;
	}

	

}

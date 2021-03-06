package com.training.services;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import com.training.ifaces.BookService;
import com.training.model.Book;

public class BookServiceImp implements BookService {

	public boolean write(Book book) throws IOException {
		boolean result = false;
		try(PrintWriter writer= new PrintWriter(new FileWriter("book.txt",true))){
             writer.println(book.toString());
             result= true;
		}catch (IOException e){ 
			e.printStackTrace();
		} 
		return result;
	}

	@Override
	public Book[] read() throws IOException {
		Book[] bookList = new Book[3];
		try(BufferedReader reader = new BufferedReader(new FileReader("book.txt"))){
			
			String line= null;
			int pos=0;
			while((line=reader.readLine())!=null) {
		
				String[] value=line.split(",");
				Book book= new Book(Integer.parseInt(value[0]),value[1],value[2],Double.parseDouble(value[3]));
				bookList[pos]=book;
				pos++;
			}
		}catch (IOException e){ 
			e.printStackTrace();
		}
		return bookList;
	}

}

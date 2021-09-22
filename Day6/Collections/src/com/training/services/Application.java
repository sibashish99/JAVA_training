package com.training.services;

import com.training.Book;
import com.training.comp.AuthorComparator;
import com.training.comp.BookNameComparator;
import com.training.ifaces.CrudRepository;
import java.util.*;
public class Application {
	public static void print(List<Book> bookList) {
		for(Book each:bookList) {
	     	   System.out.println(each);
	         }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Book book1= new Book(101,"java11","author11",101);
        Book book2= new Book(103,"java20","author02",102);
        Book book3= new Book(100,"java14","author85",103);
        
        CrudRepository  repo = new BookRepository();
        repo.add(book1);
        repo.add(book2);
        repo.add(book3);
        System.out.println("All books added..");
        
        
        
        List<Book> bookList=repo.findAll();
        print(bookList);
        
        //System.out.println("added book3 at position 2");
        //bookList.set(1, book3);
        //print(bookList);
        
        //System.out.println(bookList.size());
        //System.out.println(bookList.get(1));
        
        //sorting using comparator..

        System.out.println("Sorted by book no");
        Collections.sort(bookList);
        print(bookList);
        
        System.out.println("Sorted by book name");
        Collections.sort(bookList,new BookNameComparator());
        print(bookList);
        
        System.out.println("Sorted by author name");
        Collections.sort(bookList,new AuthorComparator());
        print(bookList);
	}

}

package com.training.comp;

import java.util.Comparator;

import com.training.Book;

public class BookNameComparator implements Comparator<Book> {
    
	@Override
	public int compare(Book o1, Book o2) {
		return o1.getBookName().compareTo(o2.getBookName());
	}
   
}

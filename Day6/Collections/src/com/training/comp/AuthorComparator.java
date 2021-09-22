package com.training.comp;

import java.util.Comparator;

import com.training.Book;

public class AuthorComparator implements Comparator<Book> {
    
	@Override
	public int compare(Book o1, Book o2) {
		// TODO Auto-generated method stub
		return o1.getAuthor().compareTo(o2.getAuthor());
	}

}

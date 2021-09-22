package com.training.services;
import java.util.*;
import com.training.Book;
import com.training.ifaces.CrudRepository;

public class BookRepository implements CrudRepository {
 
	private ArrayList<Book> bookList;
	
	public BookRepository() {
		super();
		// TODO Auto-generated constructor stub
		this.bookList= new ArrayList<>();
	}

	@Override
	public boolean add(Book book) {
		return this.bookList.add(book);
	}

	@Override
	public List<Book> findAll() {
		return this.bookList;
	}

	@Override
	public int update(Book book) {
		return 0;
	}

	@Override
	public boolean remove(Book book) {
		return this.bookList.remove(book);
	}

}

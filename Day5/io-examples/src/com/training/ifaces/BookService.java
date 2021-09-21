package com.training.ifaces;
import java.io.IOException;

import com.training.model.Book;

public interface BookService {
   public boolean write(Book book) throws IOException;
   public Book[] read() throws IOException;
}

package com.training.ifaces;
import java.util.*;
import com.training.*;

public interface CrudRepository {
   public boolean add(Book book);
   public List<Book> findAll();
   public int update(Book book);
   public boolean remove(Book book);
}

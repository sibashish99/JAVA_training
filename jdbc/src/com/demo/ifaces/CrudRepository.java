package com.demo.ifaces;
import java.sql.SQLException;
import java.util.*;

import com.demo.entity.Student;
public interface CrudRepository<T,E> {
    public boolean add(T t);
    public List<T> findAll() throws SQLException; 
    public int update(T t);
    public boolean remove(T t);
    public Student findBtId(E e);
}

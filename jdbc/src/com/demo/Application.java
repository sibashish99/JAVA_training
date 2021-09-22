package com.demo;

import com.demo.daos.StudentDaolmpl;
import com.demo.entity.Student;
import com.demo.ifaces.CrudRepository;
import com.demo.utils.DbConnection;
import java.util.*;

import java.sql.*;
import java.time.LocalDate;
public class Application {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
       //System.out.println(DbConnection.getOracleConnection());
		
		Connection cn=DbConnection.getOracleConnection();
		
		CrudRepository<Student> repo= new StudentDaolmpl(cn);
		
		int key=2;
		
		if(key==1) {
			Student ram= new Student(104,"ram4",LocalDate.of(1998, 5, 14),84);
			
			boolean res= repo.add(ram);
			
			if(res) {
				System.out.println("one student added");
			}
		}
		if(key==2) {
			List<Student> list= repo.findAll();
			
			for(Student each:list) {
				System.out.println(each);
			}
		}
		
	}

}

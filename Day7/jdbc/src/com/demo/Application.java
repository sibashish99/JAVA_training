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
		
		CrudRepository<Student,Integer> repo= new StudentDaolmpl(cn);
		
		int key=4;
		
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
		if(key==3) {
			Scanner sc= new Scanner(System.in);
			
			int n= sc.nextInt();
			
			Student st1=repo.findBtId(n);
			System.out.println(st1);
			
			sc.close();
		}
		if(key==4) {
			Student ram= new Student(104,"ram4",LocalDate.of(1998, 5, 14),84);
			boolean res=repo.remove(ram);
			if(res) {
				System.out.println("row deleted...");
			}
		}
		if(key==5) {
			Student st2=new Student(104,"ram4",LocalDate.of(1998, 5, 14),84);
			
			
			if(repo.update(st2)==1) {
				System.out.println("Updated.....");
			}
		}
	}

}

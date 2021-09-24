package com.training.entiry;
import com.training.annotation.Column;
import com.training.annotation.Table;

@Table(tableName= "Student")
public class Student {
	 @Column(name="rollNumber")
     private int id;
     
     @Column(name="firstName")
     private String name;
	 public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
     
}

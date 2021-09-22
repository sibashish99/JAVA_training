package com.demo.entity;
import java.time.LocalDate;

public class Student {
     private int rollNo;
     private String StudentName;
     private LocalDate dateOfBirth;
     private double markScored;
	
     public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int rollNo, String studentName, LocalDate dateOfBirth, double markScored) {
		super();
		this.rollNo = rollNo;
		this.StudentName = studentName;
		this.dateOfBirth = dateOfBirth;
		this.markScored = markScored;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getStudentName() {
		return StudentName;
	}

	public void setStudentName(String studentName) {
		StudentName = studentName;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public double getMarkScored() {
		return markScored;
	}

	public void setMarkScored(double markScored) {
		this.markScored = markScored;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", StudentName=" + StudentName + ", dateOfBirth=" + dateOfBirth
				+ ", markScored=" + markScored + "]";
	}
     
     
     
     
}

package com.training;
import java.time.LocalDate;
import java.util.Objects;

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

	@Override
	public int hashCode() {
		return Objects.hash(StudentName, dateOfBirth, markScored, rollNo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(StudentName, other.StudentName) && Objects.equals(dateOfBirth, other.dateOfBirth)
				&& Double.doubleToLongBits(markScored) == Double.doubleToLongBits(other.markScored)
				&& rollNo == other.rollNo;
	}
     
     
     
     
}

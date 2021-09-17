package com.example.demo;

public class StudentService {
   public String assignGrade(Student student) {
	   String grade="A";
	   if(student.getMarkScored() > 80) {
		   grade="O";
	   }
	   return grade;
   }
   
   public String assignGrade(Student student,String category) {
	   String grade="A";
	   if(category.equals("Urban")) {
		   if(student.getMarkScored() > 80) {
			   grade="O";
		   }
	   }
	   else {
		   if(student.getMarkScored() > 70) {
			   grade="O";
		   }
	   }
	   return grade;
   }
}

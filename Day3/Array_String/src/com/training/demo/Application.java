package com.training.demo;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Student ram=new Student(101,"ram",90,"ram@ABC.COM");
       Student ram2=new Student(102,"ram2",91,"ram2@ABC.COM");
       Student ram3=new Student(103,"ram3",92,"ram3@ABC.COM");
       Student ram4=new Student(104,"ram4",93,"ram4@ABC.COM");
       
       StudentService service= new StudentService();
       
       service.addStudent(ram);
       service.addStudent(ram2);
       service.addStudent(ram3);
       service.addStudent(ram3);
       
       /*
          booloan status=service.addStudent(ram4);
          if(!status) {
    	     System.out.println("Array size full..");
            }
        */
       Student[] list= service.getStudList();
       
       for(Student eachStudent: list) {
    	   System.out.println(eachStudent.getStudentName()+" "+eachStudent.getMarkScored());
       }
	}

}

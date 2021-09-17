package org.training;
import com.training.Student;

public class SecondApplication {

	public static void main(String[] args) {
		
		Student ram= new Student();
        System.out.println(ram.email);
        //System.out.println(ram.rollNumber); //rollno is marked private in same pkg another class
        //System.out.println(ram.markScored); // is protected & diff pack non subclass
        //System.out.println(ram.studentName); // is default package & diff package non subclass
	}

}

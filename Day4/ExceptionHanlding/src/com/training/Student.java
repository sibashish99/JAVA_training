package com.training;
import com.training.demo.exception.RangechangeException;

public class Student {
	//attribute hiding
   private int rollNumber;
   private String studentName;
   private double markScored;
   private String email;
   
   
   public Student() {
	   super();
   }
   
   public Student(int rollNumber, String studentName, double markScored, String email){
	 super();
	 this.rollNumber = rollNumber;
	 this.studentName = studentName;
	 /*
	  * as RangechangeException is checked exception 
      * it will follow handle or decalre rule
      * we can handling with try catch block....
	  * 
	  * */
	 try {
		 if(markScored>0 && markScored<=100) {
			  this.markScored = markScored;
		  }
		  else {
			  throw new RangechangeException("Invalid mark....");
		  }
		
	} catch (RangechangeException e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	 
	 
	 this.email = email;
   }

   public int getRollNumber() {
	 return rollNumber;
    }

   public void setRollNumber(int rollNumber) {
	  this.rollNumber = rollNumber;
    }

   public String getStudentName() {
	return studentName;
   }

   public void setStudentName(String studentName) {
	 this.studentName = studentName;
    }

   public double getMarkScored() {
	 return markScored;
   }
  
   /*
   * as RangechangeException is checked exception 
   * it will follow handle or decalre rule
   * we can declaring using throws clause....
   * */
   
   public void setMarkScored(double markScored) throws RangechangeException {
	  if(markScored>0 && markScored<=100) {
		  this.markScored = markScored;
	  }
	  else {
		  throw new RangechangeException("Invalid mark....");
	  }
	 
   }

   public String getEmail() {
	 return email;
   }

  public void setEmail(String email) {
	 this.email = email;
   }

@Override
public String toString() {
	return "Student [rollNumber=" + rollNumber + ", studentName=" + studentName + ", markScored=" + markScored
			+ ", email=" + email + "]";
}
   
  
   
   
   
}

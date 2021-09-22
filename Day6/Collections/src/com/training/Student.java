package  com.training;

import java.util.Objects;

public class Student implements Comparable<Student> {
	//attribute hiding
   private int rollNumber;
   private String studentName;
   private double markScored;
   private String email;
   
   
   public Student() {
	   super();
   }
   
   public Student(int rollNumber, String studentName, double markScored, String email) {
	 super();
	 this.rollNumber = rollNumber;
	 this.studentName = studentName;
	 this.markScored = markScored;
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

   public void setMarkScored(double markScored) {
	  if(markScored>0 && markScored<=100) {
		  this.markScored = markScored;
	  }
	  else {
		  System.out.println("Invalid mark");
	  }
	 
   }

   public String getEmail() {
	 return email;
   }

  public void setEmail(String email) {
	 this.email = email;
   }

  @Override
  public int hashCode() {
	return Objects.hash(email, markScored, rollNumber, studentName);
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
	return Objects.equals(email, other.email)
			&& Double.doubleToLongBits(markScored) == Double.doubleToLongBits(other.markScored)
			&& rollNumber == other.rollNumber && Objects.equals(studentName, other.studentName);
 }

  @Override
  public int compareTo(Student o) {
	if(this.rollNumber>o.rollNumber) return 1;
	if(this.rollNumber<o.rollNumber) return -1;
	return 0;
  }

@Override
public String toString() {
	return "Student [rollNumber=" + rollNumber + ", studentName=" + studentName + ", markScored=" + markScored
			+ ", email=" + email + "]";
}
  
  
   
  
   
   
   
}

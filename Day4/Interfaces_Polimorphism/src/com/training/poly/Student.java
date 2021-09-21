package com.training.poly;
import java.io.Serializable;
import com.training.ifaces.Condition;
/*
 * marker interface => doesn't not have any method
 * functional interface => has one abstract method
 * interface => with more than one abstract method  
 * */
public class Student extends Person implements Condition,Serializable {
   
	private int markScored;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int markScored) {
		super();
		this.markScored = markScored;
	}
    
	public int getmarkScored() {
		return markScored;
	}

	public void setmarkScored(int markScored) {
		this.markScored = markScored;
	}

	@Override
	public boolean Test() {
		// TODO Auto-generated method stub
		return (this.markScored)>80;
	}

}

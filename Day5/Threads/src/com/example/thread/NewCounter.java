package com.example.thread;

public class NewCounter {
  private int countUpTo;

public NewCounter(int countUpTo) {
	super();
	this.countUpTo = countUpTo;
}

  public int sumNumber() {
	  int sum=0;
	  for(int i=0;i<=countUpTo;i++) {
		  sum+=i;
	  }
	  return sum;
  }
}

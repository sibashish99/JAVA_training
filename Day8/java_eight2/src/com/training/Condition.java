package com.training;

@FunctionalInterface
public interface Condition {
	
  String NAME="poly";

  public boolean test();
  //FunctionsalInterface has only one method ..
  public default String show() {
	  return "I am from default method";
  }
}

package com.example.demo;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class MyJsonParser {
	
	  private Gson parse;
	  
      public MyJsonParser() {
		super();
		this.parse=  new GsonBuilder().setPrettyPrinting().create();
	  }
	  public String convertToJson(Product product) {
    	  return parse.toJson(product);
      }
      public Product jsonToJava(String value) {
    	  return parse.fromJson(value, Product.class);
      }
}

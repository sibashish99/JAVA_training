package com.example.demo;

public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
    	Product obj= new Product(101,"lays",10);
    	
    	MyJsonParser parse= new MyJsonParser();
    	String jrepo= parse.convertToJson(obj);
    	System.out.println("Java to json..");
    	System.out.println(jrepo);
    	
    	System.out.println("Json to java...");
    	System.out.println(parse.jsonToJava(jrepo));
    }
}

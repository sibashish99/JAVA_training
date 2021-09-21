
package com.training.poly;
import com.training.ifaces.Condition;

public class PrintService {
	
//	public static void print(Student obj) {
//		System.out.println(obj.Test());
//	}
//	public static void print(Professor obj) {
//		System.out.println(obj.Test());
//	}
//	public static void print(Condition poly) {
//		System.out.println(poly.Test());
//	}
	public static void print (Condition[] list) {
		for(Condition each: list) {
			System.out.println(each.Test());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Student s1= new Student(92);
        Professor p1= new Professor("phd");
        
        Student s2= new Student(72);
        Professor p2= new Professor("Btech");
        
//        System.out.println(s1.Test());
//        System.out.println(p1.Test());
//        System.out.println(s2.Test());
//        System.out.println(p2.Test());
//        System.out.println("---------");
//        print(s1);
//        print(p1);
//        print(s2);
//        print(p2);
         
         Condition[] list= {s1,p1,s2,p2};
         print(list);
         
        
	}

}

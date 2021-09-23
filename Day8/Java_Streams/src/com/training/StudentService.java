package com.training;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.*;
import java.util.function.*;
public class StudentService {
    private List<Student> studentList;
	public StudentService() {
		super();
		// TODO Auto-generated constructor stub
		this.studentList=new ArrayList<>();
		
		this.studentList.add(new Student(202,"sibashish4657",LocalDate.of(1997, 5,2),93));
		this.studentList.add(new Student(214,"sibashish12",LocalDate.of(1997, 4,4),85));
		this.studentList.add(new Student(756,"sibashish52",LocalDate.of(1997, 8,7),91));
		this.studentList.add(new Student(200,"sibashish883",LocalDate.of(1998, 2,1),87));
		this.studentList.add(new Student(779,"sibashish4",LocalDate.of(1994, 11,6),88));
	}
	
	public List<Student> useFilter(){
		return this.studentList.stream().
				                 filter(e -> e.getMarkScored()>90).
				                 collect(Collectors.toList());
	}
	
	public List<Student> useFilter(Predicate<Student> predicate){
		return this.studentList.stream().
				                 filter(predicate).
				                 collect(Collectors.toList());
	}
	
   public Map<String, Double> transformToMap(){
	   return this.studentList.stream().filter(e -> e.getMarkScored()>90).
	                                   collect(Collectors.toMap(Student:: getStudentName, Student:: getMarkScored));
   }
   
   public List<String> getStudentName(){
	   return this.studentList.stream().
			                  filter(e -> e.getMarkScored()>90).
	                          map(e -> e.getStudentName()).
	                          collect(Collectors.toList());
   }
   
   public List<Student> sortedByName(){
	   return this.studentList.stream().
               sorted(Comparator.comparing(Student::getStudentName))
               .collect(Collectors.toList());
   }
   
   public double highestMark() {
	 
	   Optional<Student> value= this.studentList.stream()
               .max(Comparator.comparing(Student:: getMarkScored));
	   
	   double max=0;
	   if(value.isPresent()) {
		   max= value.get().getMarkScored();
	   }
	   return max;
   }
}

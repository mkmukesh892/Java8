package com.java8.function;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class GradeOfStudent {

	public static void main(String[] args) {
	ArrayList<Student> list  =new ArrayList<>();
	populate(list);
	Function<Student, String> f = s->{
		int marks = s.getMarks();
		if(marks>=80)
			return "A[Distinction]";
		else if (marks>=60) {
			return "B[First Class]";
		}
		else if (marks>=50) {
			return "C[Second Class]";
		}
		else if (marks>=35) {
			return "D[Third Class]";
			
		}else
			return "E[FAILED]";
	};
	Predicate<Student> p =  s->s.getMarks()>=60;
	
	for(Student s: list) {
		if(p.test(s)) {
		System.out.println(s.getName());
		System.out.println(s.getMarks());
		System.out.println(f.apply(s));
		System.out.println("------------------------");
		}
	}
	}
	public static void populate(ArrayList<Student> list) {
		list.add(new Student("Mukesh", 100));
		list.add(new Student("Ayush", 80));
		list.add(new Student("Sagar", 60));
		list.add(new Student("Piyush", 50));
		list.add(new Student("Jayant", 35));
		list.add(new Student("Saugat", 25));
	}

}

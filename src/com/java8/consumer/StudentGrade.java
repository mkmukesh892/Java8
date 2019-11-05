package com.java8.consumer;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class StudentGrade {
	static class Student {
		private String Name;
		private double marks;
		public String getName() {
			return Name;
		}
		public void setName(String name) {
			Name = name;
		}
		public double getMarks() {
			return marks;
		}
		public void setMarks(double marks) {
			this.marks = marks;
		}
		public Student(String name, double marks) {
			super();
			Name = name;
			this.marks = marks;
		}
		@Override
		public String toString() {
			return "Student [Name=" + Name + ", marks=" + marks + "]";
		}
		
	}
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<>();
		populate(list);
		Predicate<Student> p = s->s.marks>=60;
		Function<Student, String> f = s->{
			double marks = s.marks;
			if(marks>=80)
				return "A[Distinction]";
			else if(marks>=60)
				return "B[First Class]";
			else if(marks>=50)
				return "C[Second Class]";
			else if(marks>=35)
				return "D[Second Class]";
			else
				return "E[Failed]";
		};
		Consumer<Student> c = s->{
			if(p.test(s)) {
				System.out.println("Name:- "+s.getName());
				System.out.println("Marks:- "+s.getMarks());
				System.out.println("Grade:- "+f.apply(s));
				System.out.println("----------------------");
			}
		};
		for(Student s: list) {
			c.accept(s);
		}
		
	}
	private static void populate(ArrayList<Student> list) {
		list.add(new Student("Mukesh", 100));
		list.add(new Student("Ajay", 55));
		list.add(new Student("Gopal", 60));
		list.add(new Student("Surya", 45));
		list.add(new Student("Kunal", 75));
		
	}

}

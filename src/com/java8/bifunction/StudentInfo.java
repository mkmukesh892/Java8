package com.java8.bifunction;

import java.util.ArrayList;
import java.util.function.BiFunction;

class Student {
	private String name;
	private int roll;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public Student(String name, int roll) {
		super();
		this.name = name;
		this.roll = roll;
	}
	
}
public class StudentInfo {
	
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<>();
		BiFunction<String, Integer, Student> f = (name,roll)->new Student(name, roll);
		list.add(f.apply("Mukesh", 54));
		list.add(f.apply("Rakesh", 23));
		list.add(f.apply("Amit", 27));
		list.add(f.apply("Sagar", 32));
		for(Student s: list) {
			System.out.println("Name: "+s.getName());
			System.out.println("Roll: "+s.getRoll());
			System.out.println("........................");
		}
	}

}

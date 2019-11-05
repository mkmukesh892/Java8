package com.java8.runnable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

class Employee {
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
public class EmployeeSorting {

	public static void main(String[] args) {
		ArrayList<Employee> l = new ArrayList<>();
		l.add(new Employee(100, "Mukesh"));
		l.add(new Employee(200, "Sohan"));
		l.add(new Employee(150, "Rakesh"));
		l.add(new Employee(110,"Suresh"));
		System.out.println("Before Sorting");
		l.forEach(System.out::println);
		System.out.println("After Sorting");
		Collections.sort(l,(e1,e2)->(e1.getId()<e2.getId())?-1:(e1.getId()>e2.getId())?1:0);
		l.forEach(System.out::println);

	}

}

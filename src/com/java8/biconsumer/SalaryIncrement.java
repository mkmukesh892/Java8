package com.java8.biconsumer;

import java.util.ArrayList;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

class Employee {
	private String name;
	private double salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	
}
public class SalaryIncrement {

	public static void main(String[] args) {
		ArrayList<Employee> list = new ArrayList<>();
		BiFunction<String, Double, Employee> f = (name,salary)->new Employee(name, salary);
		list.add(f.apply("Mukesh", 80000.0));
		list.add(f.apply("Kunal", 80000.0));
		list.add(f.apply("Suresh", 50000.0));
		list.add(f.apply("Manu", 500000.0));
		BiConsumer<Employee, Double> c = (employee,incremet)-> employee.setSalary(employee.getSalary()+incremet);
		for(Employee e: list) {
			c.accept(e, 1000.0);
		}
		for(Employee e: list) {
			System.out.println("Name: "+ e.getName());
			System.out.println("Salary: "+e.getSalary());
			System.out.println("....................");
		}
	
	}

}

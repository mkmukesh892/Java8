package com.java8.predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

public class EmployeeManagementSystem {

	public static void main(String[] args) {
		ArrayList<Employee>  list = new ArrayList<>();
		populate(list);
		Predicate<Employee> p = employee->employee.designation.equals("Manager");
		System.out.println("Manager list");
		display(p,list);
		Predicate<Employee> p1 = emp->emp.city.equals("Bangalore");
		System.out.println("Bangalore employee list");
		display(p1, list);
		Predicate<Employee> p2 = emp->emp.salary<200000;
		System.out.println("Incremented salary Employee list");
		incrementSalary(p2, list);
	}
	public static void incrementSalary(Predicate<Employee> p, ArrayList<Employee> list) {
		for(Employee emp: list) {
			if(p.test(emp)) {
				emp.salary = emp.salary + 200000;
				System.out.println(emp);
			}
		}
	}
	public static void display(Predicate<Employee> p, ArrayList<Employee> list) {
		for(Employee emp: list) {
			if(p.test(emp))
				System.out.println(emp);
		}
		
	}

	public static void populate(ArrayList<Employee> list) {
		list.add(new Employee("Rishab", "Manager", 30000000, "UP"));
		list.add(new Employee("Mukesh", "Software Engineer", 3000000, "Hazaribagh"));
		list.add(new Employee("Sagar", "Software Engineer", 3000000, "Delhi"));
		list.add(new Employee("Ayush", "Software Engineer", 3000000, "Jaipur"));
		list.add(new Employee("Rohan", "Software Engineer", 3000000, "Chennai"));
		list.add(new Employee("Piyush", "Software Engineer", 3000000, "Bangalore"));
		list.add(new Employee("Rishika", "Consultant", 100000, "Bangalore"));
		
	}

}

package com.java8.function;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class TotalSalary {

	public static void main(String[] args) {
		ArrayList<Employee> list = new ArrayList<>();
		populate(list);
		System.out.println("Before salary increment");
		System.out.println(list);
		Function<ArrayList<Employee>, Double> f = totalSalary();
		Predicate<Employee> p  = emp-> emp.getSalary()<=35000;
		Function<Employee, Employee> function = salaryIncrement();
		ArrayList<Employee> list1 = new ArrayList<>();
		for(Employee e: list) {
			if(p.test(e)) {
				function.apply(e);
				list1.add(e);
			}
		}
		System.out.println("After salary increment");
		System.out.println(list);
		
		System.out.println("Incremented salaried employee list");
		System.out.println(list1);
		System.out.println("total wages : "+f.apply(list));
	}

	public static Function<Employee, Employee> salaryIncrement() {
		Function<Employee, Employee> function = emp->{
			emp.setSalary(emp.getSalary()+3000);
			return emp;
		};
		return function;
	}

	public static Function<ArrayList<Employee>, Double> totalSalary() {
		Function<ArrayList<Employee>, Double> f = l->{
			double total  =0;
			for(Employee e: l) {
				total+=e.getSalary();
			}
			return total;
		};
		return f;
	}
	
	private static void populate(ArrayList<Employee> list) {
		list.add(new Employee("Mukesh", 100000));
		list.add(new Employee("Ayush", 80000));
		list.add(new Employee("Sagar",50000));
		list.add(new Employee("Jitu", 40000));
		list.add(new Employee("Ram", 30000));
		list.add(new Employee("Shyam", 25000));
	}

}

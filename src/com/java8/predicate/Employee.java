package com.java8.predicate;

public class Employee {
String name;
String designation;
double salary;
String city;
public Employee(String name, String designation, double salary, String city) {
	super();
	this.name = name;
	this.designation = designation;
	this.salary = salary;
	this.city = city;
}
@Override
public String toString() {
	return String.format("(name=%s, designation=%s, salary=%.2f, city=%s)", name, designation, salary, city);
}

}

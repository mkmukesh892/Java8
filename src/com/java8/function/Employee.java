package com.java8.function;

public class Employee {
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
@Override
public String toString() {
	return "( name=" + name + ", salary=" + salary+")";
}

}

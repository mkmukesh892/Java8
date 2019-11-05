package com.java8.bifunction;

import java.util.function.BiFunction;

class Employee {
	private String name;
	private int empid;
	private double wages;
	public Employee(String name, int empid, double wages) {
		super();
		this.name = name;
		this.empid = empid;
		this.wages = wages;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public double getWages() {
		return wages;
	}
	public void setWages(double wages) {
		this.wages = wages;
	}
	
}
class TimeSheet {
	private int empid;
	private int days;
	public TimeSheet(int empid, int days) {
		super();
		this.empid = empid;
		this.days = days;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public int getDays() {
		return days;
	}
	public void setDays(int days) {
		this.days = days;
	}
	
}
public class MonthlySalary {

	public static void main(String[] args) {
		BiFunction<Employee, TimeSheet, Double> f = (emp,time)-> emp.getWages()*time.getDays();
		Employee e = new Employee("Mukesh", 52107, 3000);
		TimeSheet t = new TimeSheet(52107, 31);
		System.out.println("Monthly salary of "+e.getEmpid()+" is "+f.apply(e, t));

	}

}

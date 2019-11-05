package com.java8.primitive.fi;

import java.util.function.ObjIntConsumer;

import com.java8.function.Employee;

public class PrimitiveTypeConsumerExample {

	public static void main(String[] args) {
		
		/**
		 * interface IntConsumer {
		 * public void accept(int value);
		 * }
		 */
		
		/**
		 * interface LongConsumer {
		 * public void accept(long value);
		 * }
		 */
		
		/**
		 * interface DoubleConsumer {
		 * public void accept(double value);
		 * }
		 */
		
		/**
		 * interface ObjIntConsumer<T> {
		 * public void accept(T t, int value);
		 * }
		 */
		
		/**
		 * interface ObjLongConsumer<T> {
		 * public void accept(T t, long value);
		 * }
		 */
		/**
		 * interface ObjDoubleConsumer<T> {
		 * public void accept(T t, double value);
		 * }
		 */
		ObjIntConsumer<Employee> c = (emp,input)-> emp.setSalary(emp.getSalary()+input);
		Employee e   = new Employee("Mukesh", 800000.0);
		c.accept(e, 100000);
		System.out.println(e);
		System.out.println("hello");
		
	}

}

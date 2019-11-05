package com.java8.predicate;

import java.util.function.Predicate;

public class PredicateExample2 {

	public static void main(String[] args) {
		int arr[] = {10,20,30,40,12,16};
		Predicate<Integer> p1 = i->i>10;
		Predicate<Integer> p2 = i->i%2==0;
		System.out.println("Number greater than 10  are");
		m1(p1,arr);
		System.out.println("Even numbers are ");
		m1(p2,arr);
		System.out.println("Number not greater than 10 are");
		m1(p1.negate(),arr);
		System.out.println("Number greater than 10 and Even numbers are");
		m1(p1.and(p2),arr);
		System.out.println("Number greater than 10 or  Even numbers are");
		m1(p1.or(p2),arr);
	

	}
	public static void m1(Predicate<Integer> p, int[] arr) {
		for(int x: arr) {
			if(p.test(x))
			System.out.println(x);
		}
	}

}

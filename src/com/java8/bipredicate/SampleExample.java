package com.java8.bipredicate;

import java.util.function.BiPredicate;

public class SampleExample {

	public static void main(String[] args) {
		BiPredicate<Integer, Integer>  p = (a,b)->(a+b)%2==0;
		System.out.println("sum of two number is even or not: "+p.test(6, 2));

	}

}

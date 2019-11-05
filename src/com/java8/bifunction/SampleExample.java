package com.java8.bifunction;

import java.util.function.BiFunction;

public class SampleExample {

	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> f  =(a,b)->a*b;
		System.out.println("product of two numbers are: "+f.apply(3, 2));

	}

}

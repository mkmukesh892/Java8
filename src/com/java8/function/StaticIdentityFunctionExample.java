package com.java8.function;

import java.util.function.Function;

public class StaticIdentityFunctionExample {

	public static void main(String[] args) {
		Function<String, String> f = Function.identity();
		System.out.println(f.apply("java"));

	}

}

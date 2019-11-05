package com.java8.function;

import java.util.function.Function;

public class FunctionChainingExample {

	public static void main(String[] args) {
		Function<String, String> upperCase = s->s.toUpperCase();
		Function<String,String> subString  =s->s.substring(0, 9);
		
		String result = upperCase.andThen(subString).apply("toppermukesh");
		System.out.println(result);
		result = upperCase.compose(subString).apply("toppermukesh");
		System.out.println(result);

	}

}

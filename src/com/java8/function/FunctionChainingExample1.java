package com.java8.function;

import java.util.function.Function;

public class FunctionChainingExample1 {

	public static void main(String[] args) {
		Function<Integer, Integer> f1 = val->val+val;
		Function<Integer, Integer> f2 = val-> val*val*val;
		System.out.println(f1.andThen(f2).apply(2));
		System.out.println(f1.compose(f2).apply(2));
		
	}

}

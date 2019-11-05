package com.java8.function;

import java.util.function.Function;

public class CountSpacePresentInString {

	public static void main(String[] args) {
		Function<String, Integer> f = s->s.length() - s.replaceAll(" ", "").length();
		
		String str  ="Welcome to the world of programming!";
		System.out.println(f.apply(str));

	}

}

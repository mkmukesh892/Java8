package com.java8.function;

import java.util.function.Function;

public class RemoveSpaceInString {

	public static void main(String[] args) {
		String str  ="My name is Mukesh Kumar";
		Function<String, String> f  =s->s.replaceAll(" ", "");
		System.out.println(f.apply(str));
	}

}

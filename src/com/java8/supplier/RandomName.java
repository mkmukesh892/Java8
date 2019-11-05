package com.java8.supplier;

import java.util.function.Supplier;

public class RandomName {

	public static void main(String[] args) {
	String[] names = {"mukesh","ramesh","suresh","mahesh","jai","raju","ankit"};
	Supplier<String> s = ()->{
		int index = (int) (Math.random()*names.length);
		return names[index];
	};
	System.out.println(s.get());
	System.out.println(s.get());
	System.out.println(s.get());
	System.out.println(s.get());

	}

}

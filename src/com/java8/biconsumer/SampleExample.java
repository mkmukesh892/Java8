package com.java8.biconsumer;

import java.util.function.BiConsumer;

public class SampleExample {

	public static void main(String[] args) {
		BiConsumer<String, String> c = (first,second)->System.out.println((first+" "+second));
		c.accept("Mukesh", "Ramesh");

	}

}

package com.java8.primitive.fi;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {

	public static void main(String[] args) {
		UnaryOperator<Integer> operator = (item)-> item*item;
		System.out.println(operator.apply(4));

	}

}

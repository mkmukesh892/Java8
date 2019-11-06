package com.java8.primitive.fi;

import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

	public static void main(String[] args) {
		BinaryOperator<Long> binaryOperator = (item1,item2)->item1+item2;
		System.out.println(binaryOperator.apply(Long.MAX_VALUE, Long.MIN_VALUE));
	}

}

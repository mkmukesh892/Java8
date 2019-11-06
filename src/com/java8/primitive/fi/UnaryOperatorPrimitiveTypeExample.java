package com.java8.primitive.fi;

import java.util.function.DoubleUnaryOperator;
import java.util.function.IntUnaryOperator;
import java.util.function.LongUnaryOperator;

public class UnaryOperatorPrimitiveTypeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * interface IntUnaryOperator {
		 * public int applyAsInt(int value);
		 * }
		 */
		IntUnaryOperator intUnaryOperator = (item)->item*item;
		System.out.println("Int Unary Operator: "+intUnaryOperator.applyAsInt(4));
		/**
		 * interface LongUnaryOperator {
		 * public long applyAsLong(long value);
		 * }
		 */
		LongUnaryOperator longUnaryOperator  = (item)-> item*item*item*item;
		System.out.println("Long Unary Operator: "+longUnaryOperator.applyAsLong(16));
		/**
		 * interface DoubleUnaryOperator {
		 * public double applyAsDouble(double value);
		 * }
		 */
		DoubleUnaryOperator doubleUnaryOperator = (item)-> Math.pow(item, 3);
		System.out.println("Double Unary Operator: "+doubleUnaryOperator.applyAsDouble(56));
		

	}

}

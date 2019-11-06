package com.java8.primitive.fi;

import java.util.function.DoubleBinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.LongBinaryOperator;

public class BinaryOpeatorPrimitiveTypeExample {

	public static void main(String[] args) {
		/**
		 * interface IntBinaryOperator{
		 * public int applyAsInt(int value1, int value2);
		 * }
		 */
		IntBinaryOperator intBinaryOperator = (item1,item2)->item1*item2;
		System.out.println("Int Binary Operator: "+intBinaryOperator.applyAsInt(20, 30));
		/**
		 * interface LongBinaryOperator {
		 * public long applyAsLong(long value1, long value2);
		 * }
		 */
		LongBinaryOperator longBinaryOperator  =(item1,item2)->item1+item2;
		System.out.println("Long Binary Operator: "+longBinaryOperator.applyAsLong(Integer.MAX_VALUE, Integer.MAX_VALUE));
		/**
		 * interface DoubleBinaryOperator {
		 * public double applyAsDouble(double value1, double value2);
		 * }
		 */
		DoubleBinaryOperator doubleBinaryOperator  =(item1,item2)->Math.pow(item1, item2);
		System.out.println("Double Binary Operator: "+doubleBinaryOperator.applyAsDouble(3.0, 4.0));
	}

}

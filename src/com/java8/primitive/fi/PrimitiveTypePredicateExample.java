package com.java8.primitive.fi;

import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;

public class PrimitiveTypePredicateExample {

	public static void main(String[] args) {
	int arr[] = {40,10,33,24,12,90,77};
	/**
	 * interface IntPredicate {
	 * public boolean test(int value);
	 * }
	 */
		IntPredicate intPredicate = i-> i%2==0;
		for(int x: arr) {
			if(intPredicate.test(x))
				System.out.println(x);
		}
		
	/**
	 * interface LongPredicate {
	 * public boolean test(long value);
	 * }
	 */
	LongPredicate longPredicate = i->i>Integer.MAX_VALUE;
	System.out.println(longPredicate.test(Long.MAX_VALUE));
	/**
	 * interface DoublePredicate {
	 * public boolean test(double value);
	 * }
	 */
	DoublePredicate doublePredicate = i-> i>=0.0;
	System.out.println(doublePredicate.test(80.90));
	}

}

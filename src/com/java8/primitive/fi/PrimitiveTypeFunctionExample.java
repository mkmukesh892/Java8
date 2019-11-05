package com.java8.primitive.fi;

import java.util.function.DoubleFunction;
import java.util.function.DoubleToIntFunction;
import java.util.function.DoubleToLongFunction;
import java.util.function.IntFunction;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntToLongFunction;
import java.util.function.LongFunction;
import java.util.function.LongToDoubleFunction;
import java.util.function.LongToIntFunction;
import java.util.function.ToDoubleBiFunction;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntBiFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongBiFunction;
import java.util.function.ToLongFunction;

public class PrimitiveTypeFunctionExample {

	public static void main(String[] args) {
		/**
		 * interface IntFunction<R> {
		 * R apply(int value);
		 * }
		 */
		IntFunction<Boolean> i = x->x%2==0;
		System.out.println(i.apply(5));
		/**
		 * interface LongFunction<R> {
		 * R apply(long value);
		 * }
		 */
		LongFunction<Double> sqrt  = x->Math.sqrt(10);
		System.out.println(sqrt.apply(10));
		/**
		 * interface DoubleFunction<R> {
		 * R apply(double value);
		 * }
		 */
		DoubleFunction<Double> pow = x->Math.pow(x, 2);
		System.out.println(pow.apply(3.02));
		/**
		 * interface IntToDoubleFunction {
		 * public double applyAsDouble(int value);
		 * }
		 */
		IntToDoubleFunction f =  x->Math.sqrt(x);
		System.out.println(f.applyAsDouble(4));
		/**
		 * interface IntToLongFunction {
		 * public long applyAsLong(int value);
		 * }
		 */
		IntToLongFunction intToLong = x->x*1000000;
		System.out.println(intToLong.applyAsLong(300));
		/**
		 * interface ToLongFunction<T> {
		 * public long applyAsLong(T value);
		 * }
		 */
		ToLongFunction<Integer> toLong = x-> x*x*x;
		System.out.println(toLong.applyAsLong(300));
		/**
		 * interface ToIntFunction<T> {
		 * public int applyAsInt(T value);
		 * }
		 */
		ToIntFunction<String> toInt = s->s.length();
		System.out.println(toInt.applyAsInt("mukesh"));
		/**
		 * interface ToDoubleFunction<T> {
		 * public double applyAsDouble(T value);
		 * }
		 */
		ToDoubleFunction<String> toDouble = s->Math.sqrt(s.length());
		System.out.println(toDouble.applyAsDouble("mukesh"));
		/**
		 * interface DoubleToIntFunction {
		 * public int applyAsInt(double value);
		 * }
		 */
		DoubleToIntFunction doubleToInt = input->(int)input*8;
		System.out.println(doubleToInt.applyAsInt(23.87));
		/**
		 * interface DoubleToLongFunction {
		 * public double applyAsLong(double value);
		 * }
		 */
		DoubleToLongFunction doubleToLong = input-> (long)(input*1000);
		System.out.println(doubleToLong.applyAsLong(6777.0012));
		/**
		 * interface LongToIntFunction {
		 * public int applyAsInt(long value);
		 * }
		 */
		LongToIntFunction longToInt = input-> (int)input*100;
		System.out.println(longToInt.applyAsInt(7000));
		/**
		 * interface LongToDoubleFunction {
		 * public double applyAsDouble(long value);
		 * }
		 */
		LongToDoubleFunction longToDouble = input->Math.sqrt(input);
		System.out.println(longToDouble.applyAsDouble(87));
		/**
		 * interface ToIntBiFunction<T,U>{
		 * public int applyAsInt(T t,U u);
		 * }
		 */
		ToIntBiFunction<String, String> toIntBi = (input1,input2)-> (input1+input2).length();
		System.out.println(toIntBi.applyAsInt("mukesh", "kumar"));
		/**
		 * interface ToLongBiFunction<T,U> {
		 * public long applyAsLong(T t,U u);
		 * }
		 */
		ToLongBiFunction<Integer, Integer> toLongBi = (input1,input2)->input1*input2;
		System.out.println(toLongBi.applyAsLong(800, 90000));
		/**
		 * interface ToDoubleBiFunction<T,U> {
		 * public double applyAsDouble(T t, U u);
		 * }
		 */
		ToDoubleBiFunction<Double, Double> toDoubleBi = (input1,input2)->input1*input2;
		System.out.println(toDoubleBi.applyAsDouble(3.89, 98.12));
	}

}

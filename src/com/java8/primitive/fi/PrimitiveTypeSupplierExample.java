package com.java8.primitive.fi;

import java.util.function.BooleanSupplier;
import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.LongSupplier;

public class PrimitiveTypeSupplierExample {

	public static void main(String[] args) {
		/**
		 * interface IntSupplier {
		 * public int getAsInt();
		 * }
		 */
		IntSupplier intSupplier = ()->(int)(Math.random()*10);
		String otp="";
		for(int i=0;i<6;i++) {
			otp+=intSupplier.getAsInt();
		}
		System.out.println("int supplier: "+otp);
		
		/**
		 * interface LongSupplier {
		 * public long getAsLong();
		 * }
		 */
		LongSupplier longSupplier = ()->Math.round(Math.PI);
		System.out.println("long supplier: "+longSupplier.getAsLong());
		
		/**
		 * interface DoubleSupplier {
		 * public double getAsDouble();
		 * }
		 */
		DoubleSupplier doubleSupplier  =()->Math.PI;
		System.out.println("double supplier: "+doubleSupplier.getAsDouble());
		/**
		 * interface BooleanSupplier {
		 * public boolean getAsBoolean();
		 * }
		 */
		BooleanSupplier booleanSupplier = ()->8>=1;
		System.out.println("boolean supplier: "+booleanSupplier.getAsBoolean());
		
		

	}

}

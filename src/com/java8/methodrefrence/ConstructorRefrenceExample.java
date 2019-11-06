package com.java8.methodrefrence;
/**
 * 
 * @author MukeshKumar
 * 
 * Rule for constructor Refrence
 *********************************
 * className::new                *
 *********************************
 *
 * Advantage of method and constructor refrence is
 * a code reusability
 */
class Sample {
	public Sample() {
		System.out.println("Sample class constructor creation & object creation");
	}
}
interface FunctionalInterface {
	public Sample get();
}
public class ConstructorRefrenceExample {

	public static void main(String[] args) {
		FunctionalInterface obj = Sample::new;
		Sample s = obj.get();
	}

}

package com.java8.methodrefrence;
/**
 * 
 * @author MukeshKumar
 * for method refrence the method arguments should 
 * be same for functional interface method and refrence method
 * 
 * rule for method refrence:-
 * 
 * static Method refrence
 * ***********************
 * className::methodName *
 * ***********************
 * 
 * instance Method refrence
 * ****************************
 * objectRefrence::methodName *
 * ****************************
 *
 */
interface Interface1{
	public void m1();
}
public class MethodRefrenceExample {
	public static void m2() {
		System.out.println("Method refrence 1");
	}
	public static void main(String[] args) {
		Interface1 i = MethodRefrenceExample::m2;
		i.m1();
		Interface1 i2 = new MethodRefrenceExample()::m3;
		i2.m1();
	}
	public void m3() {
		System.out.println("Method Refrence 2");
	}

}

package com.java8;

public class LamdaImplement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interface2 i  = ()->System.out.println("hello world!");
		i.m1();
		Interface2.m2();
		
		Interface1 i2 = (a,b)-> System.out.println("Sum is: "+(a+b));
		i2.add(10, 20);
		i2.add(100, 200);
		i2.method2();
		Interface1.method3();
	}

}

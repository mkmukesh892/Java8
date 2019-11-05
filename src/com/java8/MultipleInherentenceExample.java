package com.java8;

interface Left {
	default void m1() {
		System.out.println("Default Left Implementation");
	}
}
interface Right {
	default void m1() {
		System.out.println("Default Right Implementation");
	}
}
public class MultipleInherentenceExample implements Left, Right{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleInherentenceExample obj  =new MultipleInherentenceExample();
		obj.m1();
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		Right.super.m1();
	}

}

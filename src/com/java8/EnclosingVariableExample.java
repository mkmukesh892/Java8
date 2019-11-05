package com.java8;
interface Interface {
	public void m1();
}
public class EnclosingVariableExample {
	int x =10;
	public void m2() {
		int y = 20;
		Interface i  = ()->{
			x =100;
			System.out.println(x);
			System.out.println(y);
		};
		i.m1();
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EnclosingVariableExample obj = new EnclosingVariableExample();
		obj.m2();
	}

}

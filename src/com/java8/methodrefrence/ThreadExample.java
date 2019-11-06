package com.java8.methodrefrence;

public class ThreadExample {

	public static void main(String[] args) {
		Runnable r = new ThreadExample()::method1;
		Thread t = new Thread(r);
		t.start();
		for(int i=0;i<10;i++) {
			System.out.println("Main Thread");
		}

	}
	public void method1() {
		for(int i=0;i<10;i++) {
			System.out.println("Child Thread");
		}
	}

}

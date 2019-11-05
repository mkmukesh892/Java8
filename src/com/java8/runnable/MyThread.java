package com.java8.runnable;

public class MyThread {

	public static void main(String[] args) {
		
		Runnable runnable  = new MyRunnable();
		Thread thread  = new Thread(runnable);
		thread.start();
		
		for(int i=0;i<10;i++) {
			System.out.println("Main Thread");
		}

	}

}

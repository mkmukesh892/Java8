package com.java8.runnable;

public class Thread2 {

	public static void main(String[] args) {
		
		Runnable runnable  =()->{ 
			for(int i=0;i<10;i++) {
				System.out.println("Lambda: Child Thread");
			}
		};
		
		Thread thread = new Thread(runnable);
		thread.start();
		for(int i=0;i<10;i++) {
			System.out.println("Lambda: Main Thread");
		}
	}

}

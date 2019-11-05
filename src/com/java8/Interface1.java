package com.java8;
@FunctionalInterface
public interface Interface1 {
 public void add(int a, int b);
 
 default void method2(){
	System.out.println("default");
}
 static void method3() {
	 System.out.println("static");
 }
}

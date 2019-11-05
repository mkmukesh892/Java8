package com.java8;

 interface Interface4 {
	int id =10;
	String name = "Mukesh";
	default void print() {
		System.out.println(id+"->"+name);
	}
}
public class DefaultMethodTest {

	public static void main(String[] args) {
		Interface4 i  = new Interface4() {
		};
		i.print();

	}

}

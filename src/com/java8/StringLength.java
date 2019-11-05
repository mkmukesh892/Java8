package com.java8;
interface Interf {
	public int getLength(String s);
 }
public class StringLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interf i  = str->str.length();
		System.out.println(i.getLength("mukesh"));
	}

}

package com.java8.runnable;

import java.util.ArrayList;

public class ArrayListSorting {
public static void main(String[] args) {
	ArrayList<Integer> arr = new ArrayList<>();
	arr.add(10);
	arr.add(5);
	arr.add(0);
	arr.add(15);
	arr.add(20);
	System.out.println(arr);
	arr.sort((a,b)->{return (a>b)?1:(a<b)?-1:0;});
	System.out.println(arr);
}

}

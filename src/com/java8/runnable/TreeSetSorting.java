package com.java8.runnable;

import java.util.TreeSet;

public class TreeSetSorting {

	public static void main(String[] args) {
		TreeSet<Integer> tree = new TreeSet<>((a,b)->(a>b)?-1:(a<b)?1:0);
		tree.add(5);
		tree.add(10);
		tree.add(0);
		tree.add(15);
		tree.add(20);
		System.out.println(tree);

	}

}

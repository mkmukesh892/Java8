package com.java8.stream;
/**
 * 1. Filtering
 * if we want to filter elements from collection based on
 * some boolean value condition, then we should go for filtering
 * we can configure filtering by using filter method present in 
 * Stream interface
 * interface Stream {
 * public Stream filter(Predicate<T> p);
 * }
 * 
 * example: Stream s = c.stream().filter(i->i%2==0);
 * 
 * 2. Mapping
 * If we want to create a separate new collection by processing every object 
 * of collection based on some function, then we should go for mapping.
 * we can configure mapping by using map method present in Stream interface.
 * 
 * interface Stream {
 * public Stream map(Function<T,R> f);
 * }
 * example: Stream s = c.stream().map(I->I*2);
 */
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=1;i<=10;i++)
			list.add(i);
		List<Integer> oddList = list.stream().filter(I->I%2==1).collect(Collectors.toList());
		List<Integer> evenList =list.stream().filter(I->I%2==0).collect(Collectors.toList());
		System.out.println("List: "+list);
		System.out.println("Event list: "+evenList);
		System.out.println("Odd List: "+oddList);
		List<Integer> twiceList  =list.stream().map(I->I*2).collect(Collectors.toList());
		System.out.println("two times of original list: "+twiceList);

	}

}

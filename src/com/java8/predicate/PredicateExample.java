package com.java8.predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PredicateExample {

	public static void main(String[] args) {
		Predicate<Integer>  predicate  = item->item>10;
		System.out.println(predicate.test(100));
		System.out.println(predicate.test(2));
		ArrayList<String> arr = new ArrayList<>();
		arr.add("Mukesh");
		arr.add("Kunal");
		arr.add("Krishna");
		arr.add("Monita");
		Predicate<String> p1  =s-> s.startsWith("K");
		for(String item: arr) {
			if(p1.test(item))
				System.out.println(item);
		}

	}

}

package com.java8.predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

public class FilterValidString {

	public static void main(String[] args) {
		String strings[] = {"Mukesh","",null,"Abhishek","",null,"Sagar"};
		Predicate<String> predicate  = s->s!=null&&s.length()!=0;
		ArrayList<String> list = new ArrayList<>();
		for(String element: strings) {
			if(predicate.test(element))
				list.add(element);
		}
		System.out.println("Valid String List are");
		System.out.println(list);

	}

}

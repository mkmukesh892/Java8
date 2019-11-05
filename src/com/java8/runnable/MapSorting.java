package com.java8.runnable;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapSorting {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> map = new TreeMap<>((a,b)->(a>b)?-1:(a<b)?1:0);
		map.put(119,"Kunal");
		map.put(120, "Mukesh");
		map.put(125, "Ayush");
		map.put(128, "Ankit");
		map.put(126, "Sagar");
		map.put(127, "Piyush");
		for(Map.Entry<Integer, String> entry:map.entrySet()) {
			System.out.println(entry.getKey()+"->"+entry.getValue());
		}
		map.forEach((K,V)->System.out.println(K+"--"+V));
		

	}

}

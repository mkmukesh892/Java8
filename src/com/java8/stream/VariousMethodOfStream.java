package com.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 
 * @author MukeshKumar
 *
 * 1. processing by collect() method
 * this method collect elements from a stream and 
 * store them in a specified collection
 * 
 * 2. processing by count() method
 * this method return number of elements present
 * in stream
 * public long count();
 * 
 * 3. processing by sorted() method
 * this method sort the stream elements in default sorting order.(i.e ascending order)
 * we can customize the sorting order by providing custom logic
 * 
 * 4. processing by min() method
 * this method return minimum value from stream based on specified comparator
 * min(Comparator c).get();
 * 
 *  5. processing by max() method
 *  this method return maximum value from stream based on specified comparator
 *  max(Comparator c).get();
 *  
 *  6. processing by forEach() method
 *  this method does not return anything
 *  this method takes lambda expression as argument
 *  and apply that lambda expression to each of the element present in stream.
 *  
 *  7. processing by toArray() method
 *  this method copy stream elements to specified array
 *  
 *  8. processing with Stream.of() method
 *  this method allows to apply Stream concept for groups of elements
 *  and for arrays elements 
 *  (A) for groups of elements
 *  Stream<Integer> s = Stream.of(9,99,100,200);
 *   (B) for array elements
 *   Stream<Integer> s =Stream.of([3,5,6,9]);
 */
public class VariousMethodOfStream {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		populate(list);
		System.out.println("original list: "+list);
		List<String> filterList = list.stream().filter(s->s.length()>=9).collect(Collectors.toList());
		System.out.println("filtered list: "+filterList);
		List<String> mappedList = list.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
		System.out.println("mapped List: "+mappedList);
		
		long count = list.stream().count();
		long countFilter = list.stream().filter(s->s.length()>=9).count();
		System.out.println("number of elements in list: "+count);
		System.out.println("number of elements in filteredList: "+countFilter);
		
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(5);
		arrayList.add(0);
		arrayList.add(15);
		arrayList.add(10);
		arrayList.add(20);
		System.out.println(arrayList);
		List<Integer> defaultSortingList = arrayList.stream().sorted().collect(Collectors.toList());
		System.out.println("ascending list of number: "+defaultSortingList);
		List<Integer> customSortingList = arrayList.stream().sorted((a,b)->b.compareTo(a)).collect(Collectors.toList());
		System.out.println("decending list of number: "+customSortingList);
		
		int minValue = arrayList.stream().min((a,b)->a.compareTo(b)).get();
		System.out.println("min value: "+minValue);
		int maxValue = arrayList.stream().max((a,b)->a.compareTo(b)).get();
		System.out.println("max value: "+maxValue);
		
		System.out.println("printing string list using forEach method");
		list.stream().forEach(s->System.out.println(s)); //with lambda expression
		list.stream().forEach(System.out::println); // with method refrence
		System.out.println("toArray example");
		Integer[] arr = arrayList.stream().toArray(Integer[]::new);
		Stream.of(arr).forEach(System.out::println);
		System.out.println("Stream.of() for group of elements");
		Stream<Integer> stream = Stream.of(2,3,4,5);
		stream.forEach(System.out::println);
		System.out.println("Stream.of() for array elements");
		Stream<Integer> stream1 =Stream.of(arr);
		stream1.forEach(System.out::println);
	}

	private static void populate(ArrayList<String> list) {
		list.add("Rakesh");
		list.add("Suresh");
		list.add("NagaArjun");
		list.add("Krishna");
		list.add("PawanKalyan");
	}

}

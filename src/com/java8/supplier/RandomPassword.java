package com.java8.supplier;

import java.util.function.Predicate;
import java.util.function.Supplier;

public class RandomPassword {

	public static void main(String[] args) {
		Supplier<String> supplier = ()->{
			String pwd="";
			String symbols = "ABCDEFGHIJKLMNOPQRSTUVWXYZ@#$";
			Supplier<Integer> digit = ()->(int)(Math.random()*10);
			Predicate<Integer> p  =i->i%2==0;
			Supplier<Character> characters = ()->symbols.charAt((int)(Math.random()*29));
			for(int i=1;i<=8;i++) {
				if(p.test(i))
					pwd+=digit.get();
				else
					pwd+=characters.get();
			}
			return pwd;
			
		};
		System.out.println("random password: "+supplier.get());

	}

}

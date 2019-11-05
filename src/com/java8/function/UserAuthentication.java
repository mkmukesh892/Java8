package com.java8.function;

import java.util.Scanner;
import java.util.function.Function;

public class UserAuthentication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Function<String, String> f1 = s->s.substring(0,5);
		Function<String, String> f2 = s->s.toLowerCase();
		System.out.println("Enter user");
		String user = sc.next();
		System.out.println("Enter password");
		String pwd = sc.next();
		if(f1.andThen(f2).apply(user).equals("durga")&&pwd.equals("java")) {
			System.out.println("Valid User");
		}
		else
			System.out.println("Invalid User");

	}

}

package com.java8.datatime;

import java.time.Year;
import java.util.Scanner;

public class YearExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		Year y  = Year.of(n);
		if(y.isLeap()) {
			System.out.println("This is a leap year");
		}else
		{
			System.out.println("This is not a leap year");
		}
	}

}

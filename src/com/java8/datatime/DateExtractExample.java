package com.java8.datatime;

import java.time.LocalDate;

public class DateExtractExample {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		int dd = date.getDayOfMonth();
		int mm = date.getMonthValue();
		int yyyy = date.getYear();
		System.out.println("custom date format: "+dd+","+mm+","+yyyy);
		System.out.printf("%d-%d-%d", dd,mm,yyyy);
	}

}

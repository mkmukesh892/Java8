package com.java8.datatime;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.Year;

public class LocalDateTimeExample {

	public static void main(String[] args) {
		LocalDateTime date = LocalDateTime.now();
		int dd = date.getDayOfMonth();
		int mm = date.getMonthValue();
		int yy = date.getYear();
		int h = date.getHour();
		int m = date.getMinute();
		int s = date.getSecond();
		int n = date.getNano();
		System.out.println(date);
		System.out.printf("%d-%d-%d\n%d:%d:%d:%d\n", dd,mm,yy,h,m,s,n);
		
		LocalDateTime dt = LocalDateTime.of(2019, Month.JULY, 12, 12, 54);
		System.out.println(dt);
		LocalDateTime x = dt.plusMonths(6);
		System.out.println(x);
		LocalDateTime y =  dt.minusMonths(6);
		System.out.println(y);

	}

}

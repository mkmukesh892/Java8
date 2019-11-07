package com.java8.datatime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Example {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		LocalTime time = LocalTime.now();
		LocalDateTime dataTime = LocalDateTime.now();
		System.out.println("current date: "+date);
		System.out.println("current time: "+time);
		System.out.println("current date and time: "+dataTime);

	}

}

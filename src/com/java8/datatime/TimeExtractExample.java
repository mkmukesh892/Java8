package com.java8.datatime;

import java.time.LocalTime;

public class TimeExtractExample {

	public static void main(String[] args) {
		LocalTime time = LocalTime.now();
		int hour = time.getHour();
		int minute = time.getMinute();
		int second = time.getSecond();
		int nanoSecond = time.getNano();
		
		System.out.printf("hour-%d, minute-%d, second-%d, nanoSecond-%d",hour,minute,second,nanoSecond);

	}

}

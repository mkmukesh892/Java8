package com.java8.datatime;

import java.time.LocalDate;
import java.time.Period;

public class PeriodExample {

	public static void main(String[] args) {
		LocalDate birthDay = LocalDate.of(1992, 07, 12);
		LocalDate today = LocalDate.now();
		Period period = Period.between(birthDay, today);
		System.out.printf("You  are %d years %d months %d days old now.\n", period.getYears(),period.getMonths(),period.getDays());
		int totalDayNow = 365*period.getYears()+30*period.getMonths()+period.getDays();
		System.out.println("approx total days from birth now is "+totalDayNow+" days.");

	}

}

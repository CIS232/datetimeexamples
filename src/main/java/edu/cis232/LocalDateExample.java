package edu.cis232;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class LocalDateExample {

	public static void main(String[] args){
		//Get current date
		LocalDate today = LocalDate.now();

		System.out.println("Today: " + today);

		//Get tomorrow
		LocalDate tomorrow = LocalDate.now().plusDays(1);
		System.out.println("Tomorrow: " + tomorrow);

		//Next week, NOTE: the value of "today" does not change.
		LocalDate nextWeek = today.plus(1, ChronoUnit.WEEKS);
		System.out.println("Next week: " + nextWeek);

		//Last day of month
		LocalDate lastDayOfThisMonth = today.withDayOfMonth(today.lengthOfMonth());
		System.out.println("Last day of month: " + lastDayOfThisMonth);

		//Get July 4th 1976
		LocalDate bicentennial = LocalDate.of(1976, Month.JULY, 4);

		System.out.println("Bicentennial: " + bicentennial);

		//Get graduation day
		LocalDate graduation = LocalDate.parse("2018-05-03");
		System.out.println("Graduation Day: " + graduation.getDayOfWeek() + " " + graduation);
		DateTimeFormatter humanReadable = DateTimeFormatter.ofPattern("MMMM d, y");
		System.out.println("Graduation Day (Formatted): " + graduation.format(humanReadable));

		LocalDate halloween = LocalDate.parse("October 31, 2018", humanReadable);
		System.out.println("Halloween: " + halloween);

		//Is today after halloween?
		if(today.isAfter(halloween)){
			System.out.println("Halloween already happened in 2018.");
		} else {
			System.out.println("Looking forward to Halloween!");
		}
	}
}

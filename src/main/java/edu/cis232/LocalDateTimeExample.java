package edu.cis232;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeExample {
	public static void main(String[] args){
		LocalDateTime nextClass = LocalDateTime.of(2018, Month.APRIL, 30, 21, 0, 0);

		DateTimeFormatter humanReadable = DateTimeFormatter.ofPattern("EEEE MMMM d h:mm a");

		System.out.println("Next class: " + nextClass.format(humanReadable));
	}
}

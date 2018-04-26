package edu.cis232;

import java.time.LocalTime;

public class LocalTimeExample {
	public static void main(String[] args){
		LocalTime now = LocalTime.now();
		System.out.println(now);

		System.out.println("Max: " + LocalTime.MAX);

		//Is it afternoon?
		if(LocalTime.now().isAfter(LocalTime.NOON)){
			System.out.println("It's after noon!");
		} else {
			System.out.println("It's before noon!");
		}
	}
}

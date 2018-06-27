package com.javasession.week_4.day2_Lambda_StreamAPI;

import java.util.Arrays;
import java.util.List;

public class StreamAPISample {
	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Charles", "Dickens", 60),
				new Person("Lewis", "Carroll", 42),
				new Person("Thomas", "Carlyle", 44),
				new Person("Charlotte", "Brntie", 35),
				new Person("Matthew", "Arnold", 43)
				);
		
		//We already have an implementation of interface in Person
//		people.stream().forEach(p -> System.out.println(p.getLastName()));
		people.stream().filter(foo -> foo.getFirstName().startsWith("C")).forEach(p -> System.out.println(p.getFirstName()));
		
//		for(Person p: people) {
//			System.out.println(p);
//		}
//		
//		for(Person p1: people) {
//			System.out.println(p1.getFirstName());
//		}
//		
//		for(Person p2: people) {
//			System.out.println(p2.getAuAge());
//		}
	}
}

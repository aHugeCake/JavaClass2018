package com.javasession.week_4.day1_Lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Exercise_PersonLastNameComparison {
	public static void main(String[] args) {
		// Private Queue follows the order of comparable value
		List<Person> lastName = new ArrayList<Person>();
		
		lastName.add(new Person("Alice","Milan",12));
		lastName.add(new Person("Blice","Nilan",12));
		lastName.add(new Person("Clice","Nelan",12));
		lastName.add(new Person("Dlice","Milan",12));
		
//		compareName(compareN(lastName));
		
		Collections.sort(lastName, (p1, p2) -> p1.lastName.compareTo(p2.lastName));
		printAll(lastName);
		System.out.println("============");
		printN(lastName);
		
		
	}
	
//	public static void compareName(List<Person> lastName) {
//		Collections.sort(lastName);
//		for(Person str: lastName) {
//			System.out.println("FirstName: " + str.firstName + " LastName: " + str.lastName);
//		}
//	}
	
	public static void printAll(List<Person> lastName) {
		for(Person p: lastName)
			System.out.println("FirstName: " + p.firstName + " LastName: " + p.lastName);
	}
	
	public static void printN(List<Person> lastName) {
		for(Person p: lastName)
			if(p.lastName.startsWith("N"))
				System.out.println("FirstName: " + p.firstName + " LastName: " + p.lastName);
	}
	
//	public static ArrayList<Person> compareN(ArrayList<Person> lastN) {
//		ArrayList<Person> lastn = new ArrayList<Person>();
//		for(Person str: lastN) {
//			if(str.lastName.startsWith("N")) {
//				lastn.add(str);
//			}
//		}
//		return lastn;
//	}
	
	
	
}

class Person{

	String firstName;
	String lastName;
	int auAge;
	public Person(String firstName, String lastName, int auAge) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.auAge = auAge;
	}
	
	
//	@Override
//	public int compareTo(Person person) {
//		
//		int res = this.lastName.compareTo(person.lastName);
//		if(res == 0) {
//			return this.lastName.compareTo(person.lastName);
//		}else
//			return res;
//		
//	}
	
}



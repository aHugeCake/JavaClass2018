package com.javasession.week_3.day5_Comparisons;

import java.util.ArrayList;
import java.util.Collections;

//Comparable: compare one parameter and Collections sort
//Comparator: compare multi parameters and sort by many different ways and by any data especially for our own classes with not single data type 
public class PersonSortedByMany {
	
	public static void main(String[] args) {
		//List of objects of Author class
		ArrayList<Person> pl = new ArrayList<Person>();
		
		pl.add(new Person("John","Millan",34));
		pl.add(new Person("Mike","Mellon",24));
		pl.add(new Person("George","Millan",19));
		pl.add(new Person("Tom","Mallen",33));
		
		/*
		 * Sorting the list using Collections.sort() method, we can use this method because we have implemented the Comparable interface in our user defined class Author
		 */
		System.out.println("Sorting by Person First Name: ");
		System.out.println("==============================");
		Collections.sort(pl);
		for(Person au: pl) {
			System.out.println(au.getFirstName() + ", " + au.getLastName() +", " + au.getAuAge());
		}
		/*Sorting using PersonAgeComparator */
		System.out.println("=============================");
		System.out.println("Sorting by Person Age:");
		Collections.sort(pl, new PersonAgeComparator());
		for(Person au: pl) {
			System.out.println(au.getFirstName() + ", " + au.getLastName() +", " + au.getAuAge());
		}
		/*Sorting using LastName Comparator */
		System.out.println("=============================");
		System.out.println("Sorting by Last Name:");
		Collections.sort(pl, new PersonNameComparator());
		for(Person au: pl) {
			System.out.println(au.getFirstName() + ", " + au.getLastName() +", " + au.getAuAge());
		}
		
	}
}

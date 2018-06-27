package com.javasession.week_3.day5_Comparisons;

import java.util.ArrayList;
import java.util.Collections;

public class AuthorSortedByNames {

	public static void main(String[] args) {
		//List of objects of Author class
		ArrayList<AuthorComparable> al = new ArrayList<AuthorComparable>();
		
		al.add(new AuthorComparable("Mike", "Millan", "Haha"));		
		al.add(new AuthorComparable("Tom", "Mellan", "Haha"));
		al.add(new AuthorComparable("Jim", "Mallan", "Haha"));
		al.add(new AuthorComparable("George", "Millan", "Haha"));
		
		/*
		 * Sorting the list using Collections.sort() method, we can use this method because we have implemented the Comparable interface in our user defined class Author
		 */
		Collections.sort(al);
		for(AuthorComparable str: al) {
			System.out.println(str.firstName + " " + str.lastName + " Book: " + str.bookName);
		}
		
		
	}
}

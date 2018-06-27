package com.javasession.week_3.day5_Comparisons;

//Comparable: compare one parameter and Collections sort
//Comparator: compare multi parameters and sort by many different ways and by any data especially for our own classes with not single data type 

//Interface
//The argument of Comparable Interface should be this class, so Comparable<Author>
public class AuthorComparable implements Comparable<AuthorComparable>{

	String firstName;
	String lastName;
	String bookName;
	public AuthorComparable(String firstName, String lastName, String bookName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.bookName = bookName;
	}
	
	
	@Override
	public int compareTo(AuthorComparable au) {
		/*
		 * Sorting by last name. compareTo should return < 0 if this(keyword) is supposed to be less than au, >0 if this is supposed to be greater than object au and 0 if they are supposed to be equal.
		 */
		
		int last = this.lastName.compareTo(au.lastName);
		//Sorting by first name if last name is same arguments
		return last == 0 ? this.firstName.compareTo(au.firstName) : last;
	}
	
}

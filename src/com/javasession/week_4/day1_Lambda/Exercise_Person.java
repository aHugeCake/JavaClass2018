package com.javasession.week_4.day1_Lambda;

/*
 * 1. Sort List by last name
 * 2. Create method that can print all the element in the list
 * 3. Create method that print person with only last name starts with 'N'
 */
public class Exercise_Person implements Comparable<Exercise_Person>{
	String firstName;
	String lastName;
	int auAge;
	
	@Override
	public int compareTo(Exercise_Person pu) {
		return this.lastName.compareTo(pu.lastName);
	}
	
	public Exercise_Person(String firstName, String lastName, int auAge) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.auAge = auAge;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAuAge() {
		return auAge;
	}

	public void setAuAge(int auAge) {
		this.auAge = auAge;
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", auAge=" + auAge + "]";
	}
	
	
}

package com.javasession.week_4.day2_Lambda_StreamAPI;

public class Person implements Comparable<Person>{
	String firstName;
	String lastName;
	int auAge;
	
	@Override
	public int compareTo(Person pu) {
		return this.firstName.compareTo(pu.firstName);
	}
	
	public Person(String firstName, String lastName, int auAge) {
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

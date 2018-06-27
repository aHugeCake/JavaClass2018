package com.javasession.week_2.day2_Inheritance;

public class Inheritance {

	/*
	 * Simple Inheritance:
	 * 		class A
	 * 		class B extends A
	 * Multiple Inheritance:
	 * 		class A
	 * 		class B extends A
	 * 		class C extends B
	 * 	*Note: C can access neither B or A, but can get behaviors of both B and A
	 */
	String dept = "Accounting";
	String company = "Abc.com";
	
	//Assume default methods
	// private --> default --> protected --> public
	//protected: can be accessed in the same package
	//default: class or superclass
	void does() {
		System.out.println("Techaing");
	}
	
	//No main methods
}

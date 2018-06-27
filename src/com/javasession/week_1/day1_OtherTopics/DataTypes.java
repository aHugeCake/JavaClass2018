package com.javasession.week_1.day1_OtherTopics;

public class DataTypes {

	/*
	 * https://www.geeksforgeeks.org/data-types-in-java
	 * 
	 * Data Types:
	 * 
	 * 1. Primitive data types:
	 * 		boolean                 true, false    default: false    1-bit
	 * 		byte                    -127 ~ 128    -2^7 ~ 2^7-1    default: 0    8-bit
	 * 		char  eg: '$', a, A     0 ~ 65,535    '\u0000' ~ '\uffff'    16-bit
	 * 		short                   -32,768 ~ 32,767    -2^15 ~ 2^15-1    default: 0    16-bit
	 * 		int                     -2,147,483,648 ~ 2,147,483,647    -2^31 ~ 2^31-1    default: 0    32-bit
	 * 		long                    -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807    -2^63 ~ 2^63-1    default: 0L    64-bit
	 * 		float                   default: 0.0f    32-bit IEEE 754 floating point
	 * 		double                  default: 0.0d    64-bit IEEE 754 floating point
	 * 
	 * *Note: String is not a primitive data type, but a reference data type. It's an object.
	 * 
	 * 
	 * 2. Reference data types
	 * 
	 * 
	 */
	
	public static void main(String [] args) {
		
		byte num = 123;
		short num1 = 23455;
		
		System.out.println("This is a byte: " + num);
		System.out.println("This is a short: " + num1 );
		
		char ch = 'A'; //char should be in single ...
		System.out.println(ch);
		
		float num3 = 12.98f;  //For float, f is necessary
		double num5 = 1223.456D;  //For double, D is not necessary. double num5 = 1223.456d; double num5 = 1223.456;
		
		/*
		 * 
		 * Assignment 2:
		 * Can you write a code that will have two number variable (different data types)
		 * print the sum of it
		 * 
		 */
		float a = 10.98f;
		double b = 20.789;
		//int sum = (int) ((int) a + b);
		double sum = a + b; //double can support float, but float cannot support double
		System.out.println("Sum of A and B is "+ sum);
		
	}
}

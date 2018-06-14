package com.javasession.week_1.day1;

import java.util.Scanner;

public class Calculator {

	/*
	 * 
	 * Two numbers
	 * +, -, *, /
	 * print the result
	 * 
	 */
	
	public static void main(String[] args) {
		
		Scanner scan1 = new Scanner(System.in);
		
		System.out.println("Please input the first number");
		double a = scan1.nextDouble();
		
		System.out.println("Please input the second number");
		double b = scan1.nextDouble();
		
		System.out.println("Please input number of the operator (1+, 2-, 3* 4/)");
		int o = scan1.nextInt();
		
		scan1.close();
		
		double result = 0.0;
		
		if( o == 1 )
			result = a + b;
		if( o == 2 )
			result = a - b;
		if( o == 3 )
			result = a * b;
		if( o == 4 )
			result = a / b;
		
		System.out.println(result);
		
	}
}

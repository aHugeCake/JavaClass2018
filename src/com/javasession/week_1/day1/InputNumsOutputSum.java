package com.javasession.week_1.day1;

import java.util.Scanner;

public class InputNumsOutputSum {

	
	public static void main(String[] args) {
		
		Scanner scan1 = new Scanner(System.in);
		
		//nextDouble(), nextInt(), nextFloat()
		//nextInt() will block the inputs that are not int. These methods can limit the data type of inputs.
		System.out.println("a: ");
		Double a = scan1.nextDouble();
		System.out.println("b: ");
		Double b = scan1.nextDouble();
		
		scan1.close(); //close can keep only two input values but not more. We can input more values if we don't close.
		
		Double sum = a + b;
		System.out.println("Sum of a and b is :" + sum);
		
	}
	
}

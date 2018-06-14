package com.javasession.week_1.day2;

import java.util.Scanner;

public class LargestValue {

	public static void main(String[] args) {
		
		//Create class
		//three value number values as in input
		//print the largest value
		
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("Please input the 1st number: ");
		int a = s1.nextInt();
		
		System.out.println("Please input the 2nd number: ");
		int b = s1.nextInt();
		
		System.out.println("Please input the 3rd number: ");
		int c = s1.nextInt();
		
		s1.close();
		
		int r1 = (a >= b)? a:b;
		int r2 = (r1 >= c)? r1:c;
		
		System.out.println(r2);
	}
}

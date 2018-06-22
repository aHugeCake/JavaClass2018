package com.javasession.week_1.day2_ControlFlow;

import java.util.Scanner;

public class WeirdCheck {

	public static void main(String[] args) {
		
		/*
		 * If num is odd, print Weird
		 * If num is even and in the inclusive range of 2 to 5, print Not Weird
		 * If num is even and in the inclusive range of 6 to 20, print Weird
		 * If num is even and greater than 20, print Not Weird
		 */
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Please input the number to be checked:");
		int num = s.nextInt();
		s.close();
		
		if(num % 2 != 0) {
			System.out.println("Weird");
		}else if(num >=2 && num <= 5) {
			System.out.println("Not Weird");
		}else if(num >= 6 && num <= 20) {
			System.out.println("Weird");
		}else {
			System.out.println("Not Weird");
		}
		
	}
}

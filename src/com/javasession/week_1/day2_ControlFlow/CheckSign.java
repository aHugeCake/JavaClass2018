package com.javasession.week_1.day2_ControlFlow;

import java.util.Scanner;

public class CheckSign {
	
	public static void main(String[] args) {
		
		//given number check it positive or negative?
		Scanner s = new Scanner(System.in);
		
		System.out.println("Please input the number to be checked:");
		int num = s.nextInt();
		s.close();
		
		if(num > 0) {
			System.out.println(num + " is positive");
			
		}else if(num < 0) {
			System.out.println(num + " is negative");
		}
		else {
			System.out.println(num + " is neither positive nor negative");
		}
		
		//given number check it even or odd?
		if(num % 2 == 0) {
			System.out.println(num + " is also an even number");
		}else {
			System.out.println(num + " is also an odd number");
		}	

	}
	
}

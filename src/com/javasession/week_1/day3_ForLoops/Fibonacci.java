package com.javasession.week_1.day3_ForLoops;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please input the length of Fibonacci: ");
		int l = scan.nextInt();
		
		System.out.println(0);
		
		int num1 = 0;
		int num2 = 1;
		
		for(int i = 1; i< l; i++) {
			System.out.println(num1);
			int temp = num1 + num2;
			num1 = num2;
			num2 = temp;
		}
	}
}

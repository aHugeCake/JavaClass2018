package com.javasession.week_1.day2;

public class ComparisonOperators {

	public static void main(String[] args) {
		
		// ==, !=, >, <, >=, <=
		// can compare anything, but string comparison is not this
		int num1 = 60;
		int num2 = 50;
		
		if(num1 == num2) {
			System.out.println("num1 and num2 are same");
		}else {
			System.out.println("num1 and num2 are not the same");
		}
		
		if(num1 != num2) {
			System.out.println("num1 and num2 are not the same");
		}else {
			System.out.println("num1 and num2 are the same");
		}
		
		if(num1 > num2) {
			System.out.println("num1 is bigger than num2");
		}else {
			System.out.println("num1 is smaller than num2");
		}
		
		if(num1 < num2) {
			System.out.println("num1 is smaller than num2");
		}else {
			System.out.println("num1 is bigger than num2");
		}
		
		if(num1 >= num2) {
			System.out.println("num1 is not smaller than num2");
		}else {
			System.out.println("num1 is smaller than num2");
		}
		
		if(num1 <= num2) {
			System.out.println("num1 is not bigger than num2");
		}else {
			System.out.println("num1 is bigger than num2");
		}

	}
}

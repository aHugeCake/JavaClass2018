package com.javasession.week_1.day2_TernaryOperator;

public class TernaryOperator {
	
	// (true/false)? A:B
	// var num = (expression) ? value if true : value if false;
	
	public static void main(String[] args) {
		int num1;
		int num2;
		
		num1 = 25;
		num2 = (num1 == 10) ? 100:200;
		System.out.println(num2);
	}
}

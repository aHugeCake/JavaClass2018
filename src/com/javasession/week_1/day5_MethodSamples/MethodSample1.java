package com.javasession.week_1.day5_MethodSamples;

public class MethodSample1 {

	
	 
	
	public static void main(String[] args) {
//		System.out.println(sumDouble(1,2));
//		System.out.println(sumDouble(3,2));
//		System.out.println(sumDouble(2,2));
		System.out.println(makes10(11,10));
		System.out.println(makes10(9,9));
		System.out.println(makes10(1,9));
	}
	
	 /*
	 * 1. Given two int values,
	 * return their sum . Unless the two values are the same,
	 * then return double their sum.
	 * 
	 * sumDouble(1,2) --> 3
	 * sumDouble(3,2) --> 5
	 * sumDouble(2,2) --> 8
	 */ 
	public static int sumDouble(int num1, int num2) {
		if(num1 != num2) {
			return num1 + num2;
		}else {
			return 4*num1;
		}
	}
	
	
	/* 
	 * 
	 * 2. Given 2 ints, a and b,
	 * return true if one of them is 10 or
	 * it their sum is 10
	 * 
	 * makes10(9, 10) -> true
	 * makes10(9, 9) -> false
	 * makes10(1, 9) -> true
	 * 
	 */
	public static boolean makes10(int num1, int num2) {
		int sum = num1 + num2;
		if(num1 == 10 || num2 == 10 || sum == 10) {  //if((a == 10 || b == 10) || (a + b == 10)){
			return true;
		}else {
			return false;
		}
	}
}

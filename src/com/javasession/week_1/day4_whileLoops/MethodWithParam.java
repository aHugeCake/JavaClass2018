package com.javasession.week_1.day4_whileLoops;

public class MethodWithParam {

	
	public static void main(String[] args) {
		//method inside the main method, it's code changes.
		//method outside the main method, the code needs not change if the method itself changes
		//if the method is not static, we need to create an instance to call the method
		getOne();
		System.out.println(getAll(4, 4));
	}
	
	public static void getOne() {
		//Changes in this method may not cause code in main method changes.
		System.out.println("method test");
		
		/*
		 * int num1 = 17;
		 * int num2 = 20;
		 * int sum = num1 + num2;
		 * 
		 * In this condition, Java actually executed the calculation, but the result is not returned
		 * We can see the result in debug
		 */
	}
	
	public static int getAll(int a, int b) {
		return a + b;
	}
}

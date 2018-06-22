package com.javasession.week_2.day3_OtherTopics;

public class AccessModifier {

	/*
	 * AccessModifier is used to control access 
	 * 
	 * --------------------------------------------------------
	 * Access   | within | within  | outside package | outside 
	 * Modifier | class  | package | subclass only   | package
	 * --------------------------------------------------------
	 * Private  |   Y    |    N    |        N        |    N
	 * --------------------------------------------------------
	 * Default  |   Y    |    Y    |        N        |    N
	 * --------------------------------------------------------
	 * Protected|   Y    |    Y    |        Y        |    N
	 * --------------------------------------------------------
	 * Public   |   Y    |    Y    |        Y        |    Y
	 * --------------------------------------------------------
	 * 
	 */
	
	//valuables should be private
	int num;
	String str;
	boolean b1;
	
	public static void main(String[] args) {
		getOne();
		System.out.println(sumOfAll(6,29));
	}
	
	//This is the way to define a default method, without any modifiers
	static void getOne() {
		System.out.println("Say Hello");
	}
	
	
	private static int sumOfAll(int a, int b) {
		int sum = a + b;
		return sum;
	}
	
	public static void message() {
		System.out.println("Some test message");
	}
}

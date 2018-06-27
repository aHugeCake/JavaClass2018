package com.javasession.week_1.day1_VariableTypes;

public class StaticVariable {
	
	//Static/Class Variable
	//It doesn't need to be initialized
	//If the method is static, it only understands variables which have already been initialized.
	
	//String is reference data type
	static String str = "Test";
	//int is primitive data type
	static int num1 = 12;
	
	public static void main(String [] args) {
		
		System.out.println(str); //str has already been initialized
		System.out.println(num1);
		
	}

}

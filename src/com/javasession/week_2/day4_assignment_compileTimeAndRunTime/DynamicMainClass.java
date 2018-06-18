package com.javasession.week_2.day4_assignment_compileTimeAndRunTime;

public class DynamicMainClass extends DynamicBinding{

	public static void main(String[] args) {
		DynamicBinding str1 = new DynamicBinding();
		str1.dynamicOutput(1);
		
		System.out.println();
		
		DynamicBinding str2 = new DynamicMainClass();
		str2.dynamicOutput(1);
	}
	
	public void dynamicOutput(int a) {
		System.out.println("Dynamic in Main Class: "+a);
	}
}

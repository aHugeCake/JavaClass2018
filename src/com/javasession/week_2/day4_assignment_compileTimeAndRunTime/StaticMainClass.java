package com.javasession.week_2.day4_assignment_compileTimeAndRunTime;

public class StaticMainClass extends StaticBinding{

	public static void main(String[] args) {
		StaticBinding st1 = new StaticBinding();
		st1.staticOutput(1);
		
		int[] a = {1,2};
		st1.staticOutput(a);
		
		System.out.println();
		
		StaticBinding st2 = new StaticMainClass();
		st2.staticOutput(1);
		
		int[] b = {1,2};
		st2.staticOutput(b);
		
	}
	
	public static void staticOutput(int a) {
		System.out.println("Static in Main Class: "+a);
	}

}

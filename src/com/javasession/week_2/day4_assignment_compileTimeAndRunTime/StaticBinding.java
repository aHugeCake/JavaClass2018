package com.javasession.week_2.day4_assignment_compileTimeAndRunTime;

public class StaticBinding {

	public static void staticOutput(int a) {
		System.out.println("Static: "+a);
	}
	
	public static void staticOutput(int[] a) {
		System.out.print("Static: ");
		for(int num: a){
			System.out.print(num + " ");
		}
	}
}

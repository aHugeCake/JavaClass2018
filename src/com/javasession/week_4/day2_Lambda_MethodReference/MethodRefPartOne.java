package com.javasession.week_4.day2_Lambda_MethodReference;

public class MethodRefPartOne {
	
	//Method reference: run any method without an instance
	//Often used in a list, especially in database
	//use as an implementation of a class
	public static void main(String[] args) {
//		() -> printMessage();
		Thread task = new Thread(MethodRefPartOne :: printMessage);	//:: is a sign of method reference
		task.start();
		
		
		
	}

	public static void printMessage() {
		System.out.println("Hello");
	}
}

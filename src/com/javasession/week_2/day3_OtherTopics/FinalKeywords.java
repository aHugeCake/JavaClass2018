package com.javasession.week_2.day3_OtherTopics;

public class FinalKeywords {

	// static int num = 15;
	
	// final variable doesn't allow to be modified
	// *Note: finally(only use in trycatch) and finalize(garbage collection)
	final static int num = 15;
	
	public static void main(String[] args) {
		//num = 25;
		System.out.println(num);
	}
}

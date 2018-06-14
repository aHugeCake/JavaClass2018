package com.javasession.week_1.day3_loops;

public class ForLoop {	
	
	public static void main(String[] args) {
		/*
		 * 1. For Loop
		 * 
		 * 2. For Each Loop
		 * 
		 */
		
		/*
		 * 
		 * 1. For Loop
		 * 
		 * 	for(initialization; condition; increment/decrement){
		 * 		statement(s);
		 * 	}
		 * 
		 * * Note: initialization, condition and increment/decrement are all optional and can be left blank
		 */
		
		for(int i = 0; i<10; i++) {
			System.out.println("Print i: " + i);
		}
		
		//If i = 11, the loop will end depending on the memory of CPU. This is called memory leak.
		/*
		 * The concepts of heap and stack and how they work? (Assignment)
		 * 
		 */
	}
}

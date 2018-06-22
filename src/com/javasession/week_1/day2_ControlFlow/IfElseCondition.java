package com.javasession.week_1.day2_ControlFlow;

public class IfElseCondition {

	/*
	 * a) if statement
	 * b) nested if statement
	 * c) if-else statement
	 * d) if-else-if statement
	 */
	
	public static void main(String[] args) {
		
		/*
		 * a) if statement
		 * 		if(condition){
		 * 			Statement(s);
		 * 		}
		 */
		
		int num = 70;
		if(num < 100) {
			System.out.println("Number is less than 100");
		}
		
		/*
		 * b) nested if statements
		 * 		if(condition_1){
		 * 			Statement1(s);
		 * 			
		 * 			if(condition_2){
		 * 				Statement2(s);
		 * 			}
		 * 		}
		 */
		
		if(num < 100) {
			System.out.println("number is less than 100");
			if(num < 50) {
				System.out.println("number is greater than  50");
			}
		}
		
		/*
		 * c) if else statements
		 * 		if(condition){
		 * 			Statement(s);
		 * 		}else{
		 * 			Statement(s);
		 * 		}
		 */
		
		/*
		 * d) if-else if statements
		 * 		if(condition_1){
		 * 			//if
		 * 		}
		 * 		else if(condition_2){
		 * 			//execute this if condition_1 is not met and condition_2 is met
		 * 			statement(s);
		 * 		}
		 * 		else if(condition_3){
		 * 			//execute this if condition_1 & condition_2 are not met and condition_3 is met
		 * 			statement(s);
		 * 		}
		 * 		.
		 * 		.
		 * 		.
		 * 		else{
		 * 			// if none of the conditions is true, then these statements gets executed
		 * 			statement(s);
		 * 		}
		 */
		
		int num1 = 1234;
		
		if(num1 < 100 && num1 >= 1) {
			System.out.println("it's two digit number");
		}else if(num1 < 1000 && num1 >= 100) {
			System.out.println("it's three digit number");
			
		}else if(num1 < 10000 && num1 >= 1000) {
			System.out.println("it's four digit number");
		}
		
		else {
			System.out.println("some where between 1 & 99999");
		}
		
	}
	
	
	
	
	
	
}

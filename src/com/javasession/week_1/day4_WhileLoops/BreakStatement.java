package com.javasession.week_1.day4_WhileLoops;

public class BreakStatement {
	public static void main(String[] args) {
		int num = 0;
		while( num <= 100) {
			System.out.println("Value of num " + num);
			if(num == 8) {
				//break can be used when we don't know the range and when to end the loop
				break;
			}
			num++;
		}
		
		System.out.println("Out of While Loop");
	}
}

package com.javasession.week_1.day4_WhileLoops;

public class WhileLoop {

	public static void main(String[] args) {
		
		/*
		 * 1. while loop
		 * 		while(condition)
		 * 		{
		 * 			statement(s);
		 * 		}
		 * 
		 */
		
		int i = 10;
		while (i > 1) {
			System.out.println(i);
			i--;
		}
		
		int arr [] = {2, 11, 45, 9};
		
		int j = 0;
		while (j < 4) {
			System.out.println(arr[j]);
			j++;
		}
	}
}

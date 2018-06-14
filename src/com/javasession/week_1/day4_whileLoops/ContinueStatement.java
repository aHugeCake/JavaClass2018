package com.javasession.week_1.day4_whileLoops;

public class ContinueStatement {

	public static void main(String[] args) {
		//continue;
		//continue will not influence outer loop, only inner loop is influenced.
		for (int j = 0; j <= 6; j++) {
			if(j == 4) {
				System.out.println("This is four");
				//j--;  //infinite loop, always "This is four"
				continue;
			}
			System.out.println(j + " ");
		}
	}
	
}

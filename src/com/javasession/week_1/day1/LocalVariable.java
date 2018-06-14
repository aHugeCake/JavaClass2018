package com.javasession.week_1.day1;

public class LocalVariable {
	
	//Local Variable
	//It is declared in methods, constructors, or blocks
	
	public static void main(String [] args) {
				
		int num2 = 12;  //Only this method can use it and other methods cannot access it
		System.out.println(num2);
		
	}
	
	public void getAll() {
		//System.our.println(num2);  //returns an error
	}
}

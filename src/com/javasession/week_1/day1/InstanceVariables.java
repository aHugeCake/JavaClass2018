package com.javasession.week_1.day1;

public class InstanceVariables {
	
	//Instance Variable
	//It is declared in a class, but outside a method, constructor or any block

	int num1 = 12; //Global Variable, every method in this class can access this variable
	
	public static void main(String [] args) {
		
		//System.out.println(num1);   //returns an error since main method is a static method and cannot understand Instance Variable;
		
	}
	
	public void getAll() {
		System.out.println(num1);  //Our own method which is not static can use global variable
	}
}

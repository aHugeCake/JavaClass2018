package com.javasession.week_2.day4_Assignment_CompileTimeAndRunTime;

public class DynamicBinding_Emp extends Human1{

	public static void main(String[] args) {
		
		Human1 obj = new DynamicBinding_Emp();
		Human1 obj2 = new Human1();
		
		obj.walk();
		obj2.walk();
	}
	
	public void walk() {
		System.out.println("Emp can walk");
	}
}


class Human1{
	public void walk() {
		System.out.println("Human can walk");
	}
}

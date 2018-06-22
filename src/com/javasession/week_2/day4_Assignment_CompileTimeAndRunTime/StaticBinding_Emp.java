package com.javasession.week_2.day4_Assignment_CompileTimeAndRunTime;

public class StaticBinding_Emp extends Human{
	
	//the method is static,private,final --> Static Binding
	public static void main(String[] args) {
		
		Human obj = new StaticBinding_Emp();
		Human obj2 = new Human();
		
		obj.walk();
		obj2.walk();
	}
	
	public static void walk() {
		System.out.println("Emp can walk");
	}
}


class Human{
	public static void walk() {
		System.out.println("Human can walk");
	}
}
package com.javasession.week_3.day1_SubClass_SuperClass;

public class SubClass extends SuperClass {   //super class -> base class

	int someNum = 25;
	void printNumber() {
		//System.out.println(someNum);		//25
		System.out.println(super.someNum);	//20
	}
	
	void display() {
		System.out.println("From sub class");
	}
	
	void printMeg() {
		display();
		super.display();
	}
	
	public static void main(String[] args) {
		SubClass sb = new SubClass();
		sb.printNumber();
		
		sb.printMeg();
	}
}

class SuperClass {
	int  someNum = 20;
	
	void display() {
		System.out.println("From super class");
	}
}

package com.javasession.week_3.day1_AbstractClass;

//abstract methods must be public
//There can only be one public class in a same file
abstract class Animal {		//abstract class has no logic
	//all the abstract methods must be implemented/override
	public abstract void sound();	//force subclasses to override all the methods since others only need to override some of the methods
	public abstract void move();
	
	public void myMethod() {		//Without abstract keywork, the method is allowed not to override
		System.out.println("Hello");
	}
}

public class AbstractClass_Cat extends Animal{
	@Override
	public void sound() {
		System.out.println("Cat sound");
	}
	
	public static void main(String[] args) {
		Animal ob = new AbstractClass_Cat();
		ob.sound();
		//ob.move();
	}
	//Add unimplemented methods
	@Override
	public void move() {
		// TODO Auto-generated method stub
		//System.out.println("Cat Moves")
	}
}

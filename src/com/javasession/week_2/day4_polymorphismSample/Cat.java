package com.javasession.week_2.day4_polymorphismSample;

public class Cat extends Animal{

	public static void main(String[] args) {
		Animal obj = new Cat();
		obj.sound();
	}
	
	public void sound() {
		System.out.println("Sound of a cat");
	}
	
	public void move() {
		System.out.println("Cat move");
	}
}

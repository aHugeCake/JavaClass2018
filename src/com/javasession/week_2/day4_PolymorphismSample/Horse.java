package com.javasession.week_2.day4_PolymorphismSample;

public class Horse extends Animal{
	
	//main method should be static because it doesn't need to depend on anything
	public static void main(String[] args) {
		//sound();   //it is not static
		
		//obj is an Animal object, but it calls Horse's constructor
		Animal obj = new Horse();
		obj.move();
	}
	
	//annotation, to inform others it's override
	@Override
	
	public void sound() {
		System.out.println("Sound of a horse");
	}
	
	public void move() {
		System.out.println("Horse move");
	}

}

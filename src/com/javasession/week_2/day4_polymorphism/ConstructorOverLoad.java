package com.javasession.week_2.day4_polymorphism;

public class ConstructorOverLoad {

	int num1;
	int num2;
	double b1;
	boolean b2;
	
	//Constructor is not a method
	//Constructor cannot have return type
	//Constructor is used to call the class
	public ConstructorOverLoad() {
		//Assume this class is super class
		super();
		
		//Eclipse --> right click --> Source --> Generate Constructor using Fields
	}

	public ConstructorOverLoad(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}

	public ConstructorOverLoad(int num1, int num2, double b1, boolean b2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
		this.b1 = b1;
		this.b2 = b2;
	}
}

package com.javasession.week_2.day2_Abstractions_Inheritance_AccessModifier;

class MainClass {
	//constructor
	MainClass(){
		System.out.println("From Main class");
	}
	
	void decp() {
		System.out.println("Method from Main class");
	}
	
	public static void main(String[] args) {
		Example ex = new Example();
		ex.decp();
	}
}

class Example extends MainClass{
	Example(){
		System.out.println("From Example class");
	}
	
	void decp() {
		System.out.println("Method from From Example class");
		//super keywords
		super.decp();
	}
	
	//main class here will not work because the class name is not the same with the name of this java file
}

package com.javasession.week_3.day1_SubClass_SuperClass;

public class SubClassConstructor extends SuperClassConstructor{

	SubClassConstructor() {
		
		
	}
	
	SubClassConstructor(int a){
		super(a);
		System.out.println("Constructor of Sub Class: " + a);
	}
	
	public static void main(String[] args) {
		SubClassConstructor obj = new SubClassConstructor(3);
	}
	
	
}

class SuperClassConstructor{
	SuperClassConstructor() {
		System.out.println("Construcor of Super Class");
	}
	SuperClassConstructor(int a) {
		System.out.println("Constructor of Super Class: " + a);
	}
}

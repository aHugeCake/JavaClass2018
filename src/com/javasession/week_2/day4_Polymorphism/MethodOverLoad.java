package com.javasession.week_2.day4_Polymorphism;

public class MethodOverLoad {
	//Overload is polymorphism
	//Same class and different implementations
	//Same name, but different signature(name + input parameters)
	//Overloading can only be in the same class
	
	
	void demo(int a) {
		System.out.println("A: " + a);
	}
	
	//private void demo
		//protected void demo
		//public void demo
		//When another class override these methods, they can only change protected to protected or public, but can not change it to private
	protected void demo(int a, int b) {
		
		System.out.println("A + B: " + a + "," +b);
	}
	
	double demo(double a) {
		System.out.println("Double A" + a);
		return a * a;
	}
}

package com.javasession.week_2.day4_polymorphism;

public class MethodOverLoadMainClass extends MethodOverLoad{
	//Reuse and change the code of instance is called polymorphism
	public static void main(String[] args) {
		MethodOverLoad ov = new MethodOverLoad();
		double result;
		
		ov.demo(10);
		ov.demo(12,34);
		
		result = ov.demo(10.4);
		System.out.println("OOP" + result);
		
		
		MethodOverLoadMainClass ov1 = new MethodOverLoadMainClass();
		ov1.demo(12,34);
		
		//To implement class of another package, we need to import this package
		
		
	}
	
	//It is not allowed: double a
	//For overriding, the signature must be the same
	//Override should extend
	@Override
	public void demo(int a, int b) {
		System.out.println("A + B: " + a + " ++ " +b);
	}
	

}

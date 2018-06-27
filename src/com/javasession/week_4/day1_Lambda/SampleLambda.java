package com.javasession.week_4.day1_Lambda;

public class SampleLambda {
	public static void main(String[] args) {
		HelloLambda hm = () -> System.out.println("Print Lambda!");
		hm.someMethod();
		
		AddLambda am = (int a, int b) -> a+b;
		System.out.println(am.addSum(6, 9));
		
		//if the interface is not functional interface, lambda will not support two abstract methods in same interface class
		//Lambda is most part the short cut of inner class but it not the same as inner class
	}
	
	//This is not a functional interface
//	interface HelloLambda{
//		void someMethod();
//		//int sumOfAll(int a, int b); //no error
//	}
	
	//To make it functional interface
	@FunctionalInterface
	interface HelloLambda{
		void someMethod();
		
		default int sumOfAll(int a, int b) {		//if this is an abstract method, we will get an error
			return 0;
		}
	}
	
	interface AddLambda{
		int addSum(int a, int b);

	}
}

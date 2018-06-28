package com.javasession.week_4.day2_Lambda;

import java.util.function.BiConsumer;

public class LambdaExceptionsOne {

	public static void main(String[] args) {
		int[] someNumbers = {1, 2, 3, 4};
		int key = 2;
		
		//method that has three input parameters. The last parameter is input on lambda
		//Lambda is a value and can be a parameter
		process(someNumbers, key, wrapperLambda((v, k) -> System.out.println(v/k)));
	}
	
//	public static BiConsumer<Integer,Integer> someMethod(int v, int k){
//		System.out.println(v/k);
//		return ?
//	}
	
	//Method for Lambda Expression
	private static void process(int[] someNumbers, int key, BiConsumer<Integer, Integer> consumer) {
		for(int i: someNumbers) {
			consumer.accept(i, key);
		}
	}
	
//	public static int someNum(int a, int b) {
//		return a + b;
//	}
	
	//BiConsumer is a DataType which is a type similar with HashMap
	//BiConsumer is a Functional Interface: This is a functional interface and can therefore be used as the assignment target for a lambda expression or method reference. 
	private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> consumer){
		return (v, k) -> {
			try {
				consumer.accept(v, k);
			}
			catch(ArithmeticException e) {
				System.out.println("Exception caught in wrapper lambda");
			}
		};
	}
}

package com.javasession.week_4.day1_Lambda;

@FunctionalInterface
public interface ForJustLambdaOnly {
	// For normal interface you are allowed to declare more than one Abstract method
	// However, when you have more than one Abstract method, your lambda function will not work
	// What if you have implemented lambda functions with that later on someone add more than one abstract method
	
	// In Functional interface, you are only allowed to have one Abstract method
	
	void sumOfAll();
	
	//Default methods in interface are not forced to override
	default int sumOfMultiply() {	//other methods should have default modifier and implementation
		return 0;
	}
}

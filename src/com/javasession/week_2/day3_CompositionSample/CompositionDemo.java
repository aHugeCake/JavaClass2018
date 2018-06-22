package com.javasession.week_2.day3_CompositionSample;

public class CompositionDemo {
	
	/*
	 * Reusability of code:
	 * 
	    1. Keep the code DRY. Dry means "Don't Repeat Yourself".
	    2. Make a class/method do just one thing.
	    3. Write unit tests for your classes AND make it easy to test classes.
	    4. Remove the business logic or main code away from any framework code
	    5. Try to think more abstractly and use Interfaces and Abstract classes.
	    6. Code for extension. Write code that can easily be extended in the future.
	    7. Don't write code that isn't needed.
	    8. Try to reduce coupling.
	    9. Be more Modular
	    10.Write code like your code is an External API

	 */
	
	//The relation between an object
	//Design Pattern
	
	//A bike needs an engine
	//The factory just instant a new bike
	//The buyer just needs to offer color and wheels and doesn't need to know how the bike is created
	
	//Assignment: difference between composition and inheritance and when to use them
	//Assignment: Association and aggregation
	
	
	//Composition: hide unnecessary information for this part
	
	public static void main(String[] args) {
		
		Factory_Brand h = new Factory_Brand();
		h.setColor("Black");
		h.setWheels(4);
		h.bikeFeatures();
		h.setStart();
	}
}

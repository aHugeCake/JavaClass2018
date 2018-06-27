package com.javasession.week_4.day1_Lambda;

public class TypeInterfaceLambda {
	public static void main(String[] args) {
		//Lambda allows us not to create a new class
		StringLength sl = str -> str.length();		//only one parameter, we can even skip ()
		System.out.println(sl.getSize("This is lambda with inner interface"));
		printSize(sl);
	}
	
	// You can also pass lambda as data input parameter in any methdos
	public static void printSize(StringLength slength) {		//Lambda is a datatype, can be passed as parameter
		System.out.println(slength.getSize("This is lambda method parameter"));
	}
	
	//interface can be within a class
	//While using Lambda, there is no difference between interfaces within or outside the class
	//If other class want to use this interface, that class should implement(extend) this class ?
	interface StringLength{
		int getSize(String str);
	}
}

package com.javasession.week_4.day1_Lambda;

public abstract class BasicLambda implements ForLambda{

	// Lambda Expression
	// java 8 version
		
	//Lambda will allow you effectively maintain and manage the code
	//Lambda is a way to shortcut code and classes
	
			 
	//type vname = (input param) -> {implementation};
	
	public static void main(String[] args) {
		
	}
	
	public void sayHello() {
		System.out.println("Hello!");
	}
	
	//sayHello = () -> {System.out.println("Hello!")};

	//public double doubeRet(double a, double b, double d) {
	//	return a + b;
	//}
	
	//if your code is in one line you can skip the word "return" and also the curly braces
	//doubleRet = (double a, double b, double d) -> {a + b};
	
	//Come from interface ForLambda, we can skip datatype of pramameters since they have already been declared in interface
	//Lambda only support an interface with only one abstract method
//	doubleRet = (a, b, d) -> {a+b};
	
}

//Functional Interface: only include one abstract method
//An interface is not annotated to functional interface, it can have as many abstract methods as we can
//We can create more default methods, but not abstract methods
interface ForLambda{
	 double doubleRet(double a, double b, double d);		//public abstract double doubleRet(double a, double b, double d);	//public abstract is optional
	 //This method is not forced to override
	 //default someMethod();
	 default void someMethod() {}	//abstract method should be default, private or protected
}

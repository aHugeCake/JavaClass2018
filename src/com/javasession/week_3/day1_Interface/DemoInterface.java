package com.javasession.week_3.day1_Interface;

//implements --> multiple inheritance
//extends --> only one inheritance
public class DemoInterface implements FirstInterface, SecondInterface{

	@Override
	public void method1() {
		System.out.println("This is method one");
		
	}

	@Override
	public void method2() {
		System.out.println("This is method two");
		
	}
	
	@Override
	public void method3() {
		System.out.println("This is method three");		
	}
	
	public static void main(String[] args) {
		FirstInterface obj = new DemoInterface();
		obj.method1();
		obj.method2();
		
		SecondInterface obj2 = new DemoInterface();
		obj2.method3();
	}	

}

interface FirstInterface{
	//No need to write abstract keyword because all the method in interface are regarded as abstract
	public void method1();
	public void method2();
}

interface SecondInterface{
	public void method3();
}
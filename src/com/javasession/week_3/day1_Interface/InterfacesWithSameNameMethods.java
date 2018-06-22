package com.javasession.week_3.day1_Interface;

public class InterfacesWithSameNameMethods implements FInterface, SInterface{
	//Cannot implement two interfaces with methods with same name but different signature
	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("Method one");
	}
	
	public static void main(String[] args) {
		FInterface obj = new InterfacesWithSameNameMethods();
		obj.method1();
		
		SInterface obj2 = new InterfacesWithSameNameMethods();
		obj2.method1();
	}

}

interface FInterface{
	public void method1();
}

interface SInterface{
	public void method1();
}

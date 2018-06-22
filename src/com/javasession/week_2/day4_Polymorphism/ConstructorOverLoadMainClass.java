package com.javasession.week_2.day4_Polymorphism;

public class ConstructorOverLoadMainClass {

	public static void main(String[] args) {
		ConstructorOverLoad ct = new ConstructorOverLoad();
		ct.b2 = true;
		
		ConstructorOverLoad ct1 = new ConstructorOverLoad(12,45);
		ConstructorOverLoad ct2 = new ConstructorOverLoad(12,45,45,true);
	}
}

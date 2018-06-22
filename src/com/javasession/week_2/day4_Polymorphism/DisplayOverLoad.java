package com.javasession.week_2.day4_Polymorphism;

public class DisplayOverLoad {

	public void desp(char c) {
		System.out.println(c);
	}
	
	public void desp(char c, int num) {
		System.out.println(c + " " + num);
	}
}

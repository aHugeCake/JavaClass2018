package com.javasession.week_2.day2_OtherTopics;

public class Abstractions {
	
	//int num = 10;
	private static int num = 10;   //No other class can change this value
	private String str = "Test";
	
	//Eclipse --> right click --> source --> Generate Getters and Setters...
	public static int getNum() {
		return num;
	}


	public static void setNum(int num) {
		Abstractions.num = num;
	}


	public String getStr() {
		return str;
	}


	public void setStr(String str) {
		this.str = str;
	}


	public static void main(String[] args) {
		
//		num = 15;
//		System.out.println(num);
		
		//because initialization of the class, we don't need num to be static
		Abstractions ab = new Abstractions();
		//Use the memory and use a different value for different classes
		//Different classes can use their own value
		ab.setNum(20);
		System.out.println((int)ab.getNum());
		System.out.println(num);
	}
}

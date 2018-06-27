package com.javasession.week_4.day2_ConcurrencyAndThreads;

//Same result with ThreadExapmle.java
public class RunnableExample implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Inside: " + Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		//main method	--> currentThread --> main
		System.out.println("Inside: " + Thread.currentThread().getName());
		System.out.println("Creating thread...");
		
		Thread t1 = new ThreadExample();
		System.out.println("Starting thread...");
		t1.start();
		
	}
}

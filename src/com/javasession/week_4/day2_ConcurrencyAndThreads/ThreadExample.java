package com.javasession.week_4.day2_ConcurrencyAndThreads;

public class ThreadExample extends Thread{
	
	/*
	 * Inside: main
		Creating thread...
		Starting thread...
		Inside: Thread-0
	 */
	@Override 
	public void run() {
		//Java will give thread names
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


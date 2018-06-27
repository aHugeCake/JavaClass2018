package com.javasession.week_4.day2_ConcurrencyAndThreads;

public class RunnableExampleAnonymousClass {

	public static void main(String[] args) {
		//main method	--> currentThread --> main
		System.out.println("Inside: " + Thread.currentThread().getName());
		

//		new Thread() {
//			@Override 
//			public void run() {
//				//Java will give thread names
//				System.out.println("Inside: " + Thread.currentThread().getName());
//			}
//		}.start();
		
		Runnable runnable = new Runnable() {
			@Override 
			public void run() {
				//Java will give thread names
				System.out.println("Inside: " + Thread.currentThread().getName());
			}
		};
		
		System.out.println("Creating thread...");
		
		Thread thread = new Thread(runnable);
//		Thread thread = new Thread(()->System.out.println("Inside: " + Thread.currentThread().getName()));
		
		System.out.println("Starting thread...");
		
		thread.start();
		
	}
}

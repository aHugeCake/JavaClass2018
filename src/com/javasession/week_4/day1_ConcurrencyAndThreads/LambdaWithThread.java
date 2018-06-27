package com.javasession.week_4.day1_ConcurrencyAndThreads;

public class LambdaWithThread {

	public static void main(String[] args) {
		//This is an example of Inner class
		Thread task1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Starting of Thread One"); 	//Every thread should override this run method
			}
		});
		
		task1.start();  // Nothing will happen without this start statement
		
		//This is an example of using lambda expression
		Thread task2 = new Thread(() -> System.out.println("Starting of Thread Two"));
		task2.start();
		
		
	}
}

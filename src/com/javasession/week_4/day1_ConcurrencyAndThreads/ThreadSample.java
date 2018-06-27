package com.javasession.week_4.day1_ConcurrencyAndThreads;

public class ThreadSample {
	
	public static void main(String[] args) {
		// We cannot make the threqd process ordered in which it will be going to run
		// Main Method is also known as Main Thread
		// Main block/ main thread is responsible to start an application
		System.out.println("From main thread");
		
		Thread SubclassForThread = new SubclassForThread();
		SubclassForThread st = new SubclassForThread();
		//Only allowed to run one instance of the one time only
		
		SubclassForThread.start();
		st.start();	//different thread can start same time, but we cannot have many same thread to start
		//st.start();	//error
		
		//To create Anonymous class
		//Anonymous class will not declare a name
		new Thread() {
			public void run() {
				System.out.println("Thread from the anonymous class");
			}
		}.start();
		System.out.println("Hello again from main thread");
	}
	
	
}

class SubclassForThread extends Thread{
	@Override
	public void run() {
		try {
			Thread.sleep(5000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Thread from another class");
	}
}

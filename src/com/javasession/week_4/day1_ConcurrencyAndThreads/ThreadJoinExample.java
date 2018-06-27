package com.javasession.week_4.day1_ConcurrencyAndThreads;

public class ThreadJoinExample {
	//Force one thread to run after another
	public static void main(String[] args) {
		Runnable run1 = new Runnable() {
			@Override
			public void run() {
				String[] str = {"AA", "BB", "CC", "DD"};
				for(String s: str) {
					try {
						Thread.sleep(1000);
					}catch(InterruptedException e) {
						System.out.println("Thread sleep Error");
					}
					System.out.println(s);
				}
				System.out.println("End of Thread One");
			}
		};
		
		Thread t1 = new Thread(run1);
		t1.start();
		
		Runnable run2 = new Runnable() {
			@Override
			public void run() {
				String[] str = {"EE", "FF", "GG", "HH"};
				for(String s: str) {
					try {
						Thread.sleep(2000);
					}catch(InterruptedException e) {
						System.out.println("Error while t2 sleep");
					}
					System.out.println(s);
				}
			}
		};
		
		Thread t2 = new Thread(run2);
		try {
			t1.join(5000);  //t2 has to wait 5 milliseconds to start after t1 starts
			t2.start();
		}
		catch(InterruptedException e) {
			System.out.println("Error while joinning t1 to t2");
		}
	}
}

package com.javasession.week_4.day2_ConcurrencyAndThreads;

public class ThreadSleepExample {
	
	public static void main(String[] args) {
		String [] names = {"Mike", "Peter", "Alice", "Sami", "Steve"};
		
		Runnable runnable = ()->{
			System.out.println("Inside: " + Thread.currentThread().getName());
			
			for(String nm: names) {
				System.out.println(nm);
				
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {		//For example, network failure
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		
		Thread thread = new Thread(runnable);
		thread.start();
	}
}

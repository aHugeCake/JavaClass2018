package com.javasession.week_4.day3_ConcurrencyAndThreads_ExecutorFramework;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorsPeriodicExample {

	public static void main(String[] args) {
		//ping the net or make phone calls to make sure the connection is done or not
		ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);
		
		Runnable task = () -> {
			System.out.println("Executing task at " + System.nanoTime());
		};
		
		//without shutdown, it will keep on running --> thread loop
		System.out.println("scheduling task to be executed every 2 seconds with an initial delay of 0 seconds");
		scheduledExecutorService.scheduleAtFixedRate(task, 0, 2, TimeUnit.SECONDS);
		
		//shutdown will kill this service
		//shutdown will shut down the object but not application
//		scheduledExecutorService.shutdown();
	
	}
}

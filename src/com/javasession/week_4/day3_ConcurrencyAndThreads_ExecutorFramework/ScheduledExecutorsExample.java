package com.javasession.week_4.day3_ConcurrencyAndThreads_ExecutorFramework;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorsExample {

	public static void main(String[] args) {
		//manage the life cycle of threads
		ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);
		
		Runnable task = () -> {
			System.out.println("Executing task at " + System.nanoTime());
		};
		
		System.out.println("Submitting task at " + System.nanoTime() + " to be executed after 5 seconds.");
		scheduledExecutorService.schedule(task, 5, TimeUnit.SECONDS);
		
		//Thread.sleep() isn't thread safe. It doesn't manage the lifecycle of the thread
		//Thread.close() only shut down one thread, shutdown shuts down a pool
		
		//If there are threads after shutdown, session will shut down after these threads are done.
		//.shutdownNow will ignore the threads after this statement
		//If we don't shut down, we will keep a life memory, keep blocking, after this nothing will down because the pool is blocked
		scheduledExecutorService.shutdown();
	}
}

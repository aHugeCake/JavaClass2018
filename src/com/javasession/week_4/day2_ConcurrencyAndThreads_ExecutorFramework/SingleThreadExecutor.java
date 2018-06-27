package com.javasession.week_4.day2_ConcurrencyAndThreads_ExecutorFramework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadExecutor {
	/*
	 * Worker Object:
	 * 		
	 * 		Process		object assignment
	 * 			|---> worker object1 ---|---> thread management
	 * 			|---> worker object2		|---> ...
	 * 			|---> ...
	 * *Note: Different worker object is assigned different tasks
	 */

	public static void main(String[] args) {
		System.out.println("Inside: " + Thread.currentThread().getName());
		
		System.out.println("Creating Executor Service...");
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		
		System.out.println("Creating a Runnable...");
		Runnable runnable = () -> {
			System.out.println("Inside: " + Thread.currentThread().getName());
		};
		
		System.out.println("Submit the task specified by the runnable to the executor service.");
		executorService.submit(runnable);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Shutting down the executor");
		executorService.shutdown(); 		// If not shut down, the process will not stop
	}
}

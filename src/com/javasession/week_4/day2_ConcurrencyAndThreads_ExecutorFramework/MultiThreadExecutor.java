package com.javasession.week_4.day2_ConcurrencyAndThreads_ExecutorFramework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MultiThreadExecutor {

	public static void main(String[] args) {
		System.out.println("Inside: " + Thread.currentThread().getName());
		
		System.out.println("Creating Executor Service with a thread poole of Size 2");
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		
		Runnable task1 = () -> {
			System.out.println("Executing Task1 inside: " + Thread.currentThread().getName());
			
			try {
				TimeUnit.SECONDS.sleep(2);	//TimeUnit.DAYS/SECONDS... --> not thread, but java
				System.out.println("This is task1");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				throw new IllegalStateException(e);
			}
		};
		Runnable task2 = () -> {
			System.out.println("Executing Task2 inside: " + Thread.currentThread().getName());
			
			try {
				TimeUnit.SECONDS.sleep(4);	
				System.out.println("This is task2");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				throw new IllegalStateException(e);
			}
		};

		Runnable task3 = () -> {
			System.out.println("Executing Task3 inside: " + Thread.currentThread().getName());
			
			try {
				TimeUnit.SECONDS.sleep(3);
				System.out.println("This is task3");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				throw new IllegalStateException(e);
			}
		};
		
		System.out.println("Submitting the tasks for execution...");
		executorService.submit(task1);
		executorService.submit(task2);
		executorService.submit(task3);	//The pool size is 2-thread, this one isn't managed in the pool
		
		executorService.shutdown();

		
	}
}

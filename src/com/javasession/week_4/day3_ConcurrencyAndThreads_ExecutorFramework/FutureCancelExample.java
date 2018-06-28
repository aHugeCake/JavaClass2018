package com.javasession.week_4.day3_ConcurrencyAndThreads_ExecutorFramework;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureCancelExample {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		
		long startTime = System.nanoTime();
		Future<String> future = executorService.submit(() -> {
			Thread.sleep(2000);	//2 seconds
			return "Hello from Callable";
		});
		
		while(!future.isDone()) {
			System.out.println("Task is still not done...");
			Thread.sleep(200);	//200 milliseconds
			double elapsedTimeInSec = (System.nanoTime() - startTime) / 1000000000.0;
//			double elapsedTimeInSec = (System.nanoTime() - startTime) / 1000000000000.0;
			
			//Connection load for visa is not greater than 300 milliseconds
			
			if(elapsedTimeInSec > 1) {
				//kill everything
				future.cancel(true);
			}
		}
		
		System.out.println("Task completed! Retrieving the result");
		//block the pool and future has already been cancelled, so shutdown will never be accessed and the process will not stop
		String result = future.get();
		System.out.println(result);
		
		executorService.shutdown();
	}
}

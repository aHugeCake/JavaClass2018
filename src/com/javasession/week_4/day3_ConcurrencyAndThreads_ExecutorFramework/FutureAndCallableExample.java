package com.javasession.week_4.day3_ConcurrencyAndThreads_ExecutorFramework;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

//Using thread to return an object back
public class FutureAndCallableExample {
	//InterruptedException --> Thread.sleep()
	//ExecutionException --> future.get()
	public static void main(String[] args) throws InterruptedException, ExecutionException{
		
		ExecutorService executorService = Executors.newSingleThreadExecutor();	//Single thread
//		ExecutorService executorService = Executors.newFixedThreadPool(2);		//Multi-thread, usually no more than 10, easy to manage
		
		Callable<String> callable = () -> {
			//Perform some computation
			System.out.println("Entered Callable");
			Thread.sleep(2000);
			return "Hello from Callable";
		};
		
//		Callable<Double> callable = () -> {
//			//Perform some computation
//			System.out.println("Entered Callable");
//			Thread.sleep(2000);
//			return 0.0;
//		};
		
		System.out.println("Submitting Callable");
		//Keep the calculation of the return type in the memory
		Future<String> future = executorService.submit(callable);
//		Future<Double> future = executorService.submit(callable);
		
		//This line executes immediately
		System.out.println("Do something else while callable is getting executed");
		
		System.out.println("Retrieve the result of the future");
		//Future.get() blocks the memory/the life of the thread/the pool until the result is available (When callable returns an object, it takes time for memory to create the object)
		String result = future.get();
//		Double result = future.get();
		System.out.println(result);
		
		executorService.shutdown();
		
		
	}
}

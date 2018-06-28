package com.javasession.week_4.day3_ConcurrencyAndThreads_ExecutorFramework;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class InvokeAnyExample {

	public static void main(String[] args) throws InterruptedException, ExecutionException{
		//The pool decides which thread is the fasted and will choose which one, so the size should be larger than the number of threads
		ExecutorService executorService = Executors.newFixedThreadPool(5);
				
		Callable<String> task1 = () -> {
			Thread.sleep(2000);
			return "Result of Task1";
		};
		
		Callable<String> task2 = () -> {
			Thread.sleep(1000);
			return "Result of Task1";
		};
		
		Callable<String> task3 = () -> {
			Thread.sleep(5000);
			return "Result of Task1";
		};
		
		
		
		//Returns the result of the fastest callable. (task2 in this case)
		//This will run the fastest thread which has been chosen by the pool
		//Only invoke one
		String result = executorService.invokeAny(Arrays.asList(task1, task2, task3));
		//invoke all, doesn't in the fastest order
		List<Future<String>> result2 = executorService.invokeAll(Arrays.asList(task1, task2, task3));
		
		System.out.println(result);
		System.out.println(result2.toString());
		
		executorService.shutdown();
	}
}

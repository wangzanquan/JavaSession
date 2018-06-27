package com.javasession.concrrencyAndThreads;

import java.util.Arrays;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class InvokeAnyExample {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executorService = Executors.newFixedThreadPool(5);
		
		Callable<String> task1 = () -> {
			Thread.sleep(2000);
			return "Result of Task1";
		};
		
		Callable<String> task2 = () -> {
			Thread.sleep(1000);
			return "Result of Task2";
		};
		
		Callable<String> task3 = () -> {
			Thread.sleep(3000);
			return "Result of Task3";
		};
		
		//Returns the result of the fastest callable. 
		String result = executorService.invokeAny(Arrays.asList(task1, task2, task3));
		
		System.out.println(result);
		

	}

}

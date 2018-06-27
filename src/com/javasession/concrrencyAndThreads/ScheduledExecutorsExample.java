package com.javasession.concrrencyAndThreads;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorsExample {

	public static void main(String[] args) {
		ScheduledExecutorService scheduledExecutorsService = Executors.newScheduledThreadPool(1);
		Runnable task = () ->{
			System.out.println("Executing Task at " + System.nanoTime());
		};
		System.out.println("Submitting task at " + System.nanoTime() + " to be exected after 5 seconds.");
		scheduledExecutorsService.schedule(task, 5, TimeUnit.SECONDS);
		
		/*
		 * Shutdown is graceful shutdown.
		 */
		scheduledExecutorsService.shutdown();
	}

}

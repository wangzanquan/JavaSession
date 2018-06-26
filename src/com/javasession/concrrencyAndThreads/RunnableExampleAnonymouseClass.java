package com.javasession.concrrencyAndThreads;

public class RunnableExampleAnonymouseClass {

	public static void main(String[] args) {
		System.out.println("Inside: " + Thread.currentThread().getName());
		System.out.println("Creating thread...");
		
		Runnable runnable = new Runnable() {

			@Override
			public void run() {
				System.out.println("Inside: " + Thread.currentThread().getName());
				
			}
		};
		
		System.out.println("Creatig Thread...");
		Thread thread = new Thread(runnable);
		
		System.out.println("Starting Thread...");
		thread.start();
		
	}

}

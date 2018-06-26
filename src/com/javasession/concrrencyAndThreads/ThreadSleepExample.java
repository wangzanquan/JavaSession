package com.javasession.concrrencyAndThreads;

public class ThreadSleepExample {

	public static void main(String[] args) {
		String[] names = {"Mike", "Peter", "Sammy", "Steve"};
		
		Runnable runnable = () -> {
			System.out.println("Inside: " + Thread.currentThread().getName());
			for(String n : names) {
				System.out.println(n);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		
		Thread thread = new Thread(runnable);
		thread.start();

	}

}

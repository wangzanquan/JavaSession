package com.javasession.concrrencyAndThreads;
//Extends Thread
public class MultiThreadingExample extends Thread {

	/*
	 * Inside: main
	 * Creating thread ...
	 * Starting thread ...
	 * Inside: Thread-0
	 */
	
	@Override
	public void run() {
		System.out.println("Inside: " + Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		
		System.out.println("Inside: " + Thread.currentThread().getName());
		System.out.println("Creating thread...");
		
		Thread t1 = new MultiThreadingExample();
		System.out.println("Starting thread...");
		
		t1.start();
		
		Thread t2 = new MultiThreadingExample();
		System.out.println("Starting thread...");
		
		t2.start();
		

	}

}

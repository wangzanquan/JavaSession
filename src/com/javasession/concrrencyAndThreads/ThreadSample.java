package com.javasession.concrrencyAndThreads;

public class ThreadSample {

	public static void main(String[] args) {

		//We can not make the tread process ordered in which it will going to run
		//Main Method is also know as Main Thread
		
		System.out.println("From main thread");
		
		Thread SubclassForThread = new SubclassForThread();
		SubclassForThread st = new SubclassForThread();
		//Only allowed to run one instance of the one time only
		
		SubclassForThread.start();
		st.start();
		
		//To create Anonymous class
		new Thread() {
			public void run() {
				System.out.println("Thread from the anonymous class");
			}
		}.start();
		
		System.out.println("Hello Again from main thread");
		
	}

}

class SubclassForThread extends Thread{
	@Override
	public void run() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Thread from another class");
	}
}

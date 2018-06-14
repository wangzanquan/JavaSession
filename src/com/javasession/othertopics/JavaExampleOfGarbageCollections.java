package com.javasession.othertopics;

public class JavaExampleOfGarbageCollections {
	
	public static void main(String[] args) {
		JavaExampleOfGarbageCollections je = new JavaExampleOfGarbageCollections();
		je = null;
		
		JavaExampleOfGarbageCollections a = new JavaExampleOfGarbageCollections();
		JavaExampleOfGarbageCollections b = new JavaExampleOfGarbageCollections();
		
		b = a;
		
		System.gc();
		
	}
	
	protected void finalize() throws Throwable{
		System.out.println("Garbage Collection from JVM");
	}
	
	
}

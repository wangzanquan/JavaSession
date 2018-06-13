package com.javasession.week.two.tryandcatch;

import java.io.IOException;

public class ThowsSampleCode {
	/*
	 
	 This is how to handle multiple exceptions at the same time. For any methods.
	 
	 */
	public static void main(String[] args) throws NullPointerException, ArithmeticException, 
	NumberFormatException{
		
		try {
			Example ex = new Example();
			ex.myMethod(1);
		}catch(Exception e) {//This Exception comes from Example class
			System.out.println(e);
		}
		
	}

}
//In one java file, you can only have public class. But you can have other classes.

class Example{
	void myMethod(int num) throws IOException, ClassNotFoundException{
		if(num==1) {
			throw new IOException("IO exceptions");
		}else {
			throw new ClassNotFoundException("Class not found exceptions");
		}
	}
}

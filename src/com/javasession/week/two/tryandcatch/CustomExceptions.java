package com.javasession.week.two.tryandcatch;

public class CustomExceptions {

	public static void main(String[] args) {
		try {
			System.out.println("Try block");
			
			//The following is trigger the exception in catch
			throw new MyException("This is from my exceptions class");
			
		} catch (Exception e) {
			System.out.println("Catch block");
			System.out.println(e);
		}
	}
	
}

class MyException extends Exception{
	String str1;
	
	public MyException(String str2) {
		this.str1 = str2;
	}
	public String toString() {
		return ("My Exception " + this.str1);
	}
}

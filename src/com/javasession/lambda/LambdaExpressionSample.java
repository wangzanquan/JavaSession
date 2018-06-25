package com.javasession.lambda;

public class LambdaExpressionSample implements ForLambda {
	//Lambda Expression
	//Java 8 version
	
	//Lambda expression:
	//type vname = (input parameter) -> {Implemantation};
	
	
	public static void main(String[] args) {
		
	}
	
	public void sayHello() {
		System.out.println("Hello!");
	}
	
	//sayHello = () ->{system.out.println("Hello)};
	
	public double doubleRet(double a, double b, double d) {
		return a + b;
	}
	
	/*
	 * (a, b, d) the java will know what kind of data type are they.
	 * The following line is also for interface methods.
	 * 99% Lambda is part of interface.
	 * !!!!Lambda only accept the interface with ONLY ONE abstract method.!!!! But you have have multiple default method.
	 * Which is called "functional interface". When create this kind of interface, write annotation @functional interface
	 */
	//doubleRet = (a, b, d) -> a + b + d;
	//if your code is in one line you dont return and also skip the curly braces
	
		
}
interface ForLambda{
	double doubleRet(double a, double b, double d);

}

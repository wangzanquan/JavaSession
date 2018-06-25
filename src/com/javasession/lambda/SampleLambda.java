package com.javasession.lambda;

public class SampleLambda {
	public static void main(String[] args) {
		HelloLambda hm = () -> System.out.println("Print Lambda!");
		hm.someMethod();
		
		AddLambda am = (int a, int b) -> a + b;
		System.out.println(am.addSum(6, 9));
		
		
		/*
		 * Lambda is most part the short cut of inner class but it is not the same as inner class.
		 */
		
	}
}

@FunctionalInterface
interface HelloLambda{
	void someMethod();
}

@FunctionalInterface
interface AddLambda{
	int addSum(int a, int b);
	default int sumOfAll(int a, int b) {
		return 0;
	}
}
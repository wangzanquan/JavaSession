package com.javasession.lambda;

public interface ForJustLambdaOnly {
	/*
	 * For normal interface you are allowed to declare more than one Abstract method
	 * However when you have more than on Abstract method your lambda function will not work
	 * What if you have implemented lambda functions with that later on someone add
	 * more than one abstract method.
	 *
	 */
	
	//In Functional interface you are only allowed to have one Abstract method.
	
	void sumOfAll();
	
	default int sumOfMultipley() {
		return 0;
	}
}

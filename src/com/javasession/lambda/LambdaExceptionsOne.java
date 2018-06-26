package com.javasession.lambda;

import java.util.function.BiConsumer;

public class LambdaExceptionsOne {

	public static void main(String[] args) {
		int[] someNumbers = {1, 2, 3, 4};
		int key = 0;
		
		//method that has three input params. last param is input on lambda
		process(someNumbers, key, wrapperLambda((v,k) -> System.out.println(v/k)));
		
	}
	
	//Method for lambda expression
	private static void process(int[] someNumbers, int key, BiConsumer<Integer, Integer> consumer) {
		for(int i: someNumbers) {
			consumer.accept(i, key);
		}
	}
	
	private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> consumer){
		return(v,k)->{
			try {
				consumer.accept(v, k);
			}catch (ArithmeticException e) {
				System.out.println("Exception caught in wrapper lambda");
			}
		};
	}

}

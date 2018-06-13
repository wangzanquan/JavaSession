package com.javasession.week.two.tryandcatch;

public class SampleThrow {
	/*
	 	Throw exception without try catch
	 */
	public static void main(String[] args) {
		eligibility(1, 2);
	}
	static void eligibility (int empID, int num) {
		if(empID < 24 && num < 55) {
			throw new ArithmeticException("not eligible for bonus");
		}else {
			System.out.println("Eligible for bonus");
		}
	}
}

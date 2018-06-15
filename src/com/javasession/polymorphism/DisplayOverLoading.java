package com.javasession.polymorphism;

public class DisplayOverLoading {
	public void desp(char c) {
		System.out.println(c);
	}
	public void desp(char c, int n) {
		System.out.println(c + " " + n);
	}
}

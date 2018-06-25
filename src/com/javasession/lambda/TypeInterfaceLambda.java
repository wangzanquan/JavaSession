package com.javasession.lambda;

public class TypeInterfaceLambda {
	public static void main(String[] args) {
		StringLength sl = str -> str.length();
		//If there is only one parameter
		//Just write: StringLength sl = () -> str.length();
	}


	//you can also pass lambda as data input parameter in any methods
	//Lambda can be a data type
	public static void printSize(StringLength slength) {
		System.out.println(slength.getSize("This is lambda method parameter"));
	}
	
	interface StringLength{
		int getSize(String str);
	}
}

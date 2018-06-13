package com.javasession.week.two.tryandcatch;

public class NestedTryCatchBlock {

	/*
	   //Nested try catch block
	   
	   try{
	   		statement 1;
	   		statement2;
	   		
	   		//try-catch block inside nested try block
	   		try{
	   			statement 3;
	   			statement 4;
	   				
	   			try{
	   				statement 5;
	   				statement 6;
	   			}
	   			catch (Exception e3){
	   				//Exception Message
	   			}
	   		}
	   		catch (Exception e2){
	   			//Exception Message
	   		}
	   }
	   //Catch of Main(Parent) try block
	   catch(Exception e1){
	    	//Exception Message
	   } 
	   
	 */
	public static void main(String[] args) {
		//main try-block
		try {
			//try-block2
			try {
				//try-block3
				try {
					int arr[] = {34,55,22,44};
					System.out.println(arr[32]);
				}catch(ArithmeticException e1){
					System.out.println("Arithmetic Exception");
					System.out.println("handled in try");
				}
			}catch(Exception e2) {
				
			}
		}catch(Exception e3) {
			
		}

	}

}







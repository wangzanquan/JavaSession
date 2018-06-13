package com.company.whileloop;

public class ContinueStatement {

	public static void main(String[] args) {
		//Continue
		/*
		   If the continue in the inner loop, it wont affect the outter loop
		 */
		
		for(int j = 0; j <= 6; j++) {
			if(j==4) {
				continue;
			}
			System.out.println(j + "");
		}
		
	}

}

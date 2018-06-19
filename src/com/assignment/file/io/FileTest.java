package com.assignment.file.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileTest {

	public static void main(String[] args) {
		
		InputStream inputBits = null;
		
		int bit;
		char convert;
		
		try {
			inputBits = new FileInputStream("C:\\Users\\Yang\\Documents\\JavaSession\\JavaSession\\src\\com\\assignment\\file\\io\\TestingTextFile");
			
			while((bit = inputBits.read()) != -1) {
				convert = (char) bit;
				System.out.print(convert);
			}
		}catch(IOException e) {
			
		}finally {
			
		}
		
	}

}

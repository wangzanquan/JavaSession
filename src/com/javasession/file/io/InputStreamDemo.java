package com.javasession.file.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;


public class InputStreamDemo {

	public static void main(String[] args) {

		InputStream is = null;
		int i;
		char c;
		//byte will convert values in to byte data type
		
		try {
			//new input stream created
			is = new FileInputStream("C:\\Users\\Yang\\Documents\\JavaSession\\JavaSession\\src\\com\\javasession\\file\\io\\SomeInputFile.txt");//Use path
			System.out.println("Characters printed: ");
			
			//reads till the end of the stream
			/*
			 *  -1 means the binery STOP
			 */
			while((i = is.read()) != -1) {
				//convers integer to character (read 0101001 <8 byte> and then convert to char)
				c = (char) i;
				
				//prints character
				System.out.print(c);
			}
		}catch(IOException e) {
			//if any I/O error occurs
			e.printStackTrace();
			System.out.println("An error occured");
		}finally {
			//releases system resources associated with this stream
			if(is != null) {
				try {
					is.close();
				}catch(Exception e) {
					e.printStackTrace();
					System.out.println("An error occured while closing the stream");
				}
			}
		}
		
		
	}
		
		
}



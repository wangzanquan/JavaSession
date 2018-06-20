package com.javasession.file.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileArrayDemo {
	
	static byte[] bytes;

	static void readFileArray(String fn) {
		File f = new File(fn);
		long length = f.length();
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream(f);
			int intLength = (int)length;
			
			bytes = new byte[intLength];
			fis.read(bytes);
			
		} catch (IOException e) {
			System.out.println("File is not found.");
		}finally {
			try {
				fis.close();
			} catch (Exception e2) {
				System.out.println("File pointer is still open.");
			}
		}
	}
	
	static void writeArrayToFile(String fn) {
		File f = new File(fn);
		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream(f);
			fos.write(bytes);
			
		} catch (IOException e) {
			System.err.println(e);
		}finally {
			try {
				fos.close();
			} catch (IOException e) {
				System.err.println(e);
			}
		}
	}
	
	public static void main(String[] args) {
		String fileName = "C:\\Users\\Yang\\Documents\\JavaSession\\JavaSession\\src\\com\\javasession\\file\\io\\javaIcon.png";
		readFileArray(fileName);
		
		//Write to another file
		String fileName2 = "C:\\Users\\Yang\\Documents\\JavaSession\\JavaSession\\src\\com\\javasession\\file\\io\\NewJavaIcon.png";
		writeArrayToFile(fileName2);
		
	}

}

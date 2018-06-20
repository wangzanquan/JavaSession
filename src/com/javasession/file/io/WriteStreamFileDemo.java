package com.javasession.file.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteStreamFileDemo {
	public static void main(String[] args) {
		BufferedWriter bw = null;
		try {
			
			String mycontent = "This is Java I/O Writer class.";
			
			/*
			 * Assignment: add the following line to the existed "myFile.txt" file
			 */
			String mycontentAdd = "Second Line";
			
			File file = new File("C:\\Users\\Yang\\Documents\\JavaSession\\JavaSession\\src\\com\\javasession\\file\\io\\myfile.txt");
			
			if(!file.exists()) {
				file.createNewFile();
			}
			
			FileWriter fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			
			bw.write(mycontent);
			System.out.println("File was written successfully!");
			
			
		} catch (IOException io) {
			System.out.println("Error while creating file");
			
		}finally {
			try {
				if(bw != null) {
					bw.close();
				}
			} catch (Exception e) {
				System.out.println("Error while closing the BW");
			}
			
		}
		
		
		
	}
}

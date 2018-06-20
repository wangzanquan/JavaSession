package com.javasession.file.io;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class PipedStreamExample {

	public static void main(String[] args) throws IOException, InterruptedException{
		
		final PipedInputStream pipedInputStream = new PipedInputStream();
		final PipedOutputStream pipedOutputSteram = new PipedOutputStream();
		
		//Connect pipe
		pipedInputStream.connect(pipedOutputSteram);

		Thread pipeWriter = new Thread(new Runnable(){
			
			@Override
			public void run() {
				for(int i = 65; i < 91; i ++) {
					try {
						pipedOutputSteram.write(i);
						
						//sleep method is the speed control method, 500 ms.
						Thread.sleep(500);
					} catch (IOException | InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
			
		});
		
		Thread pipeReader = new Thread(new Runnable(){
			
			@Override
			public void run() {
				for(int i = 65; i < 91; i ++) {
					try {
						System.out.println((char)pipedInputStream.read());
						Thread.sleep(1000);
					} catch (IOException | InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
			
		});
		
		pipeWriter.start();
		pipeReader.start();
		
		pipeWriter.join();
		pipeReader.join();
		
		pipedOutputSteram.close();
		pipedInputStream.close();
		
		
		
		
	}

}

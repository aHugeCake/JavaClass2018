package com.javasession.week_3.day3_File_IO_Reader_Writer_PipedStream_Thread;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class PipedStreamExample {

	/*
	 * Piped stream works on thread process
	 * 
	 * 		|--- Thread --> Process
	 * 	  --|
	 * 	  | |--- Theads --> +1 Read
	 * 	  |			|-----> +1 Write
	 * 	  |
	 * 	  |-----> streams = Unicode
	 * 
	 * A thread only does one thing --> one process
	 * 
	 * Multi-threads are prevented from conflicting by dead lock
	 * 
	 * 
	 * Thread A ---------> Thread B
	 * 	  |--> Thread A ends and then passes reserved output to Thread B
	 * 
	 */
	
	
	public static void main(String[] args) throws IOException, InterruptedException {
		final PipedInputStream pipedInputStream = new PipedInputStream();		//read
		final PipedOutputStream pipedOutputStream = new PipedOutputStream();		//write
		
		/* Connect pipe */
		pipedInputStream.connect(pipedOutputStream);	//read connect write
		
		//tell the thread to run something
		//Threads will not run when running the main method, we need to tell thread to start
		Thread pipeWriter = new Thread(new Runnable() {	//this is a writer thread, responsible for writing something,
			@Override
			public void run() {
				for(int i = 65; i < 91; i++) {		//A ~ Z
					try {
						pipedOutputStream.write(i);
						Thread.sleep(500); 	//5 milliseconds
					}catch(IOException | InterruptedException e) {
						e.printStackTrace();
					}
				
				}
			}
		});
		
		Thread pipeReader = new Thread(new Runnable() {	//this is a reader thread
			@Override
			public void run() {
				for(int i = 65; i < 91; i++) {		//A ~ Z
					try {
						System.out.print((char)pipedInputStream.read());
						Thread.sleep(1000); 	//The speed of the print on the console
					}catch(IOException | InterruptedException e) {
						e.printStackTrace();
					}
				
				}
			}
		});
		
		pipeWriter.start();
		pipeReader.start();
		
		pipeWriter.join();
		pipeReader.join();
		
		//We don't close the thread, but the stream.
		pipedInputStream.close();
		pipedOutputStream.close();
	}
}

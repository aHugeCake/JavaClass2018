package com.javasession.week_3.day3_File_IO_Reader_Writer_PipedStream_Thread;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteStreamFileDemo {
	
	/*
	 * Advantages of Buffer:
	 * 		|-- maintain the format of the file
	 * 		|-- read/write string
	 * 		|-- broader data to support
	 * 				|-- support special characters while FileWriters can only support certain things
	 * Disadvantages of BufferedWriter stream:
	 * 		|-- consume a lot of memory
	 */
	
	public static void main(String[] args) throws IOException {		
		BufferedWriter bw = null;
		
		try {
			String mycontent = "This is Java I/O writer class";
			File file = new File("myfile.txt");
			
			if(!file.exists()) {
				file.createNewFile();
			}
			
			FileWriter fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			bw.write(mycontent);
			System.out.println("file was written successfully");
		}
		catch(IOException e) {
			System.out.println("Error while creating file");
		}
		finally {
			try {
				if(bw != null)
					bw.close();
			}catch(Exception e2) {
				System.out.println("Error while closing the BufferedWriter");
			}
		}
		
	}
}

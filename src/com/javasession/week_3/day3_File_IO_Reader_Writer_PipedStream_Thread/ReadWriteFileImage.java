package com.javasession.week_3.day3_File_IO_Reader_Writer_PipedStream_Thread;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadWriteFileImage {
	
	/*
	 * Image Transform
	 * 	|--- Image Copy File
	 * 	|--- +1 Read Image
	 * 	|--- +1 Write Image
	 * 	|--- +1 Main
	 * 			 |--- File to Read
	 * 			 |--- File to Write
	 */
	
	/*
	 * Image:
	 * [00010000, 10100100,...
	 * .......................
	 * ...............00110101]
	 * 
	 */
	
	/*
	 * Extention of image, such as .png, should be lowercase
	 */
	
	
	static byte[] bytes;
	
	static void readFileArray(String fn) {
		File f = new File(fn);
		long length = f.length();
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream(f);
			//transform int part of length to bytes continuously, so we'll not lose the value
			int intLength = (int)length;
			bytes = new byte[intLength];
			
			
			fis.read(bytes);
			for(int ele:bytes) {
				System.out.println(ele);
			}
			
		} catch(IOException e) {
//			System.out.println("file not found");
		}
		finally {
			try {
				fis.close();
			} catch (IOException e) {
				System.out.println("file pointer is still open");
			}
		}
	}
	
	static void writeArrayToFile(String fn) {
		File f = new File(fn);
		FileOutputStream fos =null;
		
		try {
			fos = new FileOutputStream(f);
			fos.write(bytes);
		}catch(IOException e) {
			System.err.println(e);
		}
		finally {
			try {
				fos.close();
			} catch (IOException e) {
				System.err.println(e);
			}
		}
	}

	public static void main(String[] args) {
		String fileName = "src/cat.jpg";
		readFileArray(fileName);
		
		String newFileName = "src/cat_copy.jpg";
		writeArrayToFile(newFileName);
	}

}

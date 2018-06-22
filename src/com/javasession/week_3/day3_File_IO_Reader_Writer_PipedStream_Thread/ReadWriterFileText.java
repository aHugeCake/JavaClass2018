package com.javasession.week_3.day3_File_IO_Reader_Writer_PipedStream_Thread;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWriterFileText {

	static char[] chars;
	
	public static void main(String[] args) {
		String fileName = "Input.txt";
		readFileIntoArray(fileName);
		
		String newFileName = "src/Input_copy.txt";
		writeArrayToFile(newFileName);
	}
	
	static void readFileIntoArray(String fn) {
		File f = new File(fn);
		long length = f.length();
		FileReader fr = null;
		
		try {
			fr = new FileReader(f);
			int intLength = (int)length;
			chars = new char[intLength];
					
			fr.read(chars);
			
		} catch(IOException e) {
			System.err.println(e);
		}
		finally {
			try {
				fr.close();
			} catch (IOException e) {
				System.err.println(e);
			}
		}
		
	}
	
	static void writeArrayToFile(String fn) {
		File f = new File(fn);
		FileWriter fw =null;
		
		try {
			fw = new FileWriter(f);
			fw.write(chars);
		}catch(IOException e) {
			System.err.println(e);
		}
		finally {
			try {
				fw.close();
			} catch (IOException e) {
				System.err.println(e);
			}
		}
	}
}

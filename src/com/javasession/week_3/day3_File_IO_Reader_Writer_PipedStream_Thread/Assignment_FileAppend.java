package com.javasession.week_3.day3_File_IO_Reader_Writer_PipedStream_Thread;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Assignment_FileAppend {

	/*
	 * Assignment:
	 * 		append more content (strings) in the same file
	 */
	static char[] chars;
	
	public static void main(String[] args) throws IOException {
		BufferedWriter bw = null;
		BufferedReader br = null;
		
		String appendedContent = "BLABLABLABLA";
		
		File file = new File("src/attaches/Input.txt");
		if(!file.exists())
			file.createNewFile();
		
		long length = file.length();
		
		
		FileReader fr = new FileReader(file);		
		
		br = new BufferedReader(fr);
		
		String text = "";
		String temp = null;
		while((temp = br.readLine())!=null) {
			text += temp;
			text += "\r\n";
		}
		br.close();

		text += appendedContent;
		
		FileWriter fw = new FileWriter(file);
		bw = new BufferedWriter(fw);
		bw.write(text);
		
		System.out.println("The content is appended successfully.");
		
		if(bw != null)
			bw.close();
	}
}

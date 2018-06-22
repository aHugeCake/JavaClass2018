package com.javasession.week_3.day2_File_IO_Reader_Writer_File;

import java.io.File;

public class FileInfo {

	public static void main(String[] args) {
		File file = new File("Input.txt");

		System.out.println("This is the file size: " + file.length()); // bytes -->we can check the properties of the
																		// file
		System.out.println("This is the file name: " + file.getName());

		try {

			System.out.printf(file.getName() + " " + "File Path: " + file.getCanonicalPath());

		} catch (Exception e) {
			System.out.println("file error");
		}

	}
}

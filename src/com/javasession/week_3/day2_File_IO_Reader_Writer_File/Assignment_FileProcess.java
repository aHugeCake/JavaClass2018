package com.javasession.week_3.day2_File_IO_Reader_Writer_File;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Assignment_FileProcess {

	/*
	 * Assignment:
	 * 
	 * --> create File Class --> File Obj --> File size --> File name
	 * 
	 * ---------------------------
	 * 
	 * --> Check the file exists or not. If not, create the file --> File rename
	 * some other name --> File copy and creates new copy File --> File delete -->
	 * File read only --> Check the file if it's hidden file (return boolean)
	 *
	 */
	private File file;
	
	public Assignment_FileProcess(File filePath) {
		super();
		this.file = filePath;
	}

	public boolean checkExists(File file) {
		if (file.exists() && !file.isDirectory())
			return true;
		else
			return false;
	}

	public void rename(File file, String newName) {
		if (!file.exists()) {
//			File file1 = new File(newName);
//			try {
//				if(file.isDirectory()) {
//					file1.mkdir();
//				}else {
//					file1.createNewFile()
//				}
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			System.out.println("The file does not exist");
		} else {
			File file1 = new File(newName);
			file.renameTo(file1);
		}
	}

	public void copy(String oldPath, String newPath) {
		//txt
		FileWriter txtFile = null;
		PrintWriter outStream = null;
		
		//others
		FileOutputStream otherFile = null;
		DataOutputStream outputStream = null;

		InputStream fileStream = null;
		int val;
		char c;

		try {
			fileStream = new FileInputStream(oldPath);
			
			if(oldPath.endsWith(".txt")) {
				//FileWriter
				txtFile = new FileWriter(newPath);
				
				//PrintWriter
				outStream = new PrintWriter(txtFile);

				while ((val = fileStream.read()) != -1) {
					c = (char) val;
					String temp = Character.toString(c);
					outStream.print(temp);
				}
			}else {
				otherFile = new FileOutputStream(newPath);
				outputStream = new DataOutputStream(otherFile);
				while ((val = fileStream.read()) != -1) {
					c = (char) val;
					outputStream.write(c);
				}
				
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				txtFile.close();
				if (fileStream != null) {
					fileStream.close();
				}
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		}
	}

	public void delete(String path) {
		File file = new File(path);
		try {
			file.delete();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void readOnly(File file) {
		try {
			file.setReadOnly();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		if(file.canWrite()) {
			System.out.println("An error in setting the file read only.");
		}
	}
	
	public void writable(File file) {
		//writable − If true, allows the write access permission; if false, the write access permission is disallowed.
		file.setWritable(true);
	}
	
	//view/hide hidden file: Shift + Command + . 
//	public void setHidden(String path) {
//		//terminal: chflags hidden path(drag and drop) --> make file hidden
//		//terminal: chflags nohidden path(drag and drop) --> make file nohidden	
//		try {
//			Process p = Runtime.getRuntime().exec("attrib +H " + path);
//			p.waitFor();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//	}
	
	public boolean checkHidden(File file) {
		//can only hide file starts with "."
		return file.isHidden();
	}
	
	public static void main(String[] args) throws IOException {
		
		String filePath = "src/attaches/Input.txt";

		File file = new File(filePath);
		
		Assignment_FileProcess obj = new Assignment_FileProcess(file);
		
		if (!obj.checkExists(file)) {
			try {
//				file.mkdir();
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		// if(filePath.endsWith(".txt")) {
		// FileOutputStream fileContent = new FileOutputStream(filePath);
		// }else {
		// FileWriter fileContent = new FileWriter(filePath);
		// }
//		obj.rename(file, "Input.txt");
//		obj.copy(filePath, "src/CopyFile.jpg");
//		obj.delete("src/CopyFile.txt");
		obj.writable(file);
//		System.out.println(obj.checkHidden(file));
//		obj.readOnly(file);
	}
}

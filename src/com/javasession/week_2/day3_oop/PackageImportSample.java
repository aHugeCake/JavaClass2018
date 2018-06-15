//package -- the group of classes and particular folders
package com.javasession.week_2.day3_oop;
import java.util.Scanner;

//import all the classes from the memory load of this package
//import java.util.*;

//import a class from another package
import com.javasession.week_2.day1_tryandcatch.TryCatchBlock;

public class PackageImportSample {
	public static void main(String[] args) {
		//There is a way not to import --> com.javasession.week_2.day1_tryandcatch.TryCatchBlock tc = new TryCatchBlock(); ???
		TryCatchBlock tc = new TryCatchBlock();
		//In the note, it shows: Import 'Scanner'(java.util) --> java.util is package name
		Scanner scan = new Scanner(System.in);
	}
}


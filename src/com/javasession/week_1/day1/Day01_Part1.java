/*
 * Download:
 * 1. Java SE Development Kit 10.0.1
 * 2. Eclipse IDE for Java EE Developers (Eclipse for Java SE is necessary or there will be no JRE System Library)
 * 
 * To check Java version:
 * 	Terminal:
 * 		java - version
 * 
 */



/*
 * To change theme of Eclipse:
 * 		Eclipse - Help - Eclipse Marketplace
 * 
 */



/*
 * Show views:
 * 		Eclipse --> Window --> Show View
 * 
 */

/*
 * Run:
 * 		Eclipse --> Run --> Run As --> 1 Java Application
 * 
 */



/*
 * Error with red underline of line No, --> save the project
 * 
 */



/*
 * Input '/*'
 * Returns "/*
 * 			 *
 * 			 *\/" 
 * automatically
 */


//Java Project/src --> new --> package (with company domain, name with lowercase initial)
package com.javasession.week_1.day1;  //files: src/com/company/dayOne/

//Scanner doesn't belong to java.base, so we should import java.util.Scanner
//import the address of the class (where the class belongs to)
import java.util.Scanner;

//package --> new --> Class (name with uppercase initial)
public class Day01_Part1 {

	public static void main(String [] args) {
		
		//System is a class, out.println is a method of System
		System.out.println(1);
		System.out.println("Two");
		System.out.println('t');
		System.out.println(4);
				
		// DayOneParTwo is a class and the instance dayOne's name has lowercase initial
		Day01_Part2 dayOne = new Day01_Part2();
		dayOne.getAll();
		dayOne.getOne();
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the name: ");
		
		//String is a class (class name begins with uppercase initial)
		//Command + Mouse over 'String' --> open declaration --> String.class
		String str = scan.nextLine(); //Scanner.nextLine() returns a string
		
		scan.close();
		
		System.out.println("The name that you entered: " + str);
		
	}
	
	/*
	 * Three types of variable:
	 * 1. Local Variable
	 * 2. Static/Class Variable
	 * 3. Instance Variable
	 * 	 
	 */
	
	
}



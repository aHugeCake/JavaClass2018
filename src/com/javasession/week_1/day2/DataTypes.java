package com.javasession.week_1.day2;




//class/method not public?





public class DataTypes {
	
	public static void main(String[] args) {
		//Java Operators
		/*
		 * 1. basic arithmetic
		 * 2.Assignment
		 * 3.Auto-increment
		 * 4.Logical
		 * 5.Comparison
		 * 6.Ternary
		 */
		
		//1.Basic arithmetic
		// +, -, / and / and %
		
		int num1 = 100;
		int num2 = 20;
		
		System.out.println("num1 + num2: " + (num1 + num2));
		System.out.println("num1 - num2: " + (num1 - num2));
		System.out.println("num1 * num2: " + (num1 * num2));
		System.out.println("num1 / num2: " + (num1 / num2));
		System.out.println("num1 % num2: " + (num1 % num2));
		
		
		//Assignment Variables
		// =, +=, -=, *=, /= and %=		
		
		num2 = num1;
		System.out.println(num2);
		
		num2 += num1;
		System.out.println(num2);
		
		num2 -= num1;
		System.out.println(num2);
		
		num2 *= num1;
		System.out.println(num2);
		
		num2 /= num1;
		System.out.println(num2);
		
		num2 %= num1;
		System.out.println(num2);
		
		//Auto Increment and Auto Decrement
		int number = 1;
		System.out.println(number++); //number increments after execution
		System.out.println(++number); //number increments before execution
		
		int num = 1;
		System.out.println("Logical" + num--);
		System.out.println(num);
		
		//Logical Operators
		// &&, ||, !
		
		boolean b1 = true;
		boolean b2 = false;
		
		System.out.println(b1 && b2);
		System.out.println(b1 || b2);
		System.out.println(!(b1 && b2));
		
	}

	
}

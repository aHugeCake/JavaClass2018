package com.javasession.week_2.day3_OtherTopics;

public class GarbageCollection {

	public static void main(String[] args) {
		GarbageCollection je = new GarbageCollection();
		//If a variable is null, it doesn't point to any value in the stack
		je = null;
		
		GarbageCollection a = new GarbageCollection();
		GarbageCollection b = new GarbageCollection();
		
		b = a;
		
		//garbage collection --> a system class
		//clean the memory after the process stops
		//terminate from the stack
		System.gc();
		//Garbage collection from JVM --> a
		//Garbage collection from JVM --> b
		
	}
	
	//This method is called from garbage collection
	protected void finalize() throws Throwable{
		System.out.println("Garbage collection from JVM"); //This message will show when garbage collection
	}
}

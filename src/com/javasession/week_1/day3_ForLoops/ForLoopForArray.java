package com.javasession.week_1.day3_ForLoops;

public class ForLoopForArray {

	public static void main(String[] args) {
		
		//array itself is not a collection because it has fixed length.
		//array can be initialized in any data type
		
		//int[] n = {23, 34, 45};
		//String[] str = {"Test", "test1", "test2"};
		
		//int[] arr
		//int arr[]
		
		int arr[] = {2, 11, 45, 9};
		
		//For loop
		for(int i=0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		//For each loop (Enhanced for loop)
		//Only is supported in Array and Collection
		//; is an end of a statement, but (int num: arr) is not the end of a statement
		for(int num: arr) {
			System.out.println(num);
		}

	}
}

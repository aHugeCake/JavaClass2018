package com.javasession.week_3.day5_List_ArrayList;

import java.util.ArrayList;

public class SubListOfArrayList {

	public static void main(String[] args)
	{
		ArrayList<String> al = new ArrayList<>();
		
		al.add("Steve");
		al.add("Justin");
		al.add("John");
		al.add("Roger");
		al.add("Mike");
		al.add("Jim");
		
		ArrayList<String> al2 = new ArrayList<>(al.subList(1, 6));	//The list of the list
		
		System.out.println(al2);
		
	}
}

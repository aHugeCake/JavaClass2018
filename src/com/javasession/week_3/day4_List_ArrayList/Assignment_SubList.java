package com.javasession.week_3.day4_List_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Assignment_SubList {
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("Text 1");
		list.add("Text 2");
		list.add("Text 3");
		list.add("Text 4");
		list.add("Text 5");
		
		System.out.println(list);
		
		List<String> subList = list.subList(1, 3);
		System.out.println(subList);	//[FromIndex, ToIndex)
	}
	
	
	
}

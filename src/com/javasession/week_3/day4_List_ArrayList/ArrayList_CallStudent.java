package com.javasession.week_3.day4_List_ArrayList;

import java.util.ArrayList;

public class ArrayList_CallStudent extends ArrayList_Student{

	public ArrayList_CallStudent(String stuName, int rollNo, int stuAge) {
		super(stuName, rollNo, stuAge);
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		sampleTestForPOJO();
	}
	
	public static void sampleTestForPOJO() {
		
		//Set<ArrayList_Student> arrayList = new HashSet<ArrayList_Student>();
		//Queue<ArrayList_Student> arrayList = new PriorityQueue<ArrayList_Student>();
		ArrayList<ArrayList_Student> arrayList = new ArrayList<ArrayList_Student>();
		arrayList.add(new ArrayList_Student("Mike",11,23));
		arrayList.add(new ArrayList_Student("Peter", 23, 34));
		arrayList.add(new ArrayList_Student("Dave", 12, 32));
		
		System.out.println(arrayList);
	}
	
}

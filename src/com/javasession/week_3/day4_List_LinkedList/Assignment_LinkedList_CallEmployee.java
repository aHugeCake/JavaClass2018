package com.javasession.week_3.day4_List_LinkedList;

import java.util.LinkedList;

public class Assignment_LinkedList_CallEmployee extends Assignment_LinkedList_EmployeePOJO{

	public Assignment_LinkedList_CallEmployee(int cardId, String name, int age, String job, int salary) {
		super(cardId, name, age, job, salary);
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		employeeInfo();
	}
	
	public static void employeeInfo() {
		LinkedList<Assignment_LinkedList_EmployeePOJO> employees = new LinkedList<>();
		employees.add(new Assignment_LinkedList_EmployeePOJO(0001, "Mike", 34, "Web Developer", 100));
		employees.add(new Assignment_LinkedList_EmployeePOJO(0002, "David", 32, "Java Developer", 300));
		employees.add(new Assignment_LinkedList_EmployeePOJO(0003, "Tom", 24, "Javascript Developer", 200));
		
		for(Assignment_LinkedList_EmployeePOJO ele: employees) {
			System.out.println(ele);
		}
	}

}

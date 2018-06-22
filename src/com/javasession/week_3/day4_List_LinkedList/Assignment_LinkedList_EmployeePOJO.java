package com.javasession.week_3.day4_List_LinkedList;

public class Assignment_LinkedList_EmployeePOJO {
	
	private int cardId;
	private String name;
	private int age;
	private String job;
	private int salary;
	
	public Assignment_LinkedList_EmployeePOJO(int cardId, String name, int age, String job, int salary) {
		super();
		this.cardId = cardId;
		this.name = name;
		this.age = age;
		this.job = job;
		this.salary = salary;
	}

	public int getCardId() {
		return cardId;
	}

	public void setCardId(int cardId) {
		this.cardId = cardId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [cardId=" + cardId + ", name=" + name + ", age=" + age + ", job=" + job
				+ ", salary=" + salary + "]";
	}
	
}

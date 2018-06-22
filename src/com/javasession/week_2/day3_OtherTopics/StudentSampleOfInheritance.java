package com.javasession.week_2.day3_OtherTopics;

public class StudentSampleOfInheritance extends Dept{
	String mainSub = "Math";
	public static void main(String[] args) {
		StudentSampleOfInheritance dp = new StudentSampleOfInheritance();
		System.out.println(dp.designation);
		System.out.println(dp.nameOfDept);
		System.out.println(dp.mainSub);
	}
}

class Dept{
	String designation = "tutor";
	String nameOfDept = "Tech";
	void does() {
		System.out.println("teaching");
	}
}

package com.javasession.week_3.day4_List_ArrayList;

/*
 * POJO (Plain Old Java Object): In software engineering, a Plain Old Java Object (POJO) is an ordinary Java object, not bound by any special restriction and not requiring any class path.
 * 
 * JavaBeans:
 * A JavaBean is a POJO that is serializable, has a no-argument constructor, and allows access to properties using getter and setter methods that follow a simple naming convention. Because of this convention, simple declarative references can be made to the properties of arbitrary JavaBeans. Code using such a declarative reference does not have to know anything about the type of the bean, and the bean can be used with many frameworks without these frameworks having to know the exact type of the bean. 
 *  
 */

//create our own class when we need different data types in one list
public class ArrayList_Student {

	private String stuName;
	private int rollNo;
	private int stuAge;
	
	public ArrayList_Student(String stuName, int rollNo, int stuAge) {
		super();		// this class is parent class
					// It's ok to delete super() in constructor
		this.stuName = stuName;
		this.rollNo = rollNo;
		this.stuAge = stuAge;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public int getStuAge() {
		return stuAge;
	}

	public void setStuAge(int stuAge) {
		this.stuAge = stuAge;
	}

//	@Override
//	public String toString() {
//		return "Student [stuName=" + stuName + ", rollNo=" + rollNo + ", stuAge=" + stuAge + "]";
//	};
	
	
	
	
}

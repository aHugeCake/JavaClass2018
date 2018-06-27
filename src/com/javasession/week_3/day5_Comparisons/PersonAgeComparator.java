package com.javasession.week_3.day5_Comparisons;

import java.util.Comparator;

public class PersonAgeComparator implements Comparator<Person>{
	@Override
	public int compare(Person p1, Person p2) {
		if(p1.auAge == p2.auAge)
			return 0;
		else if(p1.auAge > p2.auAge)
			return 1;
		else
			return -1;
	}
}

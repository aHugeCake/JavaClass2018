package com.javasession.week_2.day2_oop;

import com.javasession.week_2.day3_oop.AccessModifier;

//After extend Class AccessModifier, AccessModifierSampleInAnotherPackage is a subclass of AccessModier
public class AccessModifierSampleInAnotherPackage extends AccessModifier{

	
	public static void main(String[] args) {
		
		AccessModifier st = new AccessModifier();
		//We can only see public methods of st
		
		//Even extend the class, we can only see public classes
		
	}
}

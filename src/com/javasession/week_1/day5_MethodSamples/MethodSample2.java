package com.javasession.week_1.day5_MethodSamples;

public class MethodSample2 {
	
	// *Note: Most developers don't have more than 5 methods in one class
	public static void main(String[] args) {
		
		//System.out.println(getSumOfAmount(4, 7));
		getSumOfAmount(5.99,8, "Test");  //13
		//getSum(34, getSumOfAmount(12, 34, null));  //46 80
		getSum(34, getSumOfAmount(12, 34, null));   //46 36
	}
	
	//public: this method can be used in every class
	//static: this method can be used without initialization
	//method name: begins with lower case capital
	//If the parameter isn't used in the method, the parameter will be given default value
	//signature of a method: method name and parameters (overwrite & override). Developers of other class cannot change the signature of the method of other classes
	public static int getSumOfAmount(double num1, int num2, String str) {
		
		int sum = (int) (num1 + num2);   //down casting
		System.out.println(sum);
		return 1+1;  //it can works
		//return sum;
	}
	
	
	public static void getSum(int num3, int num4) {
		int sumOfNum = num3 + num4;
		System.out.println(sumOfNum);
	}
	
}

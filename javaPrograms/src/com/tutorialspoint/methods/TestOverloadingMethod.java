package com.tutorialspoint.methods;

public class TestOverloadingMethod {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Overloading Methods:
		double doubleResult = max(7.5, 7.6);
		System.out.println("Overloading Methods: Maximum double number is "+doubleResult);
		
		//Overloading Methods: with int
		int intResult = max(7, 6);
		System.out.println("Overloading Methods: Maximum int number is "+intResult);
	}
	//Overloading Methods: with double
	public static double max(double num1, double num2){
		if(num1 > num2){
			return num1;
		}else{
			return num2;
		}
		
	}
	//Overloading Methods: with int
	public static int max(int num1, int num2){
		if(num1 > num2){
			return num1;
		}else{
			return num2;
		}
	}
}

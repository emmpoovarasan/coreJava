package com.tutorialspoint.methods;

public class TestMax {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10;
		int j = 20;
		int k = max(i, j);
		System.out.println("The maximum between " + i +
                " and " + j + " is " + k);

	}
	/** Return the max between two numbers */
	public static int max(int num1, int num2){
		int result;
		if(num1 > num2){
			result = num1;
		}else{
			result = num2;
		}
		return result;
	}
}

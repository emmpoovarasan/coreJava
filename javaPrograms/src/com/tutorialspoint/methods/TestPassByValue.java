package com.tutorialspoint.methods;

public class TestPassByValue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 1;
	    int num2 = 2;

	    System.out.println("Before swap method, num1 is " +
	                          num1 + " and num2 is " + num2);
	    // Invoke the swap method
	    swap(num1, num2);
	    System.out.println("After swap method, num1 is " +
                num1 + " and num2 is " + num2);

	}
	/** Method to swap two variables */
	public static void swap (int n1, int n2){
		System.out.println("\tInside the swap method");
	    System.out.println("\t\tBefore swapping n1 is " + n1
	                           + " n2 is " + n2);
	    // Swap n1 with n2
	    int temp = n1;
	    n1 = n2;
	    n2 = temp;
	    System.out.println("\t\tAfter swapping n1 is " + n1
                + " n2 is " + n2);
	      
	}
}

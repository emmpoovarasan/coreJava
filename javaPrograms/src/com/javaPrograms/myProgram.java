package com.javaPrograms;

public class myProgram {
	public static void main (String[] args){
		//---------------------------------------------//
		// here's our method call that returns a value //
		Integer resultOfAddition = addTheseTwoNumbers1(5,24);
		//---------------------------------------------//
		System.out.println(resultOfAddition);
		//----------------------------------------------------//
		// here's our method call that doesn't return a value //
		addTheseTwoNumbers2(3,13);
		
	}
	private static Integer addTheseTwoNumbers1(Integer firstNumber, Integer secondNumber){
		return firstNumber + secondNumber;
	}
	
	public static void addTheseTwoNumbers2(Integer firstNumber, Integer secondNumber){
		Integer addedValue = firstNumber + secondNumber;
		System.out.println(addedValue);
	}
	
}

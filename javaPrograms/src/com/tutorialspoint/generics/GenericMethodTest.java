package com.tutorialspoint.generics;

public class GenericMethodTest {
	// generic method printArray
	public static <E> void printArray( E[] inputArray){ 
		// Display array elements
		for(E element : inputArray){
			//System.out.printf("%s "+element);
			System.out.printf("%s ",element);
		}
		System.out.println();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create arrays of Integer, Double and Character
		Integer[] intArray = {1,2,3,4,5};
		Double[] doubleArray = {1.1,2.2,3.3,4.4,5.5};
		Character[] characterArray = {'H','E','L','L','O'};
		String[] stringArray ={"ABDC","EFGH"};
		
		System.out.println( "Array integerArray contains:" );
		printArray(intArray);// pass an Integer array
		
		System.out.println( "\nArray doubleArray contains:" );
		printArray(doubleArray);// pass a Double array
		
		System.out.println( "\nArray characterArray contains:" );
		printArray(characterArray);// pass a Character array
		
		System.out.println( "\nArray stringArray contains:" );
		printArray(stringArray);// pass a String array
		

	}

}

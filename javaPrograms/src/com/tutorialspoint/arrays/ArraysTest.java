package com.tutorialspoint.arrays;

public class ArraysTest {
		//Passing Arrays to Methods:
		public static void printArray(double[] array){
			for(int i=0; i<array.length;i++){
				System.out.println("Passing Arrays to Methods:"+array[i]);
			}
		}
		
		//Returning an Array from a Method:
		
		public static double[] reverse(double[] list){
			double[] result = new double[list.length];
			
			for(int i=0, j = result.length-1; i < list.length; i++, j--){
				result[j] = list[i];
				//System.out.println("Testing"+result[j]);
			}
			return result;
		}
		
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] myList = {1.9, 2.9, 3.9, 7.9, 5.9, 6.9,4.9};
		// Print all the array elements
		for(int x = 0; x < myList.length; x++){
			System.out.println("myList["+x+"] is "+myList[x]);
		}
		// Summing all elements
		double total = 0;
		for(int y=0; y < myList.length; y++){
			total = total + myList[y];
		}
		System.out.println("Summing all elements is : "+total);
		
		// Finding the largest element
		double max = myList[0];
		for(int i = 0; i < myList.length; i++){
			if(myList[i] > max){
				max = myList[i];
			}
		}
		System.out.println("Finding the largest element"+max);
		
		// Print all the array elements using enhanced for loop
		
		for(double element : myList){
			System.out.println("Enhanced for loop : " + element);
		}
		
		//call Passing Arrays to Method:
		printArray(myList);
		
		//call Returning an Array from a Method:
		//System.out.println("call Returning an Array from a Method: "+reverse(myList));
		double[] myList1 = reverse(myList);
		for(double myElement : myList1){
			System.out.println("call Returning an Array from a Method: "+myElement);
		}
		
	}

}

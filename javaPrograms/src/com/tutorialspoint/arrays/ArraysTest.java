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
		
		public static boolean equals(double[] a, double[] b){
			boolean result = false;
			if(a.length == b.length){
				System.out.println("Both Arrays are equals a[i] == b[j] = a["+a.length+"],b["+b.length+"]");
				result = true;
				if(a.length == b.length){
					for(int i = 0, j = 0; i < a.length; i++, j++){
						if (a[i] == b[j]){ 
							System.out.println("Values are equal for both Arrays a[i] == b[j] = a["+a[i]+"],b["+b[j]+"]");
							result = true;
						}else{
							System.out.println("Values are not equal for both Arrays a[i] != b[j] = a["+a[i]+"],b["+b[j]+"]");
							result = false;
						}
					}
				}
			}else{
				System.out.println("Values are not equal for both Arrays a[i] != b[j] = a["+a.length+"],b["+b.length+"]");
				result = false;
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
		
		// check equals method using overloading
		double[] myList2 = {1.3,1.4,1.5,2.0};
		System.out.println(equals(myList, myList2));
		
	}
}
/*
 SN	Methods with Description
1	public static int binarySearch(Object[] a, Object key)
Searches the specified array of Object ( Byte, Int , double etc) for the specified value using the binary search algorithm. The array must be sorted prior to making this call. This returns index of the search key, if it is contained in the list; otherwise, (-(insertion point + 1).
2	public static boolean equals(long[] a, long[] a2)
Returns true if the two specified arrays of longs are equal to one another. Two arrays are considered equal if both arrays contain the same number of elements, and all corresponding pairs of elements in the two arrays are equal. This returns true if the two arrays are equal. Same method could be used by all other premitive data types ( Byte, short, Int etc.)
3	public static void fill(int[] a, int val)
Assigns the specified int value to each element of the specified array of ints. Same method could be used by all other premitive data types ( Byte, short, Int etc.)
4	public static void sort(Object[] a)
Sorts the specified array of objects into ascending order, according to the natural ordering of its elements. Same method could be used by all other premitive data types ( Byte, short, Int etc.) 
*/
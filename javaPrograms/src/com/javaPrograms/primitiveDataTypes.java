package com.javaPrograms;
/**
 * @author POO
 *
 */
public class primitiveDataTypes {
	private static int aInt;
	private static Integer anotherInt;
	private static int aPrimitiveInteger=32;
	
	public static void main (String[] args){
		System.out.println(aInt);
		System.out.println(anotherInt);
		System.out.println(aPrimitiveInteger);
		Integer myAreaCode=416;
		Integer myPhoneNumber=87987654;
		displayPhoneNumber(myAreaCode.toString(),myPhoneNumber.toString());
	}
	
	public static void displayPhoneNumber(String areaCode, String phoneNumber){
		System.out.println("("+areaCode+") "+phoneNumber);
	}
}

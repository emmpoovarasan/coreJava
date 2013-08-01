package com.tutorialspoint.strings;

import com.javaPrograms.interfaceVehicle;

public class StringsTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String greetings = "Hello world!.";
		System.out.println("greetings variable is : "+greetings);
		
		// char[] arrays
		char[] helloArray = {'h','e','l','l','o'};
		String helloArrayString = new String(helloArray);
		System.out.println("After convert char[] to String is : "+helloArrayString);
		
		StringBuffer sb = new StringBuffer(greetings);
		System.out.println("StringBuffer of greetings variable is "+sb);
		
		int len = greetings.length();
		System.out.println("Length of the '"+greetings+"' is "+len);
		
		System.out.println("String concatinating is : "+helloArrayString.concat(greetings)+ " or Testing ".concat("Concatination"));
		float floatVar = 10;
		int intVar = 5;
		String stringVar = "testing";
		System.out.printf("String format output : "+"The value of the float variable is " +
                  "%f, while the value of the integer " +
                  "variable is %d, and the string " +
                  "is %s", floatVar, intVar, stringVar);
		System.out.println();
		String fs;
		fs = String.format("The value of the float variable is " +
                  "%f, while the value of the integer " +
                  "variable is %d, and the string " +
                  "is %s", floatVar, intVar, stringVar);
		System.out.println("String format output : "+fs);
		
		System.out.println(stringVar+" {stringVar.charAt(stringVar.length()-3)} : "+stringVar.charAt(stringVar.length()-5));
		System.out.println("greetings.compareTo(helloArrayString) : "+greetings+"/"+helloArrayString+" : "+greetings.compareTo(helloArrayString));
		System.out.println("greetings.compareTo(helloArray) : "+greetings+"/"+helloArray+" : "+greetings.compareTo(helloArray.toString()));
		System.out.println("greetings.compareToIgnoreCase(helloArrayString) : "+greetings.compareToIgnoreCase(helloArrayString));
		System.out.println("stringVar.contentEquals(sb) : "+stringVar.contentEquals(sb));
		System.out.println("helloArrayString.copyValueOf(helloArray,1,helloArray.length-1) : "+helloArrayString.copyValueOf(helloArray,1,helloArray.length-1));
		String greetings1 = "ld!.";
		System.out.println("greetings.endsWith(greetings1) : "+greetings.endsWith(greetings1));
		System.out.println("helloArrayString.matches(greetings) : "+helloArrayString.matches(greetings));
		System.out.println("greetings.replace(\"!\", \"@\") : "+greetings.replace("!", "@"));
		System.out.println("greetings.replaceAll(\"world!.\", \"testing@\") : "+greetings.replaceAll("world!.", "testing@"));
	}

}

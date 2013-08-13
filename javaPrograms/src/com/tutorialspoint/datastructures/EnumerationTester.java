package com.tutorialspoint.datastructures;

import java.util.Vector;
import java.util.Enumeration;

public class EnumerationTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Enumeration days;
		Enumeration days1;
		Vector dayNames = new Vector();
		Vector dayNames1 = new Vector();
		dayNames.add("Sunday");
		dayNames.add("Monday");
		dayNames.add("Tuesday");
		dayNames.add("Wednesday");
		dayNames.add("Thursday");
		dayNames.add("Friday");
		dayNames.add("Saturday");
		
		// add all 
		dayNames1.addAll(dayNames);
		
		days = dayNames.elements();
		days1 = dayNames1.elements();
		
		System.out.println();
		while(days.hasMoreElements()){
			System.out.print(days.nextElement()+" ");
		}
		System.out.println();
		System.out.println("Using AddAll keyword");
		while(days1.hasMoreElements()){
			System.out.print(days1.nextElement());
		}
		System.out.println();
		System.out.println("end of AddAll keyword");

	}

}

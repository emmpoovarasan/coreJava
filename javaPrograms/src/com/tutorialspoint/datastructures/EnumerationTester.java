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
		Vector dayNames = new Vector();
		dayNames.add("Sunday");
		dayNames.add("Monday");
		dayNames.add("Tuesday");
		dayNames.add("Wednesday");
		dayNames.add("Thursday");
		dayNames.add("Friday");
		dayNames.add("Saturday");
		
		days = dayNames.elements();
		
		while(days.hasMoreElements()){
			System.out.println(days.nextElement());
		}
	}

}

package com.tutorialspoint.datastructures;

import java.util.*;

public class PropDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// using PROPERTIES , SET & ITERATORS
		Properties capitals = new Properties();
		Set states;
		String str;
		
		capitals.put("Illinois", "Springfield");
		capitals.put("Missouri", "Jefferson City");
	    capitals.put("Washington", "Olympia");
	    capitals.put("California", "Sacramento");
	    capitals.put("Indiana", "Indianapolis");
	    
	    // Show all states and capitals in hashtable.
	    states = capitals.keySet();// get set-view of keys
	    // using iterator
	    Iterator itr = states.iterator();
	    while(itr.hasNext()){
	    	str = (String) itr.next();
	    	System.out.println("The capital of "+ str
	    			+ " is "+ capitals.getProperty(str)+".");
	    }
	    System.out.println();
	    
	    
	    // look for state not in list -- specify default
	    str = capitals.getProperty("Florida", "Not Found");
	    System.out.println("The capital of the Florida is "+str);
	    
	    // using PROPERTIES & ENUMERATION
	    Properties capitalsofdistict = new Properties();
	    Enumeration districtEnum;
	    String str1;
	    
	    capitalsofdistict.put("KRISHNAGIRI", "KRISHNAGIRI");
	    capitalsofdistict.put("DHARMAPURI", "DHARMAPURI");
	    capitalsofdistict.put("VELLUR", "VELLUR");
	    capitalsofdistict.put("SALEM", "SALEM");
	    capitalsofdistict.put("COIMBATORE", "COIMBATORE");
	    capitalsofdistict.put("ERODE", "ERODE");
	    capitalsofdistict.setProperty("ERODE", "BHAVANI");
	    
	    
	    districtEnum = capitalsofdistict.keys();
	    
	    while(districtEnum.hasMoreElements()){
	    	str1 = (String) districtEnum.nextElement();
	    	System.out.println("District name is "+str1
	    			+" and captial is "+capitalsofdistict.getProperty(str1).toLowerCase());
	    }

	}

}

package com.tutorialspoint.datastructures;

import java.util.HashMap;
import java.util.Map;

public class CollectionsDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//The Dictionary class is obsolete. You should implement the Map interface to obtain key/value storage functionality.
		
		// using put keyword 
		Map m1 = new HashMap();
		m1.put("Zara", "8");
	    m1.put("Mahnaz", "31");
	    m1.put("Ayan", "12");
	    m1.put("Daisy", "14");
	    System.out.println();
	    System.out.println("using put keyword Map Elements");
	    System.out.print("\t" + m1);
	    System.out.println();
	    
	    
	    // using putAll keyword
	    Map m2 = new HashMap();
	    m2.putAll(m1);
	    
	    System.out.println();
	    System.out.println("using putAll keyword Map Elements of m2");
	    System.out.print("\t" + m2);
	    System.out.println();

	}

}

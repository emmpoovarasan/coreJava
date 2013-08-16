package com.tutorialspoint.collections;

import java.util.*;

public class TreeMapDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a hash map
		
		TreeMap tm = new TreeMap();
		// Put elements to the map
		tm.put("Zara", new Double(3434.34));
		tm.put("Mahnaz", new Double(123.22));
	    tm.put("Ayan", new Double(1378.00));
	    tm.put("Daisy", new Double(99.22));
	    tm.put("Qadir", new Double(-19.08));
	    
	    // Get a set of the entries
	    Set st = tm.entrySet();
	    // Get an Iterator
	    Iterator itr = st.iterator();
	    // Display elements
	    while(itr.hasNext()){
	    	Map.Entry me = (Map.Entry) itr.next();
	    	System.out.println(me.getKey()+": "+me.getValue());
	    }
	    
	    // Deposit 1000 into Qadir's account
	    double balance = ((Double) tm.get("Qadir")).doubleValue();
	    tm.put("Qadir", new Double(1000+balance));
	    System.out.println("Qadir's new balance: "+tm.get("Qadir"));

	}

}

package com.tutorialspoint.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Map m = new HashMap();
		 m.put("A", 65);
		 m.put("B", 66);
		 m.put("C", 67);
		 m.put("D", 68);
		
		// Create a hashmap
		HashMap hm = new HashMap();
		// put elements to hashmap
		hm.put("Zara", new Double(3434.34));
		hm.put("Tara", new Double(123.22));
		hm.put("Ayan", new Double(1378.00));
		hm.put("Sura", new Double(99.22));
		hm.put("Zen", new Double(-19.08));
		hm.putAll(m);
		
		System.out.println("Hashmap elemets :\t"+hm);
		
		// Get a Set of the entries
		Set s = hm.entrySet();
		// Get an iterator
		Iterator itr = s.iterator();
		// display elements
		while(itr.hasNext()){
			Map.Entry me = (Map.Entry) itr.next();
			System.out.println(me.getKey()+":\t"+me.getValue());
		}
		//Deposit 1000 into Zara's account
		double balance = ((Double) hm.get("Zen")).doubleValue();
		hm.put("Zen", new Double(1000+balance));
		System.out.println("Zen's new balance: "+hm.get("Zen"));
	}

}

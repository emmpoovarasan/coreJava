package com.tutorialspoint.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionsDemo {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List a1 = new ArrayList();
		a1.add("Zara");
		a1.add("Mahnaz");
		a1.add("Ayan");
		a1.add("Sura");
		a1.add(2, "insert at middle");
		System.out.println("Arraylist elements :");
		System.out.println("\t"+a1+" Length of "+a1.toArray().length);
		
		List a2 = new ArrayList();
		a2.add("One");
		a2.add("Two");
		a2.add("Three");
		a2.add("Five");
		a2.add(3, "Four");
		a2.addAll(a1);
		System.out.println("Arraylist elements with adding another collection :");
		System.out.println("\t"+a2+" Length of "+a2.toArray().length);
		
		List a3 = new ArrayList();
		a3.add("A");
		a3.add("B");
		a3.add("C");
		a3.add("E");
		a3.add(3, "D");
		a3.addAll(1, a2);
		System.out.println("Arraylist elemets with adding another collection with specified index :");
		System.out.println("\t"+a3+" Length of "+a3.toArray().length);
		System.out.println(a3.contains("A")); // contain specific element
		System.out.println(a3.containsAll(a1)); // contain specific object
		System.out.println(a1.remove(0));// remove index
		System.out.println(a2.remove("Two")); // remove object
		System.out.println(a3.removeAll(a2)); // remove collection
		System.out.println(a2.retainAll(a1)); // retain collection 
		System.out.println(a1+"\n"+a2+"\n"+a3);
		
		List l1 = new LinkedList();
		l1.add("Zara");
	    l1.add("Mahnaz");
	    l1.add("Ayan");
	    System.out.println("Linked list elements: \t"+l1);
	    
	    Set s1 = new HashSet();
	    s1.add("Set Zara");
	    s1.addAll(a2);
	    s1.addAll(a3);
	    System.out.println("Set elements :\t"+s1);
	    
	    
	    Map m = new HashMap();
	    m.put("A", 65);
	    m.put("B", 66);
	    m.put("C", 67);
	    m.put("D", 68);
	    System.out.println("Map elements :\t"+m);
	    
	    Map m1 = new HashMap();
	    m1.put("Zara", "13");
	    m1.put("Mahnaz", "31");
	    m1.put("Ayan", "12");
	    m1.put("Daisy", "14");
	    m1.putAll(m);
	    
	    System.out.println("Map Elements :\t"+m1);
	    System.out.println();
	    

	}

}

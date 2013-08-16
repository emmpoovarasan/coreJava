package com.tutorialspoint.collections;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create the sorted set
		SortedSet s = new TreeSet();
		// Adding element to set
		s.add("b");
		s.add("a");
		s.add("d");
		s.add("c");
		
		// Iterating over the elements in the set
		Iterator i = s.iterator();
		while(i.hasNext()){
			// Get element
			Object element = i.next();
			System.out.println(element.toString());
		}
		
	}

}

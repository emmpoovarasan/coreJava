package com.tutorialspoint.collections;

import java.util.*;

public class HashSetDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a hash set
		LinkedHashSet hs = new LinkedHashSet();
		// add elements to the hash set
		hs.add("A");
		hs.add("B");
		hs.add("C");
		hs.add("D");
		hs.add("E");
		hs.add("F");
		System.out.println("\t"+hs);
	}

}

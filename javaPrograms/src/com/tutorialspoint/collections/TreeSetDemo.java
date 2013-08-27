package com.tutorialspoint.collections;

import java.util.TreeSet;

public class TreeSetDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a tree set
	      TreeSet ts = new TreeSet();
	      // Add elements to the tree set
	      ts.add("C");
	      ts.add("A");
	      ts.add("B");
	      ts.add("E");
	      ts.add("F");
	      ts.add("D");
	      TreeSet ts1 = new TreeSet();
	      // Add elements to the tree set
	      ts1.add("C1");
	      ts1.add("A1");
	      ts1.add("B1");
	      ts1.add("E1");
	      ts1.add("F1");
	      ts1.add("D1");
	      ts.addAll(ts1);
	      System.out.println(ts);

	}

}

package com.tutorialspoint.datastructures;

import java.util.Enumeration;
import java.util.Vector;
public class VectorDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v = new Vector(3,2);
		Vector v1 = new Vector(2);
		Vector v2 = new Vector();
		Vector v3 = new Vector(v);
		
		System.out.println("Initial size: " + v.size());
	    System.out.println("Initial capacity: " +
	      v.capacity());
	    
	    System.out.println("Initial size: " + v1.size());
	    System.out.println("Initial capacity: " +
	      v1.capacity());
	    
	    System.out.println("Initial size: " + v2.size());
	    System.out.println("Initial capacity: " +
	      v2.capacity());
	    
	    System.out.println("Initial size: " + v3.size());
	    System.out.println("Initial capacity: " +
	      v3.capacity());
	    
	    v.addElement(new Integer(1));
	    v.addElement(new Integer(2));
	    v.addElement(new Integer(3));
	    v.addElement(new Integer(4));
	    System.out.println("Capacity after four additions: " +
	          v.capacity());
	    
	    v.addElement(new Double(5.45));
	    System.out.println("Current capacity: " +
	    v.capacity());
	    v.addElement(new Double(6.08));
	    v.addElement(new Integer(7));
	    System.out.println("Current capacity: " +
	    v.capacity());
	    v.addElement(new Float(9.4));
	    v.addElement(new Integer(10));
	    System.out.println("Current capacity: " +
	    v.capacity());
	    v.addElement(new Integer(11));
	    v.addElement(new Integer(12));
	    System.out.println("First Element: "+
	    (Integer)v.firstElement());
	    System.out.println("Last Element: "+
	    (Integer)v.lastElement());
	    
	    if(v.contains(new Integer(3)))
	    System.out.println("Vector contains 3.");
	    // enumerate the elements in the vector.
	    Enumeration vEnum = v.elements();
	    System.out.println("\nElements in vector: ");
	    while(vEnum.hasMoreElements()){
	    	System.out.print(vEnum.nextElement()+" ");
	    }
	    System.out.println();
	    
	    for(int i = 0; i < v.toArray().length; i++){
	    	System.out.print(v.toArray()[i].toString()+" ");
	    }
	    System.out.println();
	}

}

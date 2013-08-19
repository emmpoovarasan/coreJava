package com.tutorialspoint.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Dog implements Comparator<Dog>, Comparable<Dog>{
	private String name;
	private int age;
	
	Dog(){
	}
	
	Dog(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public String getDogName(){
		return name;
	}
	
	public int getDogAge(){
		return age;
	}
	
	@Override
	// Overriding the compareTo method
	public int compareTo(Dog o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.name);
	}

	@Override
	// Overriding the compare method to sort the age 
	public int compare(Dog o1, Dog o2) {
		// TODO Auto-generated method stub
		return o1.age - o2.age;
	}
	
}
public class ComparatorExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Takes a list o Dog objects
		List<Dog> list = new ArrayList<Dog>();
		list.add(new Dog("Shaggy",3));
		list.add(new Dog("Lacy",2));
	    list.add(new Dog("Roger",10));
	    list.add(new Dog("Tommy",4));
	    list.add(new Dog("Tammy",1));
	    Collections.sort(list);// Sorts the array list
	    for(Dog a : list){//printing the sorted list of names
	    	System.out.print(a.getDogName() +" ");
	    }
	    
	    // Sorts the array list using comparator
	    Collections.sort(list, new Dog());
	    System.out.println(" ");
	    for(Dog a : list)//printing the sorted list of ages
	    	System.out.print(a.getDogName() + " : "
	    			+ a.getDogAge()+", ");
	    	
	    System.out.println();

	}

}

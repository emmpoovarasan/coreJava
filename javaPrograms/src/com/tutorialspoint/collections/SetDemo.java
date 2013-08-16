package com.tutorialspoint.collections;

import java.util.*;
public class SetDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count[] = {34, 22,10,60,30,22};
		Set<Integer> s = new HashSet<Integer>();
		try {
			for(int i=0;i<count.length;i++){
				s.add(count[i]);
			}
			System.out.println("The Set elemets : "+s);
			
			TreeSet sortedSet = new TreeSet<Integer>(s);
			System.out.println("The sorted list is: "+sortedSet);
			
			System.out.println("The first element of the set is : "+(Integer)sortedSet.first());
			System.out.println("The last element of the set is : "+(Integer)sortedSet.last());
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}

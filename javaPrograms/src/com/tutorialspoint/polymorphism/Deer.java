package com.tutorialspoint.polymorphism;

import java.util.Arrays;

interface Vegetarian{
	public abstract void testVegetarian();
	
	
}
class Animal{
	public void testAnimal(){
		System.out.println("This is Animal");
	}
}
public class Deer extends Animal implements Vegetarian{
	@Override
	public void testVegetarian() {
		// TODO Auto-generated method stub
		System.out.println("This is Vegetarian");
	}
	private void testDear() {
		// TODO Auto-generated method stub
		System.out.println("This is Deer");
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deer d = new Deer();
		Animal a = d;
		Vegetarian v = d;
		Object o = d;
		//System.out.println(o.getClass());
		System.out.println("Accessing Deer reference\n--------------------------");
		d.testDear();
		d.testAnimal();
		d.testVegetarian();
		System.out.println();
		System.out.println("Accessing Animal reference\n--------------------------");
		a.testAnimal();
		System.out.println();
		System.out.println("Accessing Vegetarian reference\n--------------------------");
		v.testVegetarian();
		System.out.println();
		System.out.println("Accessing Object reference\n--------------------------");
		System.out.println(o.getClass());
		/*System.out.println(o.getClass().getMethods());
		for(int x = 0; x < o.getClass().getMethods().length; x++){
			System.out.println(o.getClass().getMethods()[x].getName());
		}*/
		
		
		
	}

}

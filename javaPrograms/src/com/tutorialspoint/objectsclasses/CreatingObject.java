package com.tutorialspoint.objectsclasses;

public class CreatingObject {
	/**
	 * @param args
	 */
	public CreatingObject(String name){
		// This constructor has one parameter, name.
		System.out.println("Passed name is : "+name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Following statement would create an object myCreatingObject
		CreatingObject myCreatingObject = new CreatingObject("tommy");
	}
}

package com.tutorialspoint.methods;

public class TestConstructorsMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestConstructors tc = new TestConstructors();
		TestConstructors tc1 = new TestConstructors();
		System.out.println("Print simple TestConstructors() is "+tc.x+" / "+tc1.x);
		
		TestConstructors tc2 = new TestConstructors(5);
		TestConstructors tc3 = new TestConstructors(9);
		System.out.println("Print simple argument TestConstructors() is "+tc2.x+" / "+tc3.x);
	}

}

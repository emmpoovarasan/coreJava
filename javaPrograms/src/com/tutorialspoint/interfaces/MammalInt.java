package com.tutorialspoint.interfaces;

public class MammalInt implements Animal {
	

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Mammal eats");
		
	}

	@Override
	public void travel() {
		System.out.println("Mammal travels");
		// TODO Auto-generated method stub
		
	}
	
	public int noOfLegs(){
		return 4;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MammalInt m = new MammalInt();
		m.eat();
		m.travel();
		System.out.println(m.noOfLegs());
	}


}

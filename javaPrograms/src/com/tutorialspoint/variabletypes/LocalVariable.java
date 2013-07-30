package com.tutorialspoint.variabletypes;

public class LocalVariable {
	public void pupAge(){
		int age=0;
		age=age+10;
		System.out.println("Puppy age is : "+age);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalVariable lv = new LocalVariable();
		lv.pupAge();
	}

}

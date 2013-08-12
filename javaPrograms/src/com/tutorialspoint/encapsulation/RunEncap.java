package com.tutorialspoint.encapsulation;

import java.io.ObjectInputStream.GetField;

public class RunEncap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EncapTest encap = new EncapTest();
		encap.setName("Poovarasan.M");
		encap.setIdNum("14");
		encap.setAge(31);
		
		System.out.println("ID Number\t: "+ encap.getIdNum() + "\nName\t\t: "+encap.getName() + "\nAge\t\t: "+encap.getAge());

	}

}

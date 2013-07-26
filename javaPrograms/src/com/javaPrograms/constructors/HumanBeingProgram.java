package com.javaPrograms.constructors;

public class HumanBeingProgram extends Animal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HumanBeing me = new HumanBeing();
		output(me);
		
		HumanBeing colorgen = new HumanBeing("green", "other");
		output(colorgen);
		
		HumanBeing you = new HumanBeing("red", "female", "Lina");
		output(you);
		
	}
	public static void output(HumanBeing human){
		System.out.println(human.getName()+"'s eyes are: "+human.getEyeColor());
		System.out.println(human.getName()+" sex is "+human.sex);
		System.out.println("----------------------------------------");
	}
}

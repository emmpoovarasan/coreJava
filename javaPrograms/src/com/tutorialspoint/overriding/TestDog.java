package com.tutorialspoint.overriding;
class Animal{
	public void move(){
		System.out.println("Animals can move");
	}

}
class Dog extends Animal{
	
	@Override
	public void move() {
		// TODO Auto-generated method stub
		super.move();// invokes the super class method
		System.out.println("Dogs can walk and run");
	}
	
	public void bark(){
		System.out.println("Dogs can bark");
	}
	
	
}
public class TestDog {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a = new Animal(); // Animal reference and object
		Animal a1 = new Dog();// Animal reference but Dog object
		Dog d = new Dog(); // Dog reference and object
		System.out.println("runs the method in Animal class\n--------------------------------");
		a.move(); // runs the method in Animal class
		System.out.println("\nruns the method in Dog class using Animal Reference\n-------------------------------------");
		a1.move(); //Runs the method in Dog class
		System.out.println("\nruns the method in Dog class\n--------------------------------");
		d.bark(); //Runs the method in Dog class
	}

}

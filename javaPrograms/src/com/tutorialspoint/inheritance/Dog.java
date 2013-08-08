package com.tutorialspoint.inheritance;

public class Dog extends Mammal{
	
	public static void main (String[] args){
		Animal a = new Animal();
		Mammal m = new Mammal();
		Reptile r = new Reptile();
		Dog d = new Dog();
		boolean result;
		result = m instanceof Animal;
		System.out.println("m instanceof Animal is : "+result);
		result = r instanceof Animal;
		System.out.println("r instanceof Animal is : "+result);
		result = d instanceof Animal;
		System.out.println("d instanceof Animal is : "+result);
		result = d instanceof Mammal;
		System.out.println("d instanceof Mammal is : "+result);
		result = a instanceof Animal;
		System.out.println("a instanceof Animal is : "+result);
		
	}
	
}

package com.tutorialspoint.inheritance;

public class InterfaceDog extends InterfaceMammal{
	public static void main(String[] args){
		
		InterfaceMammal im = new InterfaceMammal();
		InterfaceDog id = new InterfaceDog();
		InterfaceReptile ir = new InterfaceReptile();
		
		System.out.println((im instanceof InterfaceAnimal) + " of (im instanceof InterfaceAnimal)");
		System.out.println((id instanceof InterfaceAnimal) + " of (id instanceof InterfaceAnimal)");
		System.out.println((id instanceof InterfaceMammal) + " of (id instanceof InterfaceMammal)");
		System.out.println((ir instanceof InterfaceAnimal) + " of (ir instanceof InterfaceAnimal)");
		
	}
	
}

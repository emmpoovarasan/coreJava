package com.tutorialspoint.polymorphism;

public class VirtualDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Salary s = new Salary("Poovarasan", "Velachery", 14, 30000);
		Employee e = new Salary("Ganesan", "nerkunram", 20, 30000);
		
		//Employee e1 = new Employee("Poovarasan", "Coimbatore", 14);
		
		System.out.println("Call mail check using salary reference");
		s.mailCheck();
		
		System.out.println("call mail check using employee reference");
		e.mailCheck();
		/*System.out.println("call mail check using employee reference");
		e1.mailCheck();*/
		e.setAddress("CMBT");
		
		System.out.println(e.toString());
		System.out.println(s.toString());
		s.computePay();

	}

}

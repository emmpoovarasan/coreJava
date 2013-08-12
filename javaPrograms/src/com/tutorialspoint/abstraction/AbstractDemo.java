package com.tutorialspoint.abstraction;

public class AbstractDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*//Following is not allowed and would raise error 
		Employee e = new Employee("Poovarasan","Velachery",14)*/
		
		/*// can we instantiate the abstract class using this method. 
		Employee e = new Employee("Poovarasan","Velachery",14) {
		};
		
		System.out.println("\n Call mailCheck using Employee reference--");
		e.mailCheck();*/
		
		
		Salary s = new Salary("Mohd Mohtashim", "Ambehta, UP", 3, 3600.00);
	    Salary e = new Salary("John Adams", "Boston, MA", 2, 2400.00);

	    System.out.println("Call mailCheck using Salary reference --");
	    s.mailCheck();

	    System.out.println("\n Call mailCheck using Employee reference--");
	    e.mailCheck();
	    System.out.println("Return value of computePay() is salary/52 "+e.computePay());
	      

	}

}

package com.tutorialspoint.objectsclasses;

public class EmployeeTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Create two objects using constructor */
		Employee empOne = new Employee("Poovarasan");
		Employee empTwo = new Employee("Ganesan");
		
		// Invoking methods for each object created
		empOne.empAge(31);
		empOne.empDesignation("Software Tester");
		empOne.empSalary(30000);
		empOne.printEmployee();
		
		empTwo.empAge(26);
		empTwo.empDesignation("Software Engineer");
		empTwo.empSalary(30000);
		empTwo.printEmployee();
		
	}

}

package com.tutorialspoint.variabletypes;

import com.javaPrograms.stringObjectPremitive;

public class InstanceVariable {
	// this instance variable is visible for any child class.
	public String name;
	
	// salary  variable is visible in InstanceVariable(Employee) class only.
	private double salary;
	
	// The name variable is assigned in the constructor.
	public InstanceVariable(String empName){
		name = empName;
	}
	// The salary variable is assigned a value.
	public void setSalary(double empSalary){
		salary = empSalary;
	}
	// This method prints the employee details.
	public void printEmp(){
		System.out.println("name  : " + name );
	    System.out.println("salary :" + salary);
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstanceVariable empOne = new InstanceVariable("Nithya");
		empOne.setSalary(35000);
		empOne.printEmp();
	}
}

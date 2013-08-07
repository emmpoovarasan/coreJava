package com.tutorialspoint.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.rmi.RemoteException;

import javax.naming.InsufficientResourcesException;

public class ExcepTest {
	
	public void deposit(double amount) throws RemoteException{
		// method implementation
		
		if(amount>0){
			System.out.println("deposit amount : "+amount);	
		}else{
			System.out.println("deposit amount : "+amount);
			throw new RemoteException();
		}
		
	}
	
	public void withdrwa(double amount) throws RemoteException,InsufficientResourcesException{
		// method implementation
		System.out.println("withdraw amount : "+amount);
	}
	
	// Reminder of class 

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[2];
		try {
			System.out.println("Access element three "+a[2]);
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("Exception thrown : "+e);
		}finally{
			a[0]=6;
			System.out.println("First element value : "+a[0]);
			System.out.println("The finally statement is executed");
		}
		System.out.println("Out of Block");
		
		ExcepTest et = new ExcepTest();
		
		try {
			et.deposit(-100.250);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception in Deposit "+e);
		}
		
		try {
			
			et.withdrwa(-100);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception in withdraw "+e);
		}
		
	}

}

package com.tutorialspoint.serialization;

import java.io.FileInputStream;
import java.io.IOException;

import java.io.ObjectInputStream;

public class DeserializeDemo {

	public static void main(String[] args){
		Employee e = null;
		try {
			FileInputStream fileIn = new FileInputStream("E:\\employee.ser");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			e = (Employee) in.readObject();
			in.close();
			fileIn.close();
			
		}catch (IOException i){
			i.printStackTrace();
		}catch (ClassNotFoundException c) {
			// TODO: handle exception
			// TODO: handle exception
			System.out.println("Employee class not found");
			c.printStackTrace();
		}
		
	    System.out.println("Deserialized Employee...");
	    System.out.println("Name\t: "+e.name);
	    System.out.println("Address\t: "+e.address);
	    System.out.println("SSN\t: "+e.SSN);
	    System.out.println("Number\t: "+e.number);
	    
	}
}

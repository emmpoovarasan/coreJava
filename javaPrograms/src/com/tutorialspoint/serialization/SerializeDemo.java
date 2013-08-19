package com.tutorialspoint.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeDemo {

	public static void main(String[] args){
		Employee e = new Employee();
		e.name = "Poovarasan";
		e.address = "Velachery";
		e.SSN = 1112233;
		e.number = 101;
		try {
			FileOutputStream fileOutput = new FileOutputStream("E:\\employee.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOutput);
			out.writeObject(e);
			out.close();
			fileOutput.close();
			System.out.printf("Serialized data is saved in E:\\employee.ser");
		} catch (IOException i) {
			// TODO: handle exception
			i.printStackTrace();
		}
	}
}

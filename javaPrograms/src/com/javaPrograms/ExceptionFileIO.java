package com.javaPrograms;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionFileIO {
	public ExceptionFileIO(String fileName){
		BufferedReader br;
		try{
			br = new BufferedReader(new FileReader(fileName));
			String line = "";
			while ((line = br.readLine()) !=null ){
				System.out.println("Reading line "+line);
			}
		}catch (FileNotFoundException e){
			System.out.println("There was an exception! The file was not found.");
		}catch (IOException e) {
			// TODO: handle exception
			System.out.println("There was an exception handling file.");
		}
	}
		
}

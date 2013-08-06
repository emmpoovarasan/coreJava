package com.tutorialspoint.filesandio;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ByteStreamTest {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//ByteArrayOutputStream bOutput = new ByteArrayOutputStream(12);
		ByteArrayOutputStream bOutput = new ByteArrayOutputStream();
		System.out.println("Enter the sentance here!!!");
		//System.out.println(bOutput.size());
		while(bOutput.size() != 10){
			// Gets the inputs from the user
			bOutput.write(System.in.read());
		}
		//System.out.println(bOutput.size());
		byte[] b = bOutput.toByteArray();
		System.out.print("Print the content : ");
		for(int x = 0; x < b.length; x++){
			// printing the characters
			System.out.print((char)b[x]);
		}
		System.out.println(" ");
		
		int c;
		
		ByteArrayInputStream bInput = new ByteArrayInputStream(b);
		System.out.print("Converting characters to Upper case : ");
		for(int y = 0; y < 1; y++){
			while( (c = bInput.read()) != -1 ){
				System.out.print(Character.toUpperCase((char)c));
			}
			bInput.reset();
		}
		System.out.println(" ");
		
		
	}

}

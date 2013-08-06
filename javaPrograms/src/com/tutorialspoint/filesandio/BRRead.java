package com.tutorialspoint.filesandio;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Use a BufferedReader to read characters from the console.
public class BRRead {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		char c;
	    // Create a BufferedReader using System.in
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter characters, 'Q' to quit! ");

		// read characters
		do{
			c = (char) br.read();
			System.out.println(c);
		}while(c!='Q');

	}

}

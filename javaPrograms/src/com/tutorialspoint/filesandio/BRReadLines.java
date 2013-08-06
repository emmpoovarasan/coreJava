package com.tutorialspoint.filesandio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BRReadLines {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String str;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter line of text");
		System.out.println("Enter 'end' of the word to quit");
		
		do{
			str = (String) br.readLine();
			System.out.println(str);
		}while(!str.equals("end"));
	}

}

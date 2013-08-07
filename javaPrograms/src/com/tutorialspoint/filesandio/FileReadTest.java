package com.tutorialspoint.filesandio;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadTest {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try {
			File f = new File("Hello.txt");
			System.out.println(f.getAbsolutePath());
			// creates the file
			f.createNewFile();
			// creates a FileWriter Object
			FileWriter fw = new FileWriter(f);
			// Writes the content to the file
			fw.write("This\n is\n an\n example\n File Read\n /\n File Write\n program\n");
			fw.flush();
			fw.close();
			
			//Creates a FileReader Object
			FileReader fr = new FileReader(f);
			char[] ch = new char[50];
			fr.read(ch);// reads the content to the array
			for(char c : ch){
				System.out.print(c);//prints the characters one by one
			}
			fr.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("File not found exception...");
		}
		
	}

}

package com.tutorialspoint.filesandio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteTest {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		try {
			File f = new File("Hello1.txt");
			f.createNewFile();
			System.out.println(f.getAbsolutePath());
			FileWriter fw = new FileWriter(f);
			fw.write("This is an File Write program");
			fw.write("Testing process");
			fw.append("Developement process");
			//fw.flush();
			fw.close();
			
			FileReader fr = new FileReader(f);
			char[] ch = new char[50];
			fr.read(ch);
			for(char c : ch){
				System.out.print(c);
			}
			fr.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("File not found exception");
		}

		
	}
}

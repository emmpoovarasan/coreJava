package com.tutorialspoint.filesandio;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStream {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f = new File("E:\\fileinputstream.txt");
		InputStream f1 = new java.io.FileInputStream(f);
		
		
	}

}

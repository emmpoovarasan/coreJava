package com.tutorialspoint.filesandio;

import java.io.*;


public class FileInputStream {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String str;
		// crate new file
		File f = new File("E:\\test.txt");
		// declare input stream using for giving input
		DataInputStream in = new DataInputStream(System.in);
		// once create it does not show. you need to write something on the test file then only you can see.
		// using for write ouput
		DataOutputStream out = new DataOutputStream(new FileOutputStream(f));
		// write text into the declared file using direct
		out.writeBytes("Testing\n");
		out.writeChars("Testing\n");
		out.writeUTF("Testing");
		
		//out.write(in.readByte());
		// write text into declared file.
		do{
			str = in.readLine();
			out.writeBytes(str);
		}while(!str.equals(" "));
		
	}

}

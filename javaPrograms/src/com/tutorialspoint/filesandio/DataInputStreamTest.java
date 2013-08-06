package com.tutorialspoint.filesandio;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream.GetField;


public class DataInputStreamTest {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//System.out.println(""+new DataInputStreamTest().getClass());
		DataInputStream in = new DataInputStream(new FileInputStream("E:\\text.txt"));
		DataOutputStream out = new DataOutputStream(new FileOutputStream("E:\\text1.txt"));
		String count;
		while( (count = in.readLine()) != null ){
			String u = count.toUpperCase();
			System.out.println(u);
			out.writeBytes(u+" ,");
		}
		in.close();
		out.close();
	}

}

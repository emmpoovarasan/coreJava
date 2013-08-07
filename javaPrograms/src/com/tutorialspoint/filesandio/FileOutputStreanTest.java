package com.tutorialspoint.filesandio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;



public class FileOutputStreanTest {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//File f = new File("E:\\FileOutputStrean.txt");
		try {
			byte bWrite [] = {11,21,3,40,5};
		      OutputStream os = new FileOutputStream("E:\\FileOutputStream.txt");
		      for(int x=0; x < bWrite.length ; x++){
		         os.write( bWrite[x] ); // writes the bytes
		         System.out.println(bWrite[x]);
		      }
		      os.close();
		      
			InputStream in = new FileInputStream("E:\\FileOutputStream.txt");
			int size = in.available();
			for(int i = 0; i<size; i++){
				System.out.println((char)in.read()+" ");
			}
			in.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File not found exception occurred");
		}
		
		
		
	}

}

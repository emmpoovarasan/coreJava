package com.tutorialspoint.filesandio;

import java.io.File;

public class DirList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dirName = "E:/tmp";
		File f = new File(dirName);
		if(f.isDirectory()){
			System.out.println("Directory of "+dirName);
			String s[] = f.list();
			
			for(int i=0; i<s.length; i++){
				File f1 = new File(dirName+"/"+s[i]);
				if(f1.isDirectory()){
					System.out.println(s[i]+ " is a directory.");
				}else{
					System.out.println(s[i]+ " is a file.");
				}
			}
			
		}else{
			System.out.println(dirName+" is not a directory");
		}
	}

}

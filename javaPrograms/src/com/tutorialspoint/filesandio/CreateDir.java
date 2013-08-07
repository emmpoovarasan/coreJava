package com.tutorialspoint.filesandio;

import java.io.File;

public class CreateDir {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dirName = "E:/tmp/user/java/bin";
		File d = new File(dirName);
		// create directory now.
		d.mkdirs();
		System.out.println(d.getAbsolutePath());
	}

}

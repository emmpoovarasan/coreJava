package com.javaPrograms;

import java.io.ObjectInputStream.GetField;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class MyFirstLog {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger logs = Logger.getLogger("My Log");
		
		FileHandler fh;
		
		try {
			fh = new FileHandler("E:\\myloger.log");
			logs.addHandler(fh);
			SimpleFormatter formater = new SimpleFormatter();
			fh.setFormatter(formater);
			//logs.setUseParentHandlers(false);
			logs.info("My First Log");
			
			logs.info("Second message");
			
			
		} catch (Exception e) {
			logs.info(e.getMessage());
		}

	}

}

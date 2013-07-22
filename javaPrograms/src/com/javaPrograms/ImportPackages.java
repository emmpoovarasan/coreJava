package com.javaPrograms;

import java.util.Calendar;
import java.util.Date;


public class ImportPackages {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar calendar = Calendar.getInstance();
		calendar.set(2013, 07, 22);
		Date firstDate = calendar.getTime();
		
		calendar.set(2013, 07, 01);
		Date secondDate = calendar.getTime();
		
		System.out.println("Is firstDate before secondDate "+firstDate.before(secondDate));
		System.out.println("Is firstDate after secondDate "+firstDate.after(secondDate));
		System.out.println(calendar.getTime()+"\n"+calendar.getInstance().getTime());

	}

}

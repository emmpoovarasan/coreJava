package com.tutorialspoint.dateandtime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateAndTime {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
		System.out.println("Current Date and time is "+date.toString());
		
		Date dNow  = new Date();
		SimpleDateFormat df = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz"); 
		System.out.println("Current Date : "+df.format(dNow));
		
		// display time and date using toString()
		String str = String.format("Current Date/Time : %tc", dNow);
		System.out.println(str);
		
		// display time and date using toString()
		System.out.printf("%1$s %2$tB %2$td, %2$tY","Due date:", date);
		System.out.println();
		// display formatted date
	    System.out.printf("%s %tB %<te, %<tY", 
	                         "Due date:", date);
	    System.out.println();
	    
	    
	    //Parsing Strings into Dates:
	    SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
	    String input = args.length == 0 ? "1818-11-11" : args[0];
	    
	    System.out.print(input +" Parses as " );
	    
	    Date t;
	    try {
			t = ft.parse(input);
			System.out.println(t);
		} catch (ParseException e) {
			// TODO: handle exception
			System.out.println("Unparsable using "+ft);
		}
	    //Sleeping for a While:
	    try {
	    	System.out.println("Before start sleep date time : "+ new Date());
	    	//Thread.sleep(5*60*10);
	    	Thread.sleep(3000);
	    	System.out.println("After completed sleep date time : "+new Date());
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Got an exception!");
		}
	    
	    //Measuring Elapsed Time:
	    try {
	    	long start = System.currentTimeMillis();
	    	System.out.println("Measuring Elapsed Time Before: "+new Date()+"\n");
	    	Thread.sleep(5000);
	    	System.out.println("Measuring Elapsed Time After: "+new Date()+"\n");
	    	long end = System.currentTimeMillis();
	    	long diff = end - start;
	    	System.out.println("Measuring Elapsed Time Difference is : "+diff);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Got an exception!");
		}
	    
	    //GeregorianCalender
	    String months[] = {
	    	      "Jan", "Feb", "Mar", "Apr",
	    	      "May", "Jun", "Jul", "Aug",
	    	      "Sep", "Oct", "Nov", "Dec"};
	    int year;
	 // Create a Gregorian calendar initialized
	 // with the current date and time in the
	 // default locale and timezone.
	    GregorianCalendar gCalender = new GregorianCalendar();
	 // Display current time and date information.
	    System.out.print("Date : ");
	    System.out.print(months[gCalender.get(Calendar.MONTH)]);
	    System.out.print(" " + gCalender.get(Calendar.DATE) + " ");
	    System.out.print(year = gCalender.get(Calendar.YEAR));
	    System.out.print("Time: ");
	    System.out.print(gCalender.get(Calendar.HOUR) + ":");
	    System.out.print(gCalender.get(Calendar.MINUTE) + ":");
	    System.out.print(gCalender.get(Calendar.SECOND));
	    
	 // Test if the current year is a leap year
	    if(gCalender.isLeapYear(year)){
	    	System.out.println("The current year is a leap year");
	    }else{
	    	System.out.println("The current year is not a leap year");
	    }

	    
	}
}

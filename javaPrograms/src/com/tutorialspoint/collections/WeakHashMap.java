package com.tutorialspoint.collections;

import java.util.*;

import javax.management.IntrospectionException;
public class WeakHashMap {
	private static Map map;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		map = new java.util.WeakHashMap();
		map.put(new String("Maine"), "Augusta");
		
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				while (map.containsKey("Maine")) {
		               try {
		            	  System.out.println("Thread sleep starts");
		                  Thread.sleep(500);
		                  System.out.println("Thread sleep ends");
		               } catch (InterruptedException ignored) {
		               }
		               System.out.println("Thread waiting");
		               System.gc();
		        }
			}
		};
		
		Thread t = new Thread(runnable);
		t.start();
		System.out.println("Main waiting");
		try {
			System.out.println("Thread join starts");
			t.join();
			System.out.println("Thread join ends");
		} catch (InterruptedException ignored) {
			// TODO: handle exception
			System.out.println("Interrupted Exception: "+ignored.getMessage());
		}
		

	}

}

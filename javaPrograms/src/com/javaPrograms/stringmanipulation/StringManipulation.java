package com.javaPrograms.stringmanipulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.javaPrograms.arrays;

public class StringManipulation {

	protected void splitArray() {
		List<String> webSites = new ArrayList<String>();
		webSites.add("http://howtoprogramwithjava.com/reviews/");
		webSites.add("http://howtoprogramwithjava.com/programming-101-the-5-basic-concepts-of-any-programming-language/");
		webSites.add("http://howtoprogramwithjava.com/consulting/web-application-development/");
		webSites.add("http://google.com/");
		
		for(String webSite : webSites){
			System.out.println("WebSite -> "+webSite);
			String[] stringArray = webSite.split("//");
			System.out.println("Splitting String by // -> "+Arrays.toString(stringArray));
			System.out.println("Splitting String further by / -> "+Arrays.toString(stringArray[1].split("/")));
			System.out.println("");
		}
	}
	
	protected void searchString(String sentanceContains) {
		String sentance = "The quick brown Fox jumps over the lazy Dog.";
		sentance=sentance.toLowerCase();
		Boolean ifContains = sentance.contains(sentanceContains.toLowerCase());
		System.out.println("Does the sentance contain '"+sentanceContains.toLowerCase()+"': "+ifContains);
	}
	
	protected void matchingString(String S1, String S2) {
		System.out.println("Does the string is equals() '"+S1+"' to '"+S2+"' : "+S1.equals(S2));
		System.out.println("Does the string is equalsIgnoreCase() '"+S1+"' to '"+S2+"' : "+S1.equalsIgnoreCase(S2));
	}
	
	protected void testSubSrings(String sentance, int start, int end) {
		String newSentance = null;
		newSentance = sentance.substring(start, end);
		System.out.println("substring of ("+sentance+"): "+newSentance);
		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringManipulation sm = new StringManipulation();
		//sm.splitArray();
		//sm.searchString("Fox");
		//sm.matchingString("fox", "FOX");
		sm.testSubSrings("This is a sentence that will be deconstructed with the substring method", 8, 45);
	}

}

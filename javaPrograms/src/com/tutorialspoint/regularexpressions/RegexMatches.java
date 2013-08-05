package com.tutorialspoint.regularexpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatches {
	private static final String REGEX = "\\bcat\\b";
    private static final String INPUT =
                                    "cat cat cat cattie cat";
    
    private static final String replaceREGEX = "dog";
    private static String replaceINPUT = "The dog says meow. " +
                                    "All dogs say meow.";
    private static String REPLACE = "cat";
    
    private static String appendREGEX = "a*b";
    private static String appendINPUT = "aabfooaabfooabfoob";
    private static String appendREPLACE = "-";
    
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String to be scanned to find the pattern.
	    	String line = "This order was places for QT3000! OK?";
	    	String pattern = "(.*)(\\d+)(.*)";
	    
	    // Create a Pattern object
	    	Pattern r = Pattern.compile(pattern);
	    	
	    // Now create matcher object.
	    	Matcher m = r.matcher(line);
	    	System.out.println(m.groupCount());
	    	System.out.println("-------------------------------");
	    	if(m.find()){
	    		for(int i = 0; i < m.groupCount(); i++){
	    			System.out.println("Found value of m.group("+i+") is "+m.group(i));
	    		}
	    	}
	    	System.out.println("-------------------------------");
	    	//The start and end Methods:
	    	Pattern p = Pattern.compile(REGEX);
	    	Matcher m1 = p.matcher(INPUT);
	    	int count = 0;
	    	while(m1.find()){
	    		count++;
	    		System.out.println("Match number : "+count);
	    		System.out.println("start() : "+m1.start());
	    		System.out.println("end() : "+m1.end());
	    	}
	    	System.out.println("-------------------------------");
	    	Pattern p1 = Pattern.compile(pattern);
	    	Matcher m2 = p1.matcher(line);
	    	int count1 = 0;
	    	while(m2.find()){
	    		count1++;
	    		System.out.println("Match number : "+count1);
	    		System.out.println("start() : "+m2.start());
	    		System.out.println("end() : "+m2.end());
	    		System.out.println("start(int group) : "+m2.start(count1));
	    		System.out.println("end(int group) : "+m2.end(count1));
	    	}
	    	System.out.println("-------------------------------");

	    	//The matches and lookingAt Methods:
	    	String regExep = "foo";
	    	String inputExp = "fooooooooooooooo";
	    	Pattern pat = Pattern.compile(regExep);
	    	Matcher mat = pat.matcher(inputExp);
	    	System.out.println("Current regExep : "+regExep);
	    	System.out.println("Current inputExp : "+inputExp);
	    	
	    	System.out.println("lookingAt(): "+mat.lookingAt());
	    	System.out.println("matches(): "+mat.matches());
	    	System.out.println("-------------------------------");
	    	
	    	//The replaceFirst and replaceAll Methods:
	    	Pattern repPat = Pattern.compile(replaceREGEX);
	        // get a matcher object
	        Matcher repMat = repPat.matcher(replaceINPUT);
	        System.out.println("Before. The replaceFirst and replaceAll Methods: "+replaceINPUT);
	        replaceINPUT = repMat.replaceAll(REPLACE);
	        //replaceINPUT = repMat.replaceFirst(REPLACE);
	        System.out.println("The replaceFirst and replaceAll Methods: "+replaceINPUT);
	        System.out.println("-------------------------------");
	        
	        //The appendReplacement and appendTail Methods:
	        Pattern appPat = Pattern.compile(appendREGEX);
	        // get a matcher object
	        Matcher appMat = appPat.matcher(appendINPUT);
	        StringBuffer sb = new StringBuffer();
	        while(appMat.find()){
	        	appMat.appendReplacement(sb, appendREPLACE);
	        	
	        }
	        appMat.appendTail(sb);
	        System.out.println("The appendReplacement and appendTail Methods: "+sb);
	        System.out.println("-------------------------------");
	}
}

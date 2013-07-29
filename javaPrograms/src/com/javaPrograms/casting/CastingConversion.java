package com.javaPrograms.casting;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

public class CastingConversion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * type convesion Object to String
		 */
		Object oSentence = "This is just a regular sentance";
		String sSentence = (String) oSentence;
		System.out.println("Object(oSentence) : "+oSentence);
		System.out.println("Object to String Cast Conversion(sSentence) : "+sSentence);
		/*
		 * type convesion String to Object
		 */
		String sSentenecString = "This is just an another regular sentance";
		Object oSentenceObject = (Object) sSentenecString;
		System.out.println("String (sSentenecString) : "+sSentenecString);
		System.out.println("String to Object Cast Conversion (oSentenceObject) : "+oSentenceObject);
		/*
		 * Map class
		 */
		Map<String, Object> myMap = new HashMap<String, Object>();
		myMap.put("name", "Poovarasan");
		myMap.put("email", "poovarsan@easymedmbile.com");
		myMap.put("DOB", "1982-06-01");
		
		String name = (String) myMap.get("name");
		Object email=(Object) myMap.get("email");
		String dob = (String)myMap.get("DOB");
		
		try {
			Date convertDate = new SimpleDateFormat("yyyy-MM-dd",Locale.ENGLISH).parse(dob);
			//System.out.println(convertDate);
			System.out.println(name +"/"+ email+"/"+convertDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		/*System.out.println("Map class: "+myMap);
		System.out.println("Get particular key: "+myMap.containsKey("name"));
		System.out.println("Get particular key value: "+myMap.containsKey("name")+" , "+myMap.containsValue("Poovarasan"));
		System.out.println("Get key set: "+myMap.keySet());
		System.out.println("Get key set values: "+myMap.values());
		System.out.println("Remove key: "+myMap.remove("email"));
		System.out.println("Check is empty: "+myMap.isEmpty());
		System.out.println("Get size of Map: "+myMap.size());
		System.out.println("Get string: "+myMap.toString());
		System.out.println("Get entryset: "+myMap.entrySet());
		System.out.println("Get equal object: "+myMap.equals(oSentence));
		System.out.println("Get key: "+myMap.get("DOB"));
		System.out.println("Get class: "+myMap.getClass());*/
		
		
		/*Set set  = myMap.entrySet();
		Iterator i = set.iterator();
		
		while(i.hasNext()){
			Map.Entry me = (Map.Entry)i.next();
			System.out.println(me.getKey());
			System.out.println(me.getValue());
		}*/
		
		
	}

}

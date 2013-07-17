package com.javaPrograms;

public class stringObjectPremitive {
	public static void main(String[] args){ 
		String helloVar = "Hello World";
		System.out.println(helloVar);
		System.out.println("String Concatenation");
		String str1 = "Hello";
		String str2 = "World";
		String str3 = "!";
		System.out.println(str1+str2+str3);
		
		String firstName ="Poovarasan";
		String lastName = "Murugan";
		System.out.println("Hello there "+firstName+" "+lastName);
		
		// below code check string comparision
		if(firstName.equals(lastName)){
			System.out.println(firstName +"="+lastName);
		}else{
			System.out.println(firstName +"!="+lastName);
		}
	}
}

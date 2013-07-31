package com.tutorialspoint.variabletypes;

public class ClassStaticVariable {
	// salary  variable is a private static variable
	private static double salary;
	
	// DEPARTMENT is a constant
	public static final String DEPARTMENT = "Development";
	
	// SECTION is a without final
	public static String SECTION = "Application Developer";
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassStaticVariable.salary=1000;
		System.out.println("Accessing static variable salary using class : "+ClassStaticVariable.salary);
		System.out.println("------------------------------------");
		salary=1500;
		System.out.println("Accessing static variable salary using without class : "+salary);
		System.out.println("------------------------------------");
		System.out.println("DEPARTMENT is a static(constant) and can not able to change : "+DEPARTMENT);
		System.out.println("SECTION is a static and can able to change value before changed the value : "+SECTION);
		System.out.println("------------------------------------");
		SECTION="Testing";
		System.out.println("SECTION is a static and can able to change value: "+SECTION);
		System.out.println("------------------------------------");
		AccessMyOtherClass otherClass = new AccessMyOtherClass();
		System.out.println("Accessing static(constant) variable from other calss using protected : "+otherClass.protectedAccessOtherClassStaitcVariable());
		System.out.println("------------------------------------");
		System.out.println("Accessing static(constant) variable from other calss using public : "+otherClass.publicAccessOtherClassStaitcVariable());
		System.out.println("------------------------------------");
	}
}
class AccessMyOtherClass{
	protected String protectedAccessOtherClassStaitcVariable(){
		ClassStaticVariable.SECTION="Protected";
		System.out.println("Accessing protected method using static variable without final : "+ClassStaticVariable.SECTION);
		return ClassStaticVariable.DEPARTMENT;
	}
	private void privateAccessOtherClassStaitcVariable(){
		ClassStaticVariable.SECTION="Private";
		System.out.println("Accessing private method using static variable without final : "+ClassStaticVariable.SECTION);
		System.out.println("Access static (constant) variable from other class using private : "+ClassStaticVariable.DEPARTMENT);
		System.out.println("------------------------------------");
	}
	public String publicAccessOtherClassStaitcVariable(){
		ClassStaticVariable.SECTION="Public";
		System.out.println("Accessing public method using static variable without final : "+ClassStaticVariable.SECTION);
		return ClassStaticVariable.DEPARTMENT;
	}
	public AccessMyOtherClass() {
		// TODO Auto-generated constructor stub
		privateAccessOtherClassStaitcVariable();
	}
}

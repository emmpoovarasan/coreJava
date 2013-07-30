package com.tutorialspoint.enumarators;

public class EnumFreshJuice {
	/**
	 * @param args
	 */
	enum FreshJuiceSize {SMALL, MEDIUM, LARGE; 
						public static void a(int int1, int int2){
							int int3;
							int3=int1+int2;
								System.out.println("Enume method access a(): "+int3);
							};private FreshJuiceSize(){
								String str="Enumator constructor";
								System.out.println("Enume class access FreshJuiceSize() of: "+str);
							}
						} 
	FreshJuiceSize size;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EnumFreshJuice juice = new EnumFreshJuice();
		System.out.println("Direct access enumator: "+FreshJuiceSize.SMALL);
		System.out.println("Without initilization of juice.size: "+juice.size);
		juice.size=FreshJuiceSize.LARGE;
		System.out.println("With initilization of juice.size: "+juice.size);
		//call method of inside enumator
		FreshJuiceSize.a(20, 30);
		
	}

}

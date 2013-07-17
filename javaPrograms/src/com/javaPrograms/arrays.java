package com.javaPrograms;

public class arrays {
	public static void main(String[] args){
		String[] contacts;
		contacts=new String[10];
		
		System.out.println("Before insert array --- "+contacts[0]);
		
		for(int i=0; i< contacts.length;i++){
			contacts[i]="person"+i;
			System.out.println("During insert array --- "+contacts[i]);
		}
		
		System.out.println("After insert array --- "+contacts[contacts.length-9]);
		
		for(int i=0; i < singleDimArray().length; i++){
			System.out.println(singleDimArray()[i]);
		}
		
		
		multDimArray();
		
	}
	public static String[] singleDimArray(){
		String[] contacts;
		contacts=new String[10];
		
		for(int i=0; i< contacts.length;i++){
			contacts[i]="return array of person"+i;
		}
		return contacts;
	}
	public static void multDimArray(){ 
		String [][] crossword= new String[4][4];
		System.out.println("\nMulti Dimention Array Starts");
		for(int i=0; i < crossword.length; i++){
			for(int j=0; j < crossword.length; j++){
				crossword[i][j]= " "+ i + j+" ";
				System.out.print(crossword[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("\nMulti Dimention Array Ends");
		//System.out.println(crossword);
	}
}

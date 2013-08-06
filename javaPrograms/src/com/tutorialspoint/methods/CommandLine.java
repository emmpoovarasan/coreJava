package com.tutorialspoint.methods;

public class CommandLine {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Using Command-Line Arguments:
		// normal for loop
		for(int i = 0; i < args.length; i++){
			System.out.println("args["+i+"]: "+args[i]);
		}
		// enhanced for loop
		for(String element : args){
			System.out.println("Command Line Args "+ element);
		}
	}

}

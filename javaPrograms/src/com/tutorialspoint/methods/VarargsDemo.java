package com.tutorialspoint.methods;

public class VarargsDemo {
	public static void printMax(double... numbers){
		if(numbers.length == 0){
			System.out.println("No argument passed");
			return;
		}
		double result = numbers[0];
		
		for(int i = 0; i< numbers.length; i++){
			if(numbers[i]>result)
				result= numbers[i];
		}
		System.out.println("The Max value is "+result);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Call method with variable args  
		printMax(34, 3, 3, 2, 56.5);
		// Call method with variable args with new instance
		printMax(new double[]{1,2,3});
		VarargsDemo vard = new VarargsDemo();
		vard.printMax(1,2,3,5,6,8,4,9,11,4);
		vard.finalize();

	}
	
	protected void finalize(){
		System.out.println("Finalize() method code"+getClass());
	}

}

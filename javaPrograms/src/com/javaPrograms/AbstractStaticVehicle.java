package com.javaPrograms;

public abstract class AbstractStaticVehicle {
	public static Integer speedLimit = 80;
	
	public static void checkIfOverSpeedLimit(Integer currentSpeed){
		if(currentSpeed > speedLimit){
			System.out.println("Slow down! You're over the limit by "+(currentSpeed - speedLimit));
		}else{
			System.out.println("Go faster, you're only going "+currentSpeed);
		}
	}
	/**
	 * This below code hide create main method test
	 */
		/*public static void main(String[] args) {
			// TODO Auto-generated method stub
			AbstractStaticVehicle.checkIfOverSpeedLimit(70);
			AbstractStaticVehicle.checkIfOverSpeedLimit(155);
			
		}*/
}

package com.javaPrograms.accessmodifier.yourparenthouse;

import com.javaPrograms.accessmodifier.yourneighbourshouse.YourNeighboursHouseAt;

public class YourParentsHouse extends YourNeighboursHouseAt {
	
	protected boolean  enterYourParentHouse() {
		if(Math.random()>=0.5){
			System.out.println("protected: Entering YourParentHouse");
			changeThermostat();
			return true;
		}else{
			System.out.println("protected: No one is home at YourParentHouse");
			goToYourNeighbourHouseAt();
			return false;	
		}
	}
	private void changeThermostat(){
		System.out.println("private variable: Only your parents can change their thermostat!");
	}
	protected void goToYourNeighbourHouseAt() {
		System.out.println("protected: You are going to YourNeighbourHouseAt");
		enterYourNeighboursHouseAt();
	}
}

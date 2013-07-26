package com.javaPrograms.accessmodifier.yourhouse;

import com.javaPrograms.accessmodifier.yourparenthouse.YourParentsHouse;

public class YourHouse extends YourParentsHouse {
	
	protected void enterYourHome() {
		System.out.println("protected: Entering "+getClass().getSimpleName());
	}
	
	public void knockOnDoor(){
		System.out.println("public: You knock on the door of "+getClass().getSimpleName());
		Double randomNumber = Math.random();
		if(randomNumber >=0.5){
			System.out.println("public: You are geeted at "+getClass().getSimpleName());
			enterYourHome();
		}else{
			System.out.println("public: No one answers");
			goToParentHouse();
		}
			
	}
	
	protected void goToParentHouse() {
		System.out.println("protected: You are going to yourParentHouse");
		if(!this.enterYourParentHouse()){
			YourNeighboursHouse yourNeighbourHouse = new YourNeighboursHouse();
			yourNeighbourHouse.enterYourNeighboursHouse();
		}
	}

}

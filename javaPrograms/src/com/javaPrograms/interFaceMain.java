package com.javaPrograms;

public class interFaceMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		interfaceVehicle myCar = new Car();
		System.out.println("My " + myCar.getVehicleType() + " has " + myCar.getNumberOfSeats() + " seats.");
	    System.out.println("My " + myCar.getVehicleType() + " has " + myCar.getNumberOfWheels() + " wheels.");
	    interfaceVehicle myBus = new Bus();
	    System.out.println("My " + myBus.getVehicleType() + " has " + myBus.getNumberOfSeats() + " seats.");
	    System.out.println("My " + myBus.getVehicleType() + " has " + myBus.getNumberOfWheels() + " wheels.");
	}

}

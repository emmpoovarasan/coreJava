package com.javaPrograms;

public abstract class abstractVehicle {

	/**
	 * @param args
	 */
	public String vehicleType;
	
	public Integer getNumberOfSeats(){
		if(this.vehicleType.equals("Car")){
			return 5;
		}else if(this.vehicleType.equals("Bus")){
			return 20;
		}else if(this.vehicleType.equals("Motorcycle")){
			return 1;
		}
		// the vehicleType variable has not yet been set to anything,
	    // so we cannot say what number of seats this vehicle has, so
	    // we will return null.
		return null;
		
	}
	
	public String getVehicleType(){
		return this.vehicleType;
	}
	public abstract Integer getNumberOfWeels();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Car1 myCar =new Car1();
		
		System.out.println("My "+myCar.getVehicleType()+" has "+myCar.getNumberOfSeats()+" seats.");
		System.out.println("My " + myCar.getVehicleType() + " has " + myCar.getNumberOfWeels() + " wheels.");
		
		Bus1 myBus =new Bus1();
		System.out.println("My "+myBus.getVehicleType()+" has "+myBus.getNumberOfSeats()+" seats.");
		System.out.println("My " + myBus.getVehicleType() + " has " + myBus.getNumberOfWeels() + " wheels.");
		
		Motorcycle myMotor =new Motorcycle();
		System.out.println("My "+myMotor.getVehicleType()+" has "+myMotor.getNumberOfSeats()+" seats.");
		System.out.println("My " + myMotor.getVehicleType() + " has " + myMotor.getNumberOfWeels() + " wheels.");
	}
}

class Car1 extends abstractVehicle{
	Car1(){
		this.vehicleType="Car";
	}

	@Override
	public Integer getNumberOfWeels() {
		// TODO Auto-generated method stub
		return 4;
	}
}
class Bus1 extends abstractVehicle{
	Bus1(){
		this.vehicleType="Bus";
	}

	@Override
	public Integer getNumberOfWeels() {
		// TODO Auto-generated method stub
		return 6;
	}
}

class Motorcycle extends abstractVehicle{
	Motorcycle(){
		this.vehicleType="Motorcycle";
	}
	
	@Override
	public Integer getNumberOfWeels() {
		// TODO Auto-generated method stub
		return 2;
	}
	
}

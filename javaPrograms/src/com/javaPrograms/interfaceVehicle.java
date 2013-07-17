package com.javaPrograms;

public interface interfaceVehicle {
	public Integer getNumberOfSeats();
	public Integer getNumberOfWheels();
	public String getVehicleType();
}
class Car implements interfaceVehicle{

	@Override
	public Integer getNumberOfSeats() {
		// TODO Auto-generated method stub
		return 5;
	}

	@Override
	public Integer getNumberOfWheels() {
		// TODO Auto-generated method stub
		return 4;
	}

	@Override
	public String getVehicleType() {
		// TODO Auto-generated method stub
		return "Car";
	}
	
	public Integer getNumberOfDoors(){
		return 2;
	}
}
class Bus implements interfaceVehicle{
 
  @Override
  public Integer getNumberOfSeats()
  {
    return 35;
  }
 
  @Override
  public Integer getNumberOfWheels()
  {
    return 6;
  }
 
  @Override
  public String getVehicleType()
  {
    return "Bus";
  }
 
  public Integer getNumberOfDoors()
  {
    return 4;
  }
  /*public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car obj = new Car();
		System.out.println(obj.getNumberOfDoors());
	}*/
}
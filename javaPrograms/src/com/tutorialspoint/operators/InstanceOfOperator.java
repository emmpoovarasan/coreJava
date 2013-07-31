package com.tutorialspoint.operators;
interface Bus{
}
class Vehicle{
	protected void doPrint(){
		System.out.println("Print inside Vehicle Class : "+this.getClass());
	}
}
public class InstanceOfOperator extends Vehicle implements Bus{
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// access instanceOf variable from local
		String stringName = "Poovarasan";
		boolean resultOfString = stringName instanceof String;
		System.out.println("access instanceOf variable(String) from local  : "+resultOfString);
		
		// access instanceOf variable from Class
		
		Vehicle v = new InstanceOfOperator();
		boolean resultOfVehicle = v instanceof InstanceOfOperator;
		System.out.println("access instanceOf variable from Class(Vehicle) : "+resultOfVehicle);
		v.doPrint();
		
		// access instanceof variable from local
		
		Integer intSalary = 1000;
		boolean resultOfInteger = intSalary instanceof Integer;
		System.out.println("access instanceOf variable(Integer) from local : "+resultOfInteger);
		
		// access instanceOf variable from Interface
		Bus b = new Bus(){};
		boolean resultOfInterface = b instanceof Bus;
		System.out.println("access instanceOf variable from Interface(Bus) : "+resultOfInterface);
		
		/*double sal = 15000;
		boolean resultOfDouble = sal if (sal instanceof double) {
			double new_name = (double) sal;
			System.out.println(resultOfDouble + "/" + new_name);
		}*/
		
	}

}

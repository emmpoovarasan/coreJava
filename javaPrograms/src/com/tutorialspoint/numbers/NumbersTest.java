package com.tutorialspoint.numbers;

public class NumbersTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer x = 5;
		Integer y = 10;
		String str = "20";
		Double z = 10.5;
		x = x + 10;
		System.out.println("Value of X: "+x);
		System.out.println("x.compareTo(y): " + x.compareTo(y));
		System.out.println("x.equals(y): " + x.equals(y));
		System.out.println("x.valueOf(y): " + x.valueOf(y));
		System.out.println("x.toString(): " + x.toString());
		System.out.println("x.parseInt(str): " + x.parseInt(str));
		System.out.println("Math.abs(z): " + Math.abs(z));
		System.out.println("Math.ceil(z): " + Math.ceil(z));
		System.out.println("Math.floor(z): " + Math.floor(z));
		System.out.println("Math.rint(z): " + Math.rint(z));
		System.out.println("Math.round(z): " + Math.round(z));
		System.out.println("Math.min(x, y): " + Math.min(x, y));
		System.out.println("Math.max(x, y): " + Math.max(x, y));
		System.out.println("Math.exp(z): " + Math.exp(z));
		System.out.println("Math.log(x): " + Math.log(x));
		System.out.println("Math.pow(x, y): " + Math.pow(x, y));
		System.out.println("Math.sqrt(x): " + Math.sqrt(x));
		System.out.println("Math.sin(z): " + Math.sin(z));
		System.out.println("Math.cos(z): " + Math.cos(z));
		System.out.println("Math.tan(z): " + Math.tan(z));
		System.out.println("Math.asin(z): " + Math.asin(z));
		System.out.println("Math.acos(z): " + Math.acos(z));
		System.out.println("Math.atan(z): " + Math.atan(z));
		System.out.println("Math.atan2(y, x): " + Math.atan2(y, x));
		System.out.println("Math.toDegrees(z): " + Math.toDegrees(z));
		System.out.println("Math.toRadians(z): " + Math.toRadians(z));
		System.out.println("Math.random(): " + Math.random());
		System.out.println("x.byteValue(): " + x.byteValue());
		System.out.println("z.floatValue(): " + z.floatValue());
		System.out.println("z.hashCode(): " + z.hashCode());
		System.out.println("z.intValue(): " + z.intValue());
		System.out.println("z.longValue(): " + z.longValue());
		System.out.println("z.shortValue(): " + z.shortValue());
		System.out.println("z.doubleValue(): " + z.doubleValue());
		System.out.println("z.valueOf(str): " + z.valueOf(str));
		
	}

}

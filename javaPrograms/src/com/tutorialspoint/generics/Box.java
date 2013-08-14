package com.tutorialspoint.generics;

public class Box<T> {
	private T t;
	
	public void add(T t){
		this.t=t;
	}
	
	public T get(){
		return t;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box<Integer> integerBox = new Box<Integer>();
		Box<String> stringBox = new Box<String>();
		
		integerBox.add(new Integer(10));
		stringBox.add(new String("Hello world!"));
		
		System.out.println(integerBox.get());
		System.out.println(stringBox.get());
		

	}

}

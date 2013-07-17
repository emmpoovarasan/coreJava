package com.javaPrograms;

public class helloWorld extends Book {
	public static void main(String[] args){
		System.out.println("Hello World");
		
		Book b = new Book();
		b.setAuthor("Poovarasan");
		System.out.println(b.getAuthor());
		
	}
}

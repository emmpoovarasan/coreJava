package com.tutorialspoint.datastructures;

import java.util.EmptyStackException;
import java.util.Stack;

public class StackDemo {
	static void showpush(Stack st, int a){
		//st.push(new Integer(a)); // or use below
		st.push(a);
		System.out.println("push ("+a+")");
		System.out.println("stack : "+st);
	}
	static void showpop(Stack st){
		System.out.println("pop -> ");
		Integer a = (Integer) st.pop();
		System.out.println(a);
		System.out.println("stack : "+st);
		
	}
	
	/*static void showsearch(Stack st, int a){
		st.push(a);
		st.search(st.push(a));
		System.out.println("push ("+a+")");
		System.out.println("search : "+st);
	}*/

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack st = new Stack();
		System.out.println("stack : "+st);
		showpush(st, 66);
		showpush(st, 42);
		showpush(st, 99);
		showpop(st);
		showpop(st);
		showpop(st);
		
	/*	showsearch(st, 66);*/
		
		try {
			showpop(st);
		} catch (EmptyStackException e) {
			// TODO: handle exception
			System.out.println("Empty Stack Exception"+e.getMessage());
		}

	}

}

package com.javaPrograms;

public class objectUser {
	private String username;
	private String password;
	 
	public String getUsername(){
		return username;
	}
	public void setUsername(String username){
	    this.username = username;
	}
	public String getPassword(){
	    return password;
	}
	public void setPassword(String password){
	    this.password = password;
	}
	
	public static void main (String[] args){
		objectUser user1 = new objectUser();
		objectUser user2 = new objectUser();
		//object 1
		user1.setUsername("poovarasan");
		user1.setPassword("abcd");
		//object 2
		user2.setUsername("poovarasan");
		user2.setPassword("abcd");
		//print
		System.out.println("Are users equal : "+user1.equals(user2)+" "+user1.username+" "+user2.getUsername());
		
		System.out.println("compare object without Override: "+user1.username.equals(user2.getUsername())+"  "+user1.username+"  "+user2.getUsername());
		System.out.println("toString Override: "+user1.toString());
	}
}

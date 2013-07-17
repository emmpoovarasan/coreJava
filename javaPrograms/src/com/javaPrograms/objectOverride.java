package com.javaPrograms;

public class objectOverride {
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
	// Override objects
	//public boolean equals(Object obj)
	public boolean equals(objectOverride user2){
	// return this.username.equals(((User)obj).getUsername());
	    return this.username.equals(user2.getUsername());
	}
	@Override
	public String toString(){
		return "Username: "+this.username+", password: "+this.password; 
	}
	public static void main(String[] args){
		objectOverride user1 = new objectOverride();
		objectOverride user2 = new objectOverride();
		//object 1
		user1.setUsername("poovarasan");
		user1.setPassword("abcd");
		//object 2
		user2.setUsername("poovarasan");
		user2.setPassword("abcd");
		//print
		System.out.println("Are users equal(with Override) : "+user1.equals(user2)+" "+user1.username+" "+user2.getUsername());
		System.out.println("compare object without Override: "+user1.username.equals(user2.getUsername())+"  "+user1.username+"  "+user2.getUsername());
		System.out.println("toString Override: "+user1.toString());	
		System.out.println("Hascode user1: "+user1.hashCode()+", Hascode user2: "+user2.getUsername().hashCode());
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((password == null) ? 0 : password.hashCode());
		result = prime * result
				+ ((username == null) ? 0 : username.hashCode());
		return result;
	}
}

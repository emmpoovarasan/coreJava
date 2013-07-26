package com.javaPrograms.constructors;

public class HumanBeing extends Animal{
	String name;
	public HumanBeing(){
		super();
		this.name="John Doe";
	}
	public HumanBeing(String eyeColor, String sex){
		super(eyeColor, sex);
		this.name="cat";
	}
	public HumanBeing(String eyColor, String sex, String name){
		super(eyColor, sex);
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
}

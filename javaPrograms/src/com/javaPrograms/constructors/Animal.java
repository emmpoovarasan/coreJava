package com.javaPrograms.constructors;

public abstract class Animal {
	String eyeColor;
	String sex;
	public Animal(){
		this.eyeColor="brown";
		this.sex="male";
	}
	public Animal(String eyeColor, String sex){
		this.eyeColor=eyeColor;
		this.sex=sex;
	}
	public String getEyeColor(){
		return eyeColor;
	}
	public String getSex(){
		return sex;
	}
	public void setEyeColor(String eyeColor){
		this.eyeColor=eyeColor;
	}
	public void setSex(String sex){
		this.sex=sex;
	}
}

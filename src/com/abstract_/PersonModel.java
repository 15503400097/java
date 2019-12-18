package com.abstract_;

public class PersonModel {
	String name;
	int age;
	String sex;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public PersonModel(String name, int age, String sex) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	public PersonModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	


}

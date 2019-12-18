package com.jihe;

import org.omg.CORBA.PUBLIC_MEMBER;

public class PersonModel {
	String name;
	int age;
	String sex;
	public PersonModel(String name,int age,String sex) {
		super();
		this.name=name;
		this.age=age;
		this.sex=sex;
	}
	public PersonModel(){
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	
	}



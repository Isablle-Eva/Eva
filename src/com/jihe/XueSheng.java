package com.jihe;

import java.util.HashSet;

class Student{
	String id;
	String name;
	public Student() {
		super();
		// TODO 自动生成的构造函数存根
	}
	public Student(String id,String name) {
	
	this.id=id;
	this.name=name;
}
public String toString(){
	return id+":"+name;
}
}
public class XueSheng {
 
	private static HashSet<?> hs;

	public static void main(String[] args) {
		HashSet<Object> hs=new HashSet<>();
		Student stu1=new Student("1","Jack");
		Student stu2=new Student("2","Rose");
		Student stu3=new Student("2","Rose");
		hs.add(stu1);
		hs.add(stu2);
		hs.add(stu3);
		System.out.println(hs);

	}

	public static HashSet<?> getHs() {
		return hs;
	}

	public static void setHs(HashSet<?> hs) {
		XueSheng.hs = hs;
	}
}

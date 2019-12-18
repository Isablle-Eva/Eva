package com.jihe;

import java.util.TreeSet;


class Teacher implements Comparable<Object>{
	String name;
	int age;
	public Teacher(String name,int age) {
		this.name=name;
		this.age=age;
	}
	public String toString(){
		return name+":"+age;
	}
	public int compareTo(Object obj) {
		Teacher s=(Teacher)obj;
		if(this.age-s.age>0) {
			return 1;
		}
		if(this.age-s.age==0) {
			return this.name.compareTo(s.name);
		}
		return -1;
	}
}
public class T6_12 {

	public static void main(String[] args) {
		TreeSet<Object> ts=new TreeSet<>();
		ts.add(new Teacher("玛丽如", 20));
		ts.add(new Teacher("往南", 20));
		ts.add(new Teacher("为情", 20));
		ts.add(new Teacher("张大可爱",18));
		System.out.println(ts);

	}

}

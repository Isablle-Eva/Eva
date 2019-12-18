package com.jihe;

import java.util.HashSet;

class Person{
	String name;
	int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return name+":"+age;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}
public class P_1 {

	public static void main(String[] args) {
		Person p1=new Person("zzz",12);
		Person p2=new Person("zdd",13);
		Person p3=new Person("zgg",11);
		HashSet<Object> h1=new HashSet<>();//创建一个集合，三个对象
		h1.add(p1);
		h1.add(p2);
		h1.add(p3);
		System.out.println(h1);
	}

}

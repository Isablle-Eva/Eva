package com.inner;

import javax.print.attribute.standard.PrinterName;

import com.jhart.Person;

//定义一个函数接口
@FunctionalInterface
interface personBuilder{
	Person buildperson(String name);
}
class person{
	private String name;

public person(String name) {
		super();
		this.name = name;
	}

public String getName() {
		return name;
	}

public class E26 {
public void printName(String name,personBuilder builder) {
System.out.println(builder.buildperson(name).getName());	
}
}
	public void main(String[] args){
		PrintName("猴哥",name->new Person(name));
		PrintName("徒儿",Person::new);
	}

	private void PrintName(String name2, Object pt) {
		// TODO 自动生成的方法存根
		
	}

	private void PrintName(String name,personBuilder pt) {
		System.out.println(pt.buildperson(name).getName());
		
	}


}

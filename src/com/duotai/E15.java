package com.duotai;
interface Animal{
	void shout();
}
class Dog implements Animal{

	@Override
	public void shout() {
		System.out.println("wangwang..");
	}
}
class Cat implements Animal{

	@Override
	public void shout() {
	System.out.println("miaomiao..");
		
	}
	
}
public class E15 {

	public static void main(String[] args) {
		Animal dog=new Dog();
		Animal cat=new Cat();
		dog.shout();
		cat.shout();
	}

}

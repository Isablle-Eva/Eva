package com.abstract_;
abstract class Animal{
	//定义抽象方法shout();
	public abstract void shout();
}
	//定义Dog类继承抽象类Animal
class Dog extends Animal{
	//实现抽象方法shout（），编写方法体
		public void shout() {
		System.out.println("汪汪....");
	}
}
	//进行测试类
public class E12 {

	public static void main(String[] args) {
		Dog dog=new Dog();
		dog.shout();

	}

}

package com.final_;
//如果一个成员变量被final修饰，则该变量在本类中不能再赋值
class Animal{
	final String name="动物";
	public void shout() {}
	public String tostring() {
		// TODO 自动生成的方法存根
		return null;
	}
	//重写object类的tostring()方法
	@Override
	public String toString() {
		return "这是一只动物";
		
	}
}
class Dog extends Animal{
	@Override
	public void shout() {};
	//重写Animal类的toString()方法
	@Override
	public String toString() {
		return "这是一只小狗";
		
	}
}
public class E08 {

	public static void main(String[] args) {
		Animal dw=new Animal();
		Dog xg=new Dog();
		System.out.println(dw);
		System.out.println(xg);

	}

}

package com.inner;
//函数式接口注解：表明注解下面的接口有且仅有一个抽象方法
@FunctionalInterface
interface Animal{
	void shout();
}
@FunctionalInterface
interface Calculate{
	int sum(int a,int b);
}

class Cat implements Animal{

	@Override
	public void shout() {
		System.out.println("喵喵");
		
	}
}
public class E21 {

	public static void main(String[] args) {
		//第一种方式：用具体方式cat类的对象调用shout方法
		Cat cat=new Cat();
		cat.shout();
		//第二种方式，用匿名内部类的方式调用shout方法
		animalShout(new Animal() {
			
			@Override
	 		public void shout() {
				System.out.println("wangwang");
				
			}
		});
		//第三种方式：使用Lambda表达式作为参数传递给animalShout()方法
		//lambda表达式有三部分组成：
		//():参数列表->箭牌 {方法主体}
		animalShout(()->System.out.println("aow.."));
		ShowSum(10,20,(x,y)->x+y);				
		
	}

	private static void ShowSum(int i, int j, Calculate c) {
		System.out.println(i+"+"+j+"的和是"+c.sum(i,j));
		
	}

	private static void animalShout(Animal animal) {
		animal.shout();
	}
}

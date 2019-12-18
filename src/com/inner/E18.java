package com.inner;
class Outer{
	static int m=0;
	//定义外部类成员变量
	static void test1() {
		System.out.println("外部类成员方法");
	}
	/*//定义成员内部类Inner
	class Inner{
		int n=1;
		//定义内部类方法，访问外部类成员变量和方法
		void show1() {
			System.out.println("外部类成员变量m="+m);
			test1();
		}
		void show2() {
			System.out.println("内部类成员方法");
		}
	}*/
	static class Inner{
		int n=1;
		//定义静态内部类方法
		void show1() {
			System.out.println("外部类成员变量m="+m);
			test1();
		}
		void show2() {
			System.out.println("内部类成员方法");
		}
	}
	//定义外部类方法，访问内部类变量和方法
	void test2() {
		//局部内部类，一个方法体内部的类
		class Inner{
			int n=1;
			//定义内部类方法，访问外部类成员变量和方法
			void show1() {
				System.out.println("外部类成员变量m="+m);
				test1();
			}
			void show2() {
				System.out.println("内部类成员方法");
			}
		}
		Inner inner=new Inner();
		System.out.println("内部类成员变量n="+inner.n);
		inner.show2();
	}
}
public class E18 {

	public static void main(String[] args) {
		Outer outer=new Outer();
		Outer.Inner inner=new Outer.Inner();
		outer.test2();
		inner.show1();

	}

}

package com.inner;

import javax.print.attribute.PrintJobAttributeSet;

@FunctionalInterface
interface Calcable{
	int calc(int num);
}
//math类已经实现了calcable接口
class Math{
	public static int abs(int num) {
		if (num>=0) {
			return num;
		}else {
			return -num;
		}
	}
}
public class E24 {

	public static void main(String[] args) {
		Printabs(-50,n->Math.abs(n));
		Printabs(-40,Math::abs);
	}

	private static void Printabs(int i, Calcable c) {
		System.out.println(c.calc(i));
	}

}

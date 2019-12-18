package com.jjj;

public class Feiponaqie {
	public static int f(int n) {
		if(n==1) {
		return 0;
		}
		if(n==2) {
			return 1;
		}
		return f(n-1)+f(n-2);
	}
	public static void main(String[] args) {
		System.out.println("斐波那契数列第六个元素是"+f(6));

	}

}

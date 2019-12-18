package com.jjj;

public class E01 {

	public static void main(String[] args) {
		//自动类型转换:隐式类型转换 从小类型到大类型
		byte b=3;
		int i=b;
		System.out.println(i);
		
		int i1=3;
		byte b1=(byte) i1;
		System.out.println(b1);
		

	}

}

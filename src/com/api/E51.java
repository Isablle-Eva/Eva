package com.api;


public class E51 {

	public static void main(String[] args) {
		//创建一个空的字符串
		String str1=new String();
		//创建一个类容为abc的字符串
		String str2=new String("abc");
		char[] charArray=new char[] {'a','b','c'};
		String str3=new String(charArray);
		System.out.println("a"+str1+"b");
		System.out.println(str2);
		System.out.println(str3);

	}

}

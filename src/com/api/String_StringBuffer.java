package com.api;

public class String_StringBuffer {

	public static void main(String[] args) {
		String s1="abc";
		String s2="abc";
		//equals是比较相等的方法
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
		StringBuffer sb1=new StringBuffer("abc");
		StringBuffer sb2=new StringBuffer("abc");
		System.out.println(sb1.equals(sb2));  
		System.out.println(sb1==sb2);
	}
//string类是final的，一旦初始化不能做任何修改
//stringbuffer类可以做曾删改操作

}

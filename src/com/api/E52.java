package com.api;

public class E52 {

	public static void main(String[] args) {
		String s="abcabcbacdba";
		//字符串可以看成是多个字符组成的字符数组
		System.out.println("字符串的长度为："+s.length());
		System.out.println("字符串中第一个字符"+s.charAt(0));
		System.out.println("字符c第一次出现的位置"+s.indexOf('c'));
		//'a'=97  'A'=65  '0'=48
		System.out.println("字符最后一次出现的位置"+s.lastIndexOf('c'));
		System.out.println("子字符串第一次出现的位置："+s.indexOf("ab"));
		//java方法命名一般采用驼峰命名原则，第一个英语单词首字母小写
		//后面每个英文单词的首字母都是大写
		System.out.println("子字符串最后一次出现的位置"+s.lastIndexOf("ab"));
		
		
	}

}

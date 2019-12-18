package com.api;

public class E_54 {

	public static void main(String[] args) {
		String s="  http//localhost:8080    ";
		System.out.println("去除字符串两端空格后的结果:"+s.trim());
		System.out.println("去除字符串所以空格后的结果:"+s.replace(" "," "));
		//第一个斜杠是为了表示第二个斜杠是一个斜杠
		System.out.println("字符串去掉所以空格以后是"+s.replaceAll("\\S+"," "));
	}

}

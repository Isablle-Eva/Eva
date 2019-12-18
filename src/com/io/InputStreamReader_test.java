package com.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InputStreamReader_test {

	public static void main(String[] args) throws Exception {
		//定义标准字节输入流
		//InputStream jpsr=System.in;
		//将标准字节输入流转换成字符流
		//InputStreamReader ir=new InputStreamReader(jpsr);
		//将字符流包装成缓冲字符流
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("自我介绍：");
		String line=br.readLine();
		System.out.println(line);
		int i=1;
	while(line!="退出") {
		if(i==1) {
			System.out.println("请输入您的姓名:");
			line=br.readLine();
			System.out.println("您叫"+line);
		}else if(i==2) {
			System.out.println("请输入您的年龄:");
			line=br.readLine();
			int age=Integer.parseInt(line);
			System.out.println("您明年将是"+(age+1)+"岁");
		}
		i++;
	}
	}

}

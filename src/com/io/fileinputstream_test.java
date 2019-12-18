package com.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.jjj.text;

public class fileinputstream_test {

	public static void main(String[] args) throws Exception {
		//创建一个文件字节输入流来读取文件
	 FileInputStream fin=new FileInputStream("test.txt");
	 FileOutputStream fout=new FileOutputStream("out.txt");
	 int b=fin.read();
	 while(b!=-1) {
		 System.out.print((char)b);
		 fout.write(b);
		 b=fin.read();
	 }
	//将字符串转化为字节数组进行写入操作
	 fout.write(",come on!".getBytes());
	 //关闭流
	 fout.close();
	 fin.close();
	}

}

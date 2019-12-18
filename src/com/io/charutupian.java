package com.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.jjj.text;

public class charutupian {

	public static void main(String[] args) throws Exception {
		//创建一个文件字节输入流来读取文件
	 FileInputStream fin=new FileInputStream("d:\\2.3.jpg");
	 FileOutputStream fout=new FileOutputStream("2.3.jpg");
	 //开始
	 long kssj=System.currentTimeMillis();
	 //添加字节缓冲
	 byte[]zjhc=new byte[1024];
	 int b=fin.read(zjhc);
	 while(b!=-1) {
		 fout.write(zjhc,0,b);
		 b=fin.read(zjhc);
	 }
	 //结束
	long jssj=System.currentTimeMillis();
	System.out.println("拷贝40kb的图片文件耗时"+(jssj-kssj)+"毫秒");
	 //关闭流
	 fout.close();
	 fin.close();
	}

}
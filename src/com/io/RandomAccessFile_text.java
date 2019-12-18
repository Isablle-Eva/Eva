package com.io;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFile_text {

	public static void main(String[] args) throws Exception {
		//rw可写可读
		RandomAccessFile raf=new RandomAccessFile("time.txt","rw");
		//字符型强制转换为数字型，文件次数每次数-1
		int time=Integer.parseInt(raf.readLine())-1;
		if(time>0) {
			System.out.println("你还可以尝试"+time+"次");
			//回到文件开始的位置
			raf.seek(0);
			//写
			raf.write((time+"").getBytes());
		}else {
			System.out.println("使用次数已用完");
		}
		raf.close();
	}

}

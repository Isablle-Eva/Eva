package com.io;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;

public class Channels_test {

	public static void main(String[] args) throws Exception {
		//从source文件夹里的图片复制到dest中
		RandomAccessFile infile=
				new RandomAccessFile("source/2.1.jpg","rw");
		//获取文件CharBuffer通道
		FileChannel inChannel=infile.getChannel();
		//创建RandomAccessFile对象，指定目标文件
		RandomAccessFile outfile=
				new RandomAccessFile("dest/dest.jpg","rw");
		//获取复制目标文件FileChannel通道
		FileChannel outChannel=outfile.getChannel();
		//使用transferto()方法进行整体复制
		long transferTo=inChannel.transferTo(0,inChannel.size(),outChannel);
		if(transferTo>0) {
			System.out.println("复制成功!");
		}
//关闭资源
		infile.close();
		inChannel.close();
		outfile.close();
		outChannel.close();
	}

}

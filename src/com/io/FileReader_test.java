package com.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class FileReader_test {

	public static void main(String[] args) throws Exception {
		FileReader fr=new FileReader("poem.txt");
		//添加poem文本文档
		FileWriter fw=new FileWriter("poem1.txt");
		char[]buff=new char[2048];
		int b=fr.read(buff);
		//录入数据
		//fw.write("再别康桥\r\n");
		//fw.write("/t-----徐志摩\r\n");
		//fw.write("\r\n");
		
		while(b!=-1) {
			//System.out.println((char)b);
			fw.write(buff,0,b);
			b=fr.read();
		}
		fr.close();
		fw.close();
	}

}

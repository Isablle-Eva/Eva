package com.net;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClient {

	public static void main(String[] args) throws Exception {
		//创建客户端套接字要带上服务器的IP地址和端口
		Socket khdtjz=new Socket("10.2.103.31",8899);
		//通过客户端套接字获取写入网络的输出流
		OutputStream os=khdtjz.getOutputStream();
		//定义要上传的文件输入流
		FileInputStream fin=new FileInputStream("d:\\1.jpg");
		//通过文件输入流读取文件，并写入网络
		byte[]zjhc=new byte[1024];
		int b=fin.read(zjhc);
		while(b!=-1) {
			//通过套接字获得的输出流写入网络
			os.write(zjhc,0,b);
			b=fin.read(zjhc);
		}
		khdtjz.shutdownOutput();
		//通过客户端套接字获取网络上传来的输入流
		InputStream is=khdtjz.getInputStream();
		//将缓冲区中的内容读到输入流中，最后放到整型变量b中
		b=is.read(zjhc);
		while(b!=-1) {
			System.out.println(new String(zjhc,0,b));
			b=is.read(zjhc);
		}
		
		is.close();
		khdtjz.close();

	}

}

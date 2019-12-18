package com.net;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

	public static void main(String[] args) throws Exception{
		//创建服务器套接字
		ServerSocket fwqtjz=new ServerSocket(8899);
		//在死循环里不断监听
		while(true) {
			//获取客户端套接字
			Socket khdtjz=fwqtjz.accept();
			//现在对每个客户端创建一个线程
			new Thread(()-> {
			try {
				//通过客户端套接字获取客户端的IP地址
				String ip=khdtjz.getInetAddress().getHostAddress();
				//通过客户端套接字获取客户端的端口号
				int port=khdtjz.getPort();
				System.out.println("和客户端ip地址是"+ip+",端口是"+port+"连接上了");
				InputStream is;
				is=khdtjz.getInputStream();
				byte[]zjhc=new byte[1024];
				//定义文件输出流
				FileOutputStream fout=new FileOutputStream("d:\\upload\\"+ip+".jpg");
				//将缓冲区中的内容读入到输入流中，最后放到整型变量b中
				int b=is.read(zjhc);
			while(b!=-1) {
				//将字节缓冲信息写入文件
				fout.write(zjhc,0,b);
				b=is.read(zjhc);
			}
			String xinxi="文件上传成功";
			zjhc=new byte[1024];
			//通过客户端套接字获取输出流
			OutputStream os=khdtjz.getOutputStream();
			//通过输出流写入到网络中
			os.write(xinxi.getBytes("UTF-8"));
			os.close();
			khdtjz.close();
				}catch(IOException e) {
					e.printStackTrace();
				}
			}).start();
		}
	}
}

package com.net.chat;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ChatReceiver implements Runnable {
	private DatagramSocket ds;
	public ChatReceiver(DatagramSocket client) {
		this.ds=client;
	}



	@Override
	public void run() {
		//定义一个缓冲数组用于接受数据
				byte[] buf=new byte[1024];
				//定义一个数据对象，用于封装接受数据
				DatagramPacket dp=new DatagramPacket(buf, buf.length);
				//在死循环里不断接收数据
				while(true) {
					try {
						ds.receive(dp);
					//构造获得的二进制数据，转换为String
					String xinxi=new String(dp.getData(),0,dp.getLength());
					//将获得的信息展示在控制台中
					System.out.println(xinxi);
					} catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
					}
				}
					

	}

}

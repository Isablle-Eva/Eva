package com.net.chat;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class ChatSender implements Runnable {
private DatagramSocket ds;
private int port;
	public ChatSender(DatagramSocket ds, int port) {
		this.ds=ds;
		this.port=port;
	}

	@Override
	public void run() {
		Scanner sc=new Scanner(System.in);
		while(true) {
			
			byte[] zjsz;
			try {
				System.out.println("我说:");
				String str=sc.nextLine();
			zjsz=str.getBytes("UTF-8");
			System.out.println("这条信息要发送给哪个IP:");
			String ip=sc.nextLine();
				//创建要发送的数据报
				DatagramPacket dp=new DatagramPacket(zjsz, zjsz.length,InetAddress.getByName(ip),8900);
			
				//通过套接字发送数据报
				ds.send(dp);
				//关闭套接字
			} catch (Exception e) {
				// TODO: handle exception
			}
			}
		}

	}


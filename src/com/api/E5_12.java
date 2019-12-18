package com.api;

import java.io.IOException;

import javax.swing.text.rtf.RTFEditorKit;

public class E5_12 {

	public static void main(String[] args) throws IOException, InterruptedException {
		Runtime rt=Runtime.getRuntime();
			System.out.println("处理器的个数："+rt.availableProcessors()+"个");
			System.out.println("空闲内存大小："+rt.freeMemory()/1024/1024+"m");
			System.out.println("最大可用内存大小"+rt.maxMemory()/1024/1024+"m");
			
			Process jincheng=rt.exec("notepad");//应用记事本
			Thread.sleep(3000);//调用程序后休眠三秒
			jincheng.destroy();//调用jincheng
	}
	}

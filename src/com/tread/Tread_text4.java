package com.tread;
class TickWindow extends Thread{
	public TickWindow(String name) {
		super(name);
		// TODO 自动生成的构造函数存根
	}
	private int tickets=100;
	public void run() {
		while (true) {
			if (tickets>0) {
				System.out.println(Thread.currentThread().getName()+"正在发售"+tickets--+"张票");
			}
		}
	}
}
public class Tread_text4 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		new TickWindow("窗口1").start();
		new TickWindow("窗口2").start();
		new TickWindow("窗口3").start();
		new TickWindow("窗口4").start();
	}

}


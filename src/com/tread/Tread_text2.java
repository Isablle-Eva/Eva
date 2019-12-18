package com.tread;
class Mythread2 implements Runnable{
	public void run() {
		int i=0;
		while(i++<5) {
			System.out.println(Thread.currentThread().getName()+"的run()方法正在运行");
		}
	}
}
public class Tread_text2 {

	public static void main(String[] args) {
		Mythread2 mt1=new Mythread2();
		Thread t1=new Thread(mt1,"线程1");
		t1.start();
		Mythread2 mt2=new Mythread2();
		new Thread(mt2,"线程2").start();
		new Thread(new Mythread2(),"线程3").start();

	}

}

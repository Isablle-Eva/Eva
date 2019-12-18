package com.tread;
class DeadLockThread implements Runnable{
	static Object chopsticks=new Object();
	static Object knifeAndFork=new Object();
	private boolean flag;
	public DeadLockThread(boolean flag) {
		this.flag=flag;
	}
	@Override
	public void run() {
		if(flag) {
			while(true) {
				synchronized (chopsticks) {
					System.out.println(Thread.currentThread().getName()+"---if---chopsticks");
					synchronized (chopsticks) {
						System.out.println(Thread.currentThread().getName()+"---if---knifeAndFork");
					}
				}
			}
		}else {
			while(true) {
				synchronized (knifeAndFork) {
					System.out.println(Thread.currentThread().getName()+"---else---knifeAndFork");
					synchronized (chopsticks) {
						System.out.println(Thread.currentThread().getName()+"---else---chopsticks");
					}
				}
			}
		}
		
	}
	
}
public class Tread_text14 {

	public static void main(String[] args) {
		DeadLockThread thread1=new DeadLockThread(true);
		DeadLockThread thread2=new DeadLockThread(false);
		new Thread(thread1,"Chinese").start();
		new Thread(thread2,"American").start();
	}

}

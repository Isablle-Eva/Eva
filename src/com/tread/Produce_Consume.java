package com.tread;
import java.util.*;
public class Produce_Consume {
		public static void main(String[] args) {
		//定义一个集合类，模拟存储生产的商品
		List<Object>goods=new ArrayList<>();
		//记录线程执行前同意的起始时间start
		long start=System.currentTimeMillis();
		//创建一个生产者线程，用于生产商品并存入商品集合
		Thread thread1=new Thread(()-> {
			int num=0;
			while(System.currentTimeMillis()-start<30) {
				synchronized (goods) {
					if(goods.size()>0) {
						try {
							goods.wait();
						}catch(InterruptedException e) {
							e.printStackTrace();
						}
					}else {
						goods.add("商品"+ (++num));
				System.out.println("生产商品"+num);
					}
				}
				
			}
		},"生产者");
		//创建一个消费线程，同于消费商品并将商品呢从集合中删除
		Thread thread2=new Thread(()->{
			int j=0;
			while(System.currentTimeMillis()-start<30) {
				synchronized (goods) {
					if(goods.size()<0) {
							goods.notify();
						}else {
							goods.remove("商品"+ (++j));
							System.out.println("消费商品"+j);
						}
					}
				}
		},"消费者");
		//同时启动生产者和消费者两个线程,并同意执行100毫秒的时间
		thread1.start();
		thread2.start();
	}

}

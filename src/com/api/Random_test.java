package com.api;

import java.util.Random;

public class Random_test {

	public static void main(String[] args) {
		Random r=new Random();
		//生成[0,1)之间的浮点数
		System.out.println("随机生成一个[0,1)之间的浮点数"+Math.random());
		System.out.println("随机生成一个[0,1)之间的浮点数"+r.nextDouble());
		//生成整数
		System.out.println("随机生成一个-21亿到21亿之间个一个整数"+r.nextInt());
		System.out.println("随机生成一个10以内不包含10的一个整数"+r.nextInt(10));

	}

}

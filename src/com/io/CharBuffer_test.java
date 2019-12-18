package com.io;

import java.nio.CharBuffer;

public class CharBuffer_test {

	public static void main(String[] args) {
		//创建CharBuffer对象，并指定缓冲区容量大小为6
		CharBuffer cbf=CharBuffer.allocate(6);
		System.out.println("容量："+cbf.capacity());
		System.out.println("界限值："+cbf.limit());
		System.out.println("初始位置："+cbf.position());
		cbf.put('x');
		cbf.put('y');
		cbf.put('z');
		System.out.println("加入元素后的界限值:"+cbf.limit());
		System.out.println("加入元素后的位置:"+cbf.position());
		//执行flit（）方法
		cbf.flip();
		System.out.println("执行flit()后的界限值"+cbf.limit());
		System.out.println("执行flit()后的位置"+cbf.position());
		//取出第一个元素
		System.out.println("取出的第一个元素为"+cbf.get());
		System.out.println("取出后的界限值"+cbf.limit());
		System.out.println("取出后的位置"+cbf.position());
		//执行clear方法
		cbf.clear();
		System.out.println("执行clear()后的界限值："+cbf.limit());
		System.out.println("执行clear()后的位置："+cbf.position());
		//取出第一个元素
		System.out.println("取出的第一个元素为"+cbf.get());
		System.out.println("取出后的界限值"+cbf.limit());
		System.out.println("取出后的位置"+cbf.position());
	}

}

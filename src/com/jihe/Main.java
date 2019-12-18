package com.jihe;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Test test=new Test();
		ArrayList<Integer>arrayList=new ArrayList<Integer>();
		long kssj1=System.currentTimeMillis();
		//从头部插入元素时，每次后面的元素都要移动一个位置，消耗大量时间
		test.listInsert(arrayList);
		long jssj1=System.currentTimeMillis();
		System.out.println("数组列表头部插入15万个元素耗时"+(jssj1-kssj1)+"毫秒");
		
	
		LinkedList<Integer>LinkedList=new LinkedList<Integer>();
		long kssj2=System.currentTimeMillis();
		test.listInsert(LinkedList);
		long jssj2=System.currentTimeMillis();
		System.out.println("链表头部插入15万个元素耗时"+(jssj2-kssj2)+"毫秒");
		
		long kssj3=System.currentTimeMillis();
		test.listRead(arrayList);
		long jssj3=System.currentTimeMillis();
		System.out.println("数组列表尾部插入15万个元素耗时"+(jssj3-kssj3)+"毫秒");
		
		long kssj4=System.currentTimeMillis();
		test.listRead(LinkedList);
		long jssj4=System.currentTimeMillis();
		System.out.println("链表尾部插入15万个元素耗时"+(jssj4-kssj4)+"毫秒");
	}

}
class Test{

	public void listInsert(List<Integer> list) {
		for(int i=0;i<150000; i++) {
			list.add(0,1);
			

		}
		
	}
	public void listRead(List<Integer> list) {
		for(int i=150000-1;i>=0; i--) {
			list.get(i);
		}
}
	}

package com.jihe;

import java.util.ArrayList;
import java.util.Iterator;

public class Diedai {

	public static void main(String[] args) {
		ArrayList<String> arrayList=new ArrayList<String>();
		arrayList.add("stu1");
		arrayList.add("stu2");
		arrayList.add("stu3");
		arrayList.add("stu4");
	
		System.out.println("数组列表array的长度是"+arrayList.size());
		System.out.println("数组列表arrayList的第二个元素是"+arrayList.get(1));
		//使用跌代读取集合中的每个元素
		Iterator<String> diedai=arrayList.iterator();
		//hasNaxt判断是否有下一个元素
		while(diedai.hasNext()) {
			//next方法读取下一个元素
			String dgys=diedai.next();
			System.out.println(dgys);
		}
		System.out.println("使用foreach循环输出每个元素：");
		for(String mgys:arrayList) {
			System.out.println(mgys);
		}
		System.out.println("使用JDK8的foreach循环输出每个元素：");
		arrayList.forEach(obj->System.out.println(obj));
		
		System.out.println("利用迭代集合对象使用JDK8的foreach循环输出每个元素：");
		Iterator<String> diedai2=arrayList.iterator();
		diedai2.forEachRemaining(obj->System.out.println(obj));
	}
	

}

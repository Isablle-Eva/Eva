package com.jihe;

import java.util.ArrayList;
import java.util.HashSet;

public class Set_test {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("Tom");
		list.add("And");
		list.add("stu3");
		list.add("stu4");
		list.add("stu4");
		System.out.println("数组列表的输出");
		list.forEach(obj->System.out.println(obj));
		
//HashSet能够去掉重复元素,是因为HashSet里的元素已经重写了hashCode()方法以及equals()方法
		HashSet<String> hset=new HashSet<String>();
		hset.add(new String("stu1"));
		hset.add(new String("stu2"));
		hset.add(new String("stu3"));
		hset.add(new String("stu4"));
		hset.add(new String("stu4"));
		System.out.println("来自哈希集的输出");
		hset.forEach(obj->System.out.println(obj));
		//去掉HashSet里的元素
		hset.removeAll(hset);
		//HashSet能够去掉重复元素,是因为HashSet里的String类已经重写了hashCode()方法以及equals()方法
		HashSet<Integer> hset2=new HashSet<Integer>();
		hset2.add(1);
		hset2.add(2);
		hset2.add(3);
		hset2.add(4);
		hset2.add(5);
		hset2.add(6);
		hset2.add(6);
		System.out.println("来自哈希集的输出");
		hset.forEach(obj->System.out.println(obj));

	}

}

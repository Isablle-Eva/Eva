package com.jihe;

import java.util.ArrayList;
import java.util.LinkedList;

public class List_test {

	public static void main(String[] args) {
		//创建ArrayList集合
		ArrayList<String> list=new ArrayList<String>();
		//向集合中添加元素
		//<>是泛型，里面的类型是集合里元素类型
		//有两个类，前面一个是集合类，后面尖括号里的是集合里元素类型
		list.add("stu1");
		list.add("stu2");
		list.add("stu3");
		list.add("stu4");
	
		System.out.println("集合的长度:"+list.size());
		System.out.println("第二个元素是:"+list.get(1));
		
		
		LinkedList<String> linkedlist=new LinkedList<String>();
		linkedlist.add("stu1");
		linkedlist.add("stu2");
		linkedlist.add("stu3");
		linkedlist.add("stu4");

		System.out.println("链表linkedlist的长度:"+linkedlist.size());
		System.out.println("链表linkedlist的第二个元素是:"+linkedlist.get(1));
		
		//创建LinkedList集合
		LinkedList<Object> link=new LinkedList<>();
		//添加元素
		link.add("stu1");
		link.add("stu2");
		System.out.println(link);
		link.offer("offer");
		link.push("push");
		System.out.println(link);
		//获取元素
		Object object=link.peek();
		System.out.println(object);
		//删除元素
		link.removeFirst();
		link.pollLast();
		System.out.println(link);
	}

}

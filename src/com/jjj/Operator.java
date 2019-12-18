package com.jjj;

public class Operator {

	public static void main(String[] args) {
	int i=1;
	int j=1;
	System.out.println("后加 表达式i++="+(i++));
	System.out.println("先加 表达式++j="+(++j));
	System.out.println("不管先加还是后加以后变量都加了1,i="+i);
	System.out.println("不管先加还是后加以后变量都加了1,j="+j);
	//赋值运算符
	int a=2;
	a+=3;//等价于a=a+3
	System.out.println(a);
	//比较运算符
	String s1="hello";
	String s2="hello";
	E01 e1=new E01();
	E01 e2=new E01();
	System.out.println(s1==s2);
	System.out.println(e1==e2);
	}

}

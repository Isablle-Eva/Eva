package com.jjj;

public class T6 {
	public static void main(String[] args) {
		Overlade o1=new Overlade();
		 //针对求和方法的调用
		int sum1=Overlade.add(1,2);
		int sum2=Overlade.add(3,4,7);
		double sum3=Overlade.add(0.2,0.5);
		//打印求和结果
		System.out.println("sum1="+sum1);
		System.out.println("sum2="+sum2);
		System.out.println("sum3="+sum3);
	}
}

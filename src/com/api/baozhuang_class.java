package com.api;

public class baozhuang_class {

	public static void main(String[] args) {
		int a=20;
		Integer b=a;
		System.out.println(b);
		int c=b;
		System.out.println(c);

		String chengji="88";
		String chengji1=chengji+10;
		System.out.println("No.1:包装类valueOf方法--->"+Integer.valueOf(chengji)+10);
		System.out.println("No.1:包装类parseXXX方法--->"+Integer.parseInt(chengji));
		System.out.println("No.1:包装类的构造方法--->"+new Integer(chengji));
		
		String zs="88";
		System.out.println(chengji);
		System.out.println("No.1:包装类valueOf方法--->"+String.valueOf(zs));
		System.out.println("No.1:string类的tostring方法--->"+zs.toString());
		System.out.println("空串连接整数法--->"+chengji+" ");
	}

}

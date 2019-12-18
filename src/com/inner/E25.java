package com.inner;
//定义一个函数式接口
@FunctionalInterface//可打印的
interface Printable{
	void print(String str);
}
class StringUtils{
	public void printUpperCase(String str){
		System.out.println(str.toUpperCase());
	}
}
//定义测试类
public class E25 {
private static void printUpper(String text,Printable pt) {
	pt.print(text);
}
	public static void main(String[] args) {
		StringUtils su=new StringUtils();
		printUpper("Hello",t->su.printUpperCase(t));
		printUpper("World",su::printUpperCase);
	}

	

}

package com.ljhs;
class person{
	public void finalize() {
		System.out.println("董凯凯将被做为垃圾回收.....");
	}
}
public class E37 {
		public static void ljhs1(){
			person p1=new person();
			p1=null;
			int i=1;
			while(i<10) {
				System.out.println("方法一循环中.....");
				i++;
			}
		}
		public static void ljhs2() {
			person p2=new person();
			p2=null;
			System.gc();
			int i=1;
			while(i<10) {
				System.out.println("方法二循环中.....");
				i++;
			}
		}
	public static void main(String[] args) {
		ljhs1();
		System.out.println(".............");
		ljhs2();
	}

}

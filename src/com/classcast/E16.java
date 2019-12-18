package com.classcast;

interface Animal{
	void shout();
}
class laohu implements Animal{

	@Override
	public void shout() {
		System.out.println("饿虎咆哮.嗷呜..");
	}
	
	public void eatMan() {
		System.out.println("老虎咆哮");
		
	}
}

public class E16 {

	public static void main(String[] args) {
		Animal and1=new laohu();
		//判断and1这个对象是否是Tiger类的实例
		if(and1 instanceof laohu) {
			laohu laohu=(laohu) and1;
			laohu.shout();
			laohu.eatMan();
		}else {
			System.out.println("这个动物是老虎");
		}
	}

}

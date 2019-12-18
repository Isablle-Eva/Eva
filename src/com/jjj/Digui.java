package com.jjj;

public class Digui {
		public static int getsum(int n){
			if(n==1){
			return 1;
			}
			int temp=getsum(n-1);
			return temp+n;
		}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int sum=getsum(4);
		System.out.println("sum="+sum);
	}

}

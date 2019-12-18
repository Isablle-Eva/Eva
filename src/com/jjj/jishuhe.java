package com.jjj;

public class jishuhe {

	public static void main(String[] args) {
		//奇数和
			int sum=0;
			for(int i=1;i<100;i=i+2) {
				sum=sum+i;
			}
			System.out.println("sum="+sum);
			
			
		//偶数和
			/*int sum1=0;
			for(int i=0;i<100;i=i+2) {
				sum1=sum1+i;
			}
			System.out.println("sum1="+sum1);*/
			
			sum=0;
			int i=2;
			while(i<100) {
				sum=sum+i;
				i+=2;
			}
			System.out.println("100以内偶数的和是"+sum);
		//总和
			/*int sum2=0;
			for(int i=0;i<100;i=i+1) {
				sum2=sum2+i;
			}
			System.out.println("sum2="+sum2);*/	
	}



}

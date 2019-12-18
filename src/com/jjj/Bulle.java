package com.jjj;

public class Bulle {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[] array= {9,8,3,2,5,};
		System.out.println("这个数组的长度是"+array.length);
		for(int szys:array){
			System.out.print(szys+" ");
		}	
		System.out.println("");
		
			for(int i=1;i<array.length;i++) {
				for(int j=0;j<array.length-i;j++) {
					if(array[j]>array[j+1]) {
						int temp=array[j];
						array[j]=array[j+1];
						array[j+1]=temp;
					}
				}
			}
			for(int szys:array) {
				System.out.print(szys+" ");
			}
	}
}

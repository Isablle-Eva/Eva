package com.yichang;

public class E31 {
	
	public static void main(String[] args){
		int result;
		try {
			result=divide(4,0);
			System.out.println(result);
		} catch (Exception e) {
			System.out.println("捕获到的信息为:"+e.getMessage());
		}
		

	}
	

	private static int divide(int i, int j) throws Exception{
		if (j==0) {
			throw new Exception("除数不能为0");
		}
		int result=i/j;
		return result;
	}
	
}

package com.api;

public class E54 {

	public static void main(String[] args) {
		String s1="abc1a3b6cc我爱你祖国3b7a8nab1a5.jpg";
		System.out.println("这个字符里的数字是：");
		char[] zfsz=s1.toCharArray();
		for(char zf: zfsz) {
			if(zf>='0'&&zf<='9') {
				System.out.print(zf);
			}
		}
			System.out.println("\n这个字符串里的汉字是：");
			for(char zf:zfsz) {
				if(zf>='\u4E00'&&zf<='\u9FA5') {
					System.out.print(zf);
				}
			}

	}

}

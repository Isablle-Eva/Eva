package com.jjj;//package：包

/**Title:Helloworld
 * @author 张宝英
 *@version 1.0
 */
/*	
 * 紫色的代码是关键字
 * 褐色的代码是参数或者局部变量
 * 蓝色的代码是成员变量，他的变量比局部变量高，地位同成员方法一样
 * 黑色的代码是标识符：包名（com、rj182）、类名（string、system）
 * 				方法名（main、println）
 */
public class rj182 {

/**
 * 这是一个main（）方法入口
 *@param args 参数名
 */
 public static void main(String[] args) {//class:类；public:修饰符，表示公有的
	 	//static修饰符，表示静态的 void：空的，表明该方法没有返回值
		// TODO 自动生成的方法存根
			System.out.println("张宝英java基础.main()");
			/*定义一个整型变量x
			 * 将5赋值给变量x
			*/
			int x;
			x=5;
			System.out.println("");
			byte b=1;
			short s=1;
			int i=1;
			long l=1;
			
			float f=1.0f;//1.0是双精度浮点数长长度是64位，而float是32位
						//1.0f是单精度浮点数长度是32位
			double d=1.0;
			
			char c='a';//用单引号将字符常量括起来
			char ci=97;
			//short cc=(char)97;
			System.out.println(c);
			System.out.println(ci);
			//System.out.println(cc);
			
			boolean flag=false;
			flag=true;

			System.out.println("字节型整数数据的长度是"+Byte.SIZE);
			System.out.println("短整型整数数据的长度是"+Short.SIZE);
			System.out.println("整型整数数据的长度是"+Integer.SIZE);
			System.out.println("长整型整数数据的长度是"+Long.SIZE);
			
			System.out.println("单精度浮点型数据的长度是"+Float.SIZE);
			System.out.println("双精度浮点型数据的长度是"+Double.SIZE);
			
			System.out.println("字符型数据的长度是"+Character.SIZE);
			
			System.out.println("字节型整数数据的长度是"+Byte.MIN_VALUE+"-"+Byte.MAX_VALUE);
			System.out.println("短整型整数数据的长度是"+Short.MIN_VALUE+"-"+Short.MAX_VALUE);
			System.out.println("整型整数数据的长度是"+Integer.MIN_VALUE+"-"+Integer.MAX_VALUE);
			System.out.println("长整型整数数据的长度是"+Long.MIN_VALUE+"-"+Long.MAX_VALUE);
			
			System.out.println("单精度浮点型数据的长度是"+Float.MIN_VALUE+"-"+Float.MAX_VALUE);
			System.out.println("双精度浮点型数据的长度是"+Double.MIN_VALUE+"-"+Double.MAX_VALUE);
			
			System.out.println("字符型数据的长度是"+(int)Character.MIN_VALUE+"-"+(int)Character.MAX_VALUE);
			
			System.out.println("布尔型数据的长度是"+Boolean.TRUE+"-"+Boolean.FALSE);
	}
 		
}
package com.jjj;

import java.lang.invoke.SwitchPoint;

public class Condition {

	public static void main(String[] args) {
		/*int age=19;
		if(age<12) {
			System.out.println("此人是小可爱");
		}else if(age<18){
			System.out.println("此人是大可爱");
		}
		else {
			System.out.println("此人该结婚了");
		}*/
		
			int month=5;
			switch(month) {
			case 12:
			case 1:
			case 2:
			System.out.println("春季");
			break;
			case 3:
			case 4:
			case 5:
			System.out.println("夏季");
			break;
			case 6:
			case 7:
			case 8:
			System.out.println("秋季");
			break;
			case 9:
			case 10:
			case 11:
			System.out.println("冬季");
			break;
		}
	}
}
	


		 
	 


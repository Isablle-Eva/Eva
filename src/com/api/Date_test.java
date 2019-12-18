package com.api;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.YearMonth;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.function.LongToDoubleFunction;


public class Date_test {

	private static LocalDate Year;

	public static void main(String[] args) throws ParseException {
		Date date1=new Date();
		Date date2=new Date(System.currentTimeMillis());
		Date date3=new Date(System.currentTimeMillis()+1000);
		System.out.println(date1);
		System.out.println(date2);
		System.out.println(date3);
		
		SimpleDateFormat sdf=new SimpleDateFormat("Gyyyy年MM月dd日 HH:mm:ss E");
		//自定义格式化 年月日小时分钟秒 星期
		System.out.println(sdf.format(date1));
		
		Calendar rili=Calendar.getInstance();
		int year=rili.get(Calendar.YEAR);
		int month=rili.get(Calendar.MONTH)+1;
		int date=rili.get(Calendar.DATE);
		System.out.println("今天是"+year+"年"+month+"月"+date+"日");
		
		rili.add(Calendar.DATE,100);
		year=rili.get(Calendar.YEAR);
		month=rili.get(Calendar.MONTH)+1;
		date=rili.get(Calendar.DATE);
		System.out.println("100天以后"+year+"年"+month+"月"+date+"日");
		
		SimpleDateFormat sdf1=new SimpleDateFormat("yyyy-MM-dd");
		LocalDate lat=LocalDate.now();
		//用SDF1对象来解析当前日期加100天
		//simpleDateFormat:parse方法将字符串解析为date类的对象
		//simpleDateFormat:fromat方法将date类的对象格式化为字符串
		Date date4=sdf1.parse(""+lat.plusDays(100));
		SimpleDateFormat sdf2=new SimpleDateFormat("yyyy年M月d日");
		System.out.println("100以后是:"+sdf2.format(date4));
		
		System.out.println("今年是"+Year.now()+"年");
		
		SimpleDateFormat sdf3=new SimpleDateFormat("yyyy-MM");
		Date date5=sdf3.parse(""+YearMonth.now());
		SimpleDateFormat sdf4=new SimpleDateFormat("yyyy年MM月");
		System.out.println("当前年月是"+sdf4.format(date5));
		
		//输出系统时区
		ZoneId zoneId=ZoneId.systemDefault();
		System.out.println("当前系统时区是"+zoneId);
		
		//Instant：此刻以UTC为基准
		Instant instant=Instant.now();
		System.out.println("当前时间是："+instant);
		
	}

}

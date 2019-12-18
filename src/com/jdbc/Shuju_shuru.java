package com.jdbc;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Shuju_shuru {
	static Connection lianjie=null;
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		//通过驱动获得连接连接对象
		 lianjie=DriverManager
			.getConnection("jdbc:mysql://127.0.0.1:3306/jdbc","root","123123");
		File mulu=new File("d:\\tice2");
		File[] files=mulu.listFiles();
		System.out.println("一共有"+files.length+"个文件");
		for(File file : files) {
			System.out.println(file);
			if(file.getName().endsWith("xlsx")) {
				read_xlsx_and_write_to_db(file);
			}
			else if(file.getName().endsWith("xlsx")) {
				read_xls_and_write_to_db(file);
			}
			
		}
	}

	private static void read_xls_and_write_to_db(File file) throws Exception {
		FileInputStream fin=new FileInputStream(file);
		HSSFWorkbook workbook=new HSSFWorkbook(fin);
		HSSFSheet sheet=workbook.getSheet("Sheet1");
		int rows=sheet.getLastRowNum();
		System.out.println(rows);
		for(int i=0;i<rows;i++) {
			//读取每一行
			HSSFRow row=sheet.getRow(i);
			HSSFCell cell=row.getCell(3);
			String xuehao=cell.getStringCellValue();
			//找到第4个单元格
			HSSFCell cell20=row.getCell(19);
			HSSFCell cell21=row.getCell(20);
			if(cell20!=null&&cell21!=null) {
			
			String zuo_shili=cell20.getStringCellValue();
			System.out.println(zuo_shili);
			
			//读取这个单元格的值
			String you_shili=cell21.getStringCellValue();
			System.out.println(you_shili);
			
			//注册驱动
			//通过连接对象获得语句对象
			//Statement yuju=lianjie.createStatement();
			//获得预定义语句
			PreparedStatement ydy_yuju=lianjie.prepareStatement(""
					+"update sheet1 set`左眼裸眼视力`=?,`右眼裸眼视力`=? where `学号`=?");
			//绑定预定义语句的问号的值
			ydy_yuju.setString(1, zuo_shili);
			ydy_yuju.setString(2, you_shili);
			ydy_yuju.setString(3, xuehao);
			//通过语句对象执行sql
			ydy_yuju.executeUpdate();
		}
		}
		
	}

	private static void read_xlsx_and_write_to_db(File file) throws Exception {
		FileInputStream fin=new FileInputStream(file);
		XSSFWorkbook workbook=new XSSFWorkbook(fin);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		int rows=sheet.getLastRowNum();
		System.out.println(rows);
		for(int i=0;i<rows;i++) {
			//读取每一行
			XSSFRow row=sheet.getRow(i);
			//找到第4个单元格
			XSSFCell cell=row.getCell(3);
			//读取这个单元格的值
			String xuehao=cell.getStringCellValue();
			//System.out.println(xuehao);
			//找到第15行单元格
			XSSFCell cell20=row.getCell(19);
			XSSFCell cell21=row.getCell(20);
			if (cell20!=null&&cell21!=null) {
				
			
			//读取这个单元格的值
			String zuo=cell20.getStringCellValue();
			//System.out.println(zuo);
			//找到第16行单元格
			
			//读取这个单元格的值
			String you=cell21.getStringCellValue();
			//System.out.println(you);
			
			//注册驱动
			//通过连接对象获得语句对象
			//Statement yuju=lianjie.createStatement();
			//获得预定义语句
			PreparedStatement ydy_yuju=lianjie.prepareStatement(""
					+"update sheet1  set`左眼裸眼视力`=?,`右眼裸眼视力`=? where `学号`=?");
			//绑定预定义语句的问号的值
			ydy_yuju.setString(1, zuo);
			ydy_yuju.setString(2, you);
			ydy_yuju.setString(3, xuehao);
			//通过语句对象执行sql
			ydy_yuju.executeUpdate();
		}
		}

	}
		
	}

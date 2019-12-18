package com.jdbc;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Input_text {

	public static void main(String[] args) throws Exception {
	File file=new File("d:\\tice");
	File[] wenjian_jihe=file.listFiles();
	System.out.println(wenjian_jihe.length);
	for(File file2 : wenjian_jihe) {
		System.out.println(file2);
	if(file2.getName().endsWith("xlsx")){
		//调用dwj方法，将数据录入到数据库
		dqbxrmgwj_xlsx(file2);
	}else if(file2.getName().endsWith("xls")) {
		dqbxrmgwj_xlsx(file2);
	}
}
	}
	
	public static void dqbxrmgwj_xlsx(File wjm) throws Exception {
		FileInputStream fin=new FileInputStream(wjm);
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
			XSSFCell cell16=row.getCell(15);
			//读取这个单元格的值
			String zuo=cell16.getStringCellValue();
			//System.out.println(zuo);
			//找到第16行单元格
			XSSFCell cell17=row.getCell(16);
			//读取这个单元格的值
			String you=cell17.getStringCellValue();
			//System.out.println(you);
			
			//注册驱动
			Class.forName("com.mysql.jdbc.Driver");
			//通过驱动获得连接连接对象
			Connection lianjie=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/jbdc?characterEncoding=utf8","root","123123");
			//通过连接对象获得语句对象
			//Statement yuju=lianjie.createStatement();
			//获得预定义语句
			PreparedStatement ydy_yuju=lianjie.prepareStatement(""
					+"update 18rj2 set`左眼裸眼视力`=?,`右眼裸眼视力`=? where `学号`=?");
			//绑定预定义语句的问号的值
			ydy_yuju.setString(1, zuo);
			ydy_yuju.setString(2, you);
			ydy_yuju.setString(3, xuehao);
			//通过语句对象执行sql
			ydy_yuju.executeUpdate();
		}

	}

}




package com.jdbc;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.mysql.jdbc.Field;

public class Input_shili {
	static Connection lianjie=null;
	public static void main(String[] args) throws Exception{
		//注册驱动
		lianjie =DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/jdbc?characterEncoding=utf8","root","123456");
		Class.forName("com.mysql.jdbc.Driver");
		//通过驱动获取连接连接对象
		File file=new File("E:\\tice");
		File[] wenjian_jihe=file.listFiles();
		System.out.println(wenjian_jihe.length);
		for(File file2:wenjian_jihe) {
			System.out.println(file2);
			//调用dwj方法，将数据录入数据库
			if (file2.getName().endsWith("xlsx")) {
				duqu_xlsx(file2);
			} else {
				duqu_xlsx(file2);
			}
			dwj(file2);
		}

	}

	private static void duqu_xlsx(File file2) throws IOException,ClassNotFoundException,SQLException{
		// TODO 自动生成的方法存根
		FileInputStream fin=new FileInputStream("shili.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fin);
		XSSFSheet sheet=workbook.getSheet("sheet1");
		int rows=sheet.getLastRowNum();
		for(int i=1;i<=rows;i++) {
			
		}
	}

	private static void dwj(File wjm) throws Exception{
		FileInputStream fin=new FileInputStream("shili.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fin);
		XSSFSheet sheet =workbook.getSheet("Sheet1");
		int rows=sheet.getLastRowNum();
		for (int i=1;i<=rows;i++) {
			//读取每一行
			XSSFRow row=sheet.getRow(i);
			//找到四个单元格
			XSSFCell cell=row.getCell(3);
			//读取这个单元格的值
			String xuehao=cell.getStringCellValue();
			if (xuehao.equals("学号")) {
				continue;
			}
			System.out.println(xuehao);
			//找到第16个单元格
			XSSFCell cell17=row.getCell(16);
			//读取这个单元格的值
			String you_shili=cell17.getStringCellValue();
			String zuo_shili=cell17.getStringCellValue();
			//System.out.println(you_shili);
			// 注册驱动
			Class.forName("com.mysql.jdbc.Driver");
			//通过驱动获取连接连接对象
			Connection lianjie= DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/jdbc?characterEncoding=utf8","root","123456");
			//通过连接对象获得语句对象
			//Statement yuju=lianjie.createStatement();
			//获得预定义语句
			if (zuo_shili != null && you_shili != null) {
				//3.创建PreparedStatement语句
			PreparedStatement ydy_yuju=lianjie.prepareStatement(""
					+"update 18rj2 set``=?,``=? where``=?");
			//绑定预定义语句的问号
			ydy_yuju.setString(1, zuo_shili);
			ydy_yuju.setString(2, you_shili);
			ydy_yuju.setString(3, xuehao);
			//通过语句对象执行sql
			ydy_yuju.executeUpdate();
			}
		
		}
		
	}

}

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

public class Input_shili {
static Connection lianjie=null;
	public static void main(String[] args) throws Exception {
		//注册驱动
		Class.forName("com.mysql.jdbc.Driver");
		//获得连接
		Connection lianjie=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/jdbc?characterEncoding=utf8","root","123456");
		File file=new File("d:\\tice");
		File[] wenjian_jihe=file.listFiles();
		System.out.println(wenjian_jihe.length);
		for (File file2 : wenjian_jihe) {
			System.out.println(file2);
			
			//调用dwj方法，将数据录入到数据库
			
		}
	}
	public static void dwj(File wjm) throws Exception{
		
		FileInputStream fin=new FileInputStream(wjm);
		XSSFWorkbook workbook=new XSSFWorkbook(fin);
		XSSFSheet	sheet=workbook.getSheet("Sheet1");
		int rows=sheet.getLastRowNum();
		
		for (int i=0;i<rows;i++) {
			//读取每一行
			XSSFRow row=sheet.getRow(i);
			//找到第4个单元格
			XSSFCell cell=row.getCell(3);
			//读取这个单元格的值
			String xuehao=cell.getStringCellValue();
			System.out.println(xuehao);
			
			XSSFCell cell16=row.getCell(19);
			//读取这个单元格的值
			String zuo_shili=cell16.getStringCellValue();
			System.out.println(zuo_shili);
			//找到这个单元格 
			XSSFCell cell17=row.getCell(20);
			//读取这个单元格的值
			String you_shili=cell17.getStringCellValue();
			System.out.println(you_shili);
			
			
			//通过连接对象获得语句对象
			//Statement yuju=lianjie.createStatement();
			//获得预定义语句
			if(zuo_shili != null && you_shili !=null) {
				
			//3.创建preparedStatement语句
			PreparedStatement ydy_yuju=lianjie
					.prepareStatement("update 18rj2 set `左眼裸眼视力`=?,`右眼裸眼视力`=? where `学号`=?");
			//绑定预定义语句的问号的值
			ydy_yuju.setString(1,zuo_shili);
			ydy_yuju.setString(2,you_shili);
			ydy_yuju.setString(3,xuehao);
			
			//定义更新sql语句
			//String sql="UPDATE 18rj2 SET `左眼裸眼视力`='"+zuo_shili+"',`右眼裸眼视力`='"+you_shili+"' WHERE `学号`='"+xuehao+"'";
			//System.out.println(sql);
			//通过语句对象执行sql
			//yuju.execute(sql);
			ydy_yuju.executeUpdate();
			}
		}
	}
}

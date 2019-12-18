package com.jihe;

import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;

import java.util.Properties;


public class Properties_test {

	public static void main(String[] args)throws IOException {
		Properties sxj=new Properties();
		sxj.load(new FileInputStream("d:\\test_properties"));
		sxj.forEach((k,v)->System.out.println(k+":"+v));
		FileOutputStream outputStream=new FileOutputStream("d:\\\\test_properties");
		sxj.setProperty("charset", "UTF-8");
		sxj.store(outputStream,"新增charset编码");
	}

}

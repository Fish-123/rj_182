package com.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import javax.print.attribute.standard.Finishings;
import javax.xml.ws.LogicalMessage;

public class FileInputStream_test {

	public static void main(String[] args) throws Exception {
		FileInputStream in=new FileInputStream("d:\\1.jpg");
		FileOutputStream out=new FileOutputStream("1.jpg");
		long kssj=System.currentTimeMillis();
		int b=0;
		byte[]zjhc=new byte[1024];
		long beginTime=System.currentTimeMillis();

		//String str="World";
		while((b=in.read(zjhc)) !=-1) {
			//System.out.print((char)b);
			out.write(zjhc,0,b);
		}
		long jssj=System.currentTimeMillis();
		System.out.println("花费时间为："+(jssj-kssj)+"毫秒");
		//System.out.println("拷贝40kB的图片文件耗时"+(jssj-kssj)+"毫秒");
		in.close();
		//out.write(str.getBytes());
		out.close();
	}

}

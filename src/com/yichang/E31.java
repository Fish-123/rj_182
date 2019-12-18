package com.yichang;

import org.omg.PortableInterceptor.AdapterManagerIdHelper;

public class E31 {
	public static int divide(int x,int y)throws Exception{
		if(y==0) {
			throw new Exception("除数不能为0");
		}
		int result=x/y;
		return result;
	}
	public static void main(String[] args) {
		int result;
		try {
			result = divide(4,0);
			System.out.println(result);
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
			
		}
		

	}

}

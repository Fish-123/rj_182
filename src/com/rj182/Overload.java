package com.rj182;

public class Overload {
	//方法重载：同一个类里面若干个方法的名字相同
	//返回值类型可能不同  参数个数可能不同  参数数据类型可能不同
	
	//第一个加法：两个整数相加
		public static int add(int x,int y) {
			return x+y;
		}
		//第二个加法：三个整数相加
		public static int add(int x,int y,int z) {
			return x+y+z;
		}
		//第三个加法：两个浮点数相加
		public static double add(double x,double y) {
			return x+y;
		}

	public static void main(String[] args) {
		//在静态方法里，只能调用本类的静态方法，不能调用非静态方法
		
		int sum1=add(1, 2);
		int sum2=add(3, 3,4);
		double sum3=add(0.5, 0.5);
		//
		System.out.println("sum1="+sum1);
		System.out.println("sum2="+sum2);
		System.out.println("sum3="+sum3);
		

	}

}

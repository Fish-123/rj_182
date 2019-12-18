package com.rj182;

public class T6 {
	public static void main(String[] args) {
		//在静态方法里，只能调用本类的静态方法，不能调用非静态方法
		Overload  o1=new Overload();
		
		int sum1=o1.add(1, 2);
		int sum2=o1.add(3, 3,4);
		double sum3=o1.add(0.5, 0.5);
		
		System.out.println("sum1="+sum1);
		System.out.println("sum2="+sum2);
		System.out.println("sum3="+sum3);
		

	}

}

package com.api;

public class E55 {

	public static void main(String[] args) {
		String s1="java";
		System.out.println("s1转成大写后是"+s1.toUpperCase());
		System.out.println("整数12转成字符串以后是"+String.valueOf(12));
		
		String s2="http://localhost:8080";
		System.out.println("字符串去掉两端的空格以后是"+s2.trim());
		System.out.println("字符串去掉所有的空格以后是"+s2.replace("",""));
		//第一个斜杠是为了表示第二个斜杠是一个斜杠
		System.out.println("字符串去掉所有的空格以后是"+s2.replace("\\s+",""));

	}

}

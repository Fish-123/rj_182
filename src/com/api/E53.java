package com.api;

public class E53 {

	public static void main(String[] args) {
		String s1="Starter";
		String s2="St";
		System.out.println("判断是否以字符串St开头"+s1.startsWith("St"));
		System.out.println("判断是否以字符串er结尾"+s1.endsWith("er"));
		System.out.println("判断是否包含符串ar"+s1.contains("ar"));
		System.out.println("判断字符串是否为空"+s1.isEmpty());
		System.out.println("判断两个字符串是否相等"+s1.equals("s2"));
		
		
		char[] zfsz=s1.toCharArray();
		for(int i=0;i<zfsz.length;i++) {
			char c=zfsz[i];
			if(i==zfsz.length-1) {
				System.out.println(c);
			}else
				System.out.print(c+",");
		}
		
		
		
	}

}

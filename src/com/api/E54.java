package com.api;

public class E54 {

	public static void main(String[] args) {
		String s="abc1我ab爱2cb3中ac7国db8a";
		System.out.println("这个字符里的数字是：");
		//将字符串打碎成字符数组
		char[] zfsz=s.toCharArray();
		//foreach循环：对于字符数组里的每个字符
		//冒号前面是集合或者数组里的单个元素，冒号后面是集合或者数组
		for (char zf:zfsz) {
			if(zf>'0'&&zf<='9') {
				System.out.print(zf);
			}
		}
		System.out.println("这个字符里的汉字是：");
		//将字符串打碎成字符数组
		
		//foreach循环：对于字符数组里的每个字符
		//冒号前面是集合或者数组里的单个元素，冒号后面是集合或者数组
		for (char zf:zfsz) {
			if(zf>='\u4E00'&&zf<='\u9FA5') {//\u4E00~\u9FA5(汉字编码)
				System.out.print(zf);
			}
		}
	}

}

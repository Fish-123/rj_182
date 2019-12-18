package com.jihe;

import java.util.ArrayList;
import java.util.HashSet;

public class Set_stet {

	public static void main(String[] args) {
		ArrayList<String> arrayList=new ArrayList<String>();
		arrayList.add("student1");
		arrayList.add("student2");
		arrayList.add("student3");
		arrayList.add("student4");
		arrayList.add("student4");
		System.out.println("来自数组列表的输出");
		arrayList.forEach(obj->System.out.println(obj));
		
		//HashSet能够去掉重复元素，是因为HashSet里的String已经重写了Object类的hashcode()以及equals()方法
		HashSet<String> hset=new HashSet<String>();
		hset.add("Jack");
		hset.add("Eve");
		hset.add("Rose");
		hset.add("Rose");
		hset.add("pete");
		System.out.println("来自哈希集的输出");
		hset.forEach(obj->System.out.println(obj));
		
		
		//HashSet能够去掉重复元素，是因为HashSet里的Integer类已经重写了Object类的hashcode()以及equals()方法
		hset.removeAll(hset);
		hset.add("1");
		hset.add("2");
		hset.add("3");
		hset.add("4");
		hset.add("5");
		hset.add("5");
		System.out.println("来自哈希集的输出");
		hset.forEach(obj->System.out.println(obj));
	}

}

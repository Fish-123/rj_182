package com.jihe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Juhe {

	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("马超");
		list.add("张飞");
		list.add("关羽");
		list.add("张小明");
		list.add("张天");
		list.add("张德功");
		list.add("黄忠");
		//把集合变成流
		Stream<String> liu=list.stream();
		liu.forEach(j->System.out.println(j));
		
		Stream<String> liu2=list.stream();
		Stream<String> liu3=liu2.filter(k->k.startsWith("张"));
		System.out.println("集合里所有姓张的人：");
		liu3.forEach(j->System.out.println(j));
		
		
		System.out.println("集合里第二个和第三个姓张的人：");
		list.stream().filter(k->k.startsWith("张")).skip(1).limit(2).forEach(j->System.out.println(j));
		
		System.out.println("集合里第二个和第三个姓张的人用,连接：");
		System.out.println(list.stream().filter(k->k.startsWith("张")).skip(1).limit(2).collect(Collectors.joining(",")));
	}

}

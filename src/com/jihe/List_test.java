package com.jihe;

import java.util.ArrayList;
import java.util.LinkedList;

public class List_test {

	public static void main(String[] args) {
		//<>是泛型，里面的类型是集合里元素的类型
		//有两个类，前面一个类是集合类，后面尖括号里的是集合里的元素类型
		ArrayList<String> list=new ArrayList<String>();
		list.add("student1");
		list.add("student2");
		list.add("student3");
		list.add("student4");
		//list.add(5);
		System.out.println("数组列表ArrayList的长度是："+list.size());
		System.out.println("数组列表ArrayList的第二个元素是："+list.get(1));
		
		
		LinkedList<String> linkedList=new LinkedList<String>();
		linkedList.add("student1");
		linkedList.add("student2");
		linkedList.add("student3");
		linkedList.add("student4");
		//list.add(5);
		System.out.println("链表linkedList的长度是："+linkedList.size());
		System.out.println("链表linkedList的第二个元素是："+linkedList.get(1));
		linkedList.add("stud1");
		linkedList.add("stud2");
		linkedList.offer("offer");
		linkedList.push("push");
		
		//arrayList.add(5);
		System.out.println("链表linkList的长度是"+linkedList.size());
		System.out.println("链表linkList的最后一个元素是"+linkedList.getLast());
		System.out.println("链表linkList的第一个元素是"+linkedList.getFirst());
		System.out.println(linkedList);
		
		String dygys=linkedList.peek();
		System.out.println("链表linkedList的第一个元素是"+dygys);
		
		
		linkedList.removeFirst();
		linkedList.pollLast();
		System.out.println(linkedList);
		
		
		
		
		

	}

}

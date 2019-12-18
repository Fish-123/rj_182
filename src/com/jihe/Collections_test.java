package com.jihe;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Collections_test {

	public static void main(String[] args) {
		ArrayList<String>list=new ArrayList<>();
		Collections.addAll(list,"赵","钱","孙","李");
		System.out.println("排序前："+list);
		Collections.reverse(list);
		System.out.println("反转后："+list);
		Collections.sort(list);
		System.out.println("按自然顺序排序后"+list);
		Collections.addAll(list);
		System.out.println("按随机顺序排序后："+list);
		Collections.swap(list, 0, list.size()-1);
		System.out.println("集合首尾元素交换后："+list);
		
		ArrayList<Integer> list2=new ArrayList<>();
		Collections.addAll(list2,-3,2,9,5,8);
		System.out.println("集合中的元素:"+list);
		System.out.println("集合中的最大元素:"+Collections.max(list));
		System.out.println("集合中的最小元素:"+Collections.min(list));
		Collections.replaceAll(list2, 8, 0);
		System.out.println("替换后的集合："+list2);
		Collections.sort(list2);
		System.out.println("集合排序后为："+list2);
		int index=Collections.binarySearch(list2, 9);
		System.out.println("集合通过二分查找方法查找元素9所在角标为："+index);

	}

}

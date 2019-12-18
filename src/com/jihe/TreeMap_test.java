package com.jihe;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
class Mycomparator implements Comparator<Object>{

	@Override
	public int compare(Object o1, Object o2) {
		String key1=(String)o1;
		String key2=(String)o2;
		return key2.compareTo(key1);
	}

}	
public class TreeMap_test {

	public static void main(String[] args) {
		Map<String, String> tmap=new TreeMap<String, String>(new Mycomparator());
		tmap.put("2","John");
		tmap.put("1","Lucy");
		tmap.put("3","Smith");
		tmap.put("4","Aimee");
		tmap.put("5","Amanda");
		System.out.println("用键遍历双列集合的键和值");
		//将双列集合Map变成单列的键对象集合使用keySet()方法
		Set<String> jianji=tmap.keySet();
		Iterator<String> diedai=jianji.iterator();
		while (diedai.hasNext()) {
			Object key=(Object) diedai.next();
			Object value=tmap.get(key);
			System.out.println(key+":"+value);
		}

	}

}


	



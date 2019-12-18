package com.jihe;

import java.util.TreeSet;
class Teacher implements Comparable<Object>{
	String name;
	int age;
	public Teacher(String name,int age) {
		this.name=name;
		this.age=age;
	}
	
	@Override
	public String toString() {
		return name + ":" + age;
	}
	
	@Override
	public int compareTo(Object obj) {
		Teacher teacher=(Teacher)obj;
		return this.age-teacher.age;
	}
}


public class TreeSet_test1 {

	public static void main(String[] args) {
		TreeSet<Teacher> ts=new TreeSet<Teacher>();
		ts.add(new Teacher("张沃",21));
		ts.add(new Teacher("刘缺",23));
		ts.add(new Teacher("张风格",19));
		ts.add(new Teacher("张崎丰",20));
		System.out.println(ts);

	}

}

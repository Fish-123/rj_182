package com.jihe;

import java.util.HashSet;

class Person{
	String name;
	int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return name + ":" + age; 
	}
	
}
public class Z_test {

	public static void main(String[] args) {
		Person p1=new Person("刘刚",20);
		Person p2=new Person("张一航",21);
		Person p3=new Person("张森",19);
		HashSet<Person> h1=new HashSet<Person>();
		h1.add(p1);
		h1.add(p2);
		h1.add(p3);
		System.out.println(h1);

	}

}

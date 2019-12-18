package com.jhart;

public class Teacher extends Person{
	private String id;

	private String age;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public Teacher() {}
	
	public Teacher(String name, String age) {
		super();
		this.name = name;
		this.age = age;
	}
}
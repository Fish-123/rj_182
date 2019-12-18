package com.jhart;

import java.io.Serializable;

public class Person implements Serializable{
	public String sfzh;
	public String name;
	public String getSfzh() {
		return sfzh;
	}
	
	public Person(String sfzh, String name) {
		super();
		this.sfzh = sfzh;
		this.name = name;
	}
	public Person() {}
	public void setSfzh(String sfzh) {
		this.sfzh = sfzh;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

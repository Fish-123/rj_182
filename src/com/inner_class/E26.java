package com.inner_class;

import javax.print.attribute.standard.PrinterName;

@FunctionalInterface
interface personBuilder{
	Person buildPerson(String name);
}
class Person{
	private String name;
	public Person(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	
}
public class E26 {

	public static void main(String[] args) {
		PrinterName("刘刚",name->new Person(name));
		PrinterName("马云",Person::new);

	}

	private static void PrinterName(String name, personBuilder pb) {
		System.out.println(pb.buildPerson(name).getName());
		
	}

}

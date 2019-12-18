package com.chaper4;
class Animal{
	//Field：成员变量
	String name;
	//定义动物叫的方法
	void shout() {
		System.out.println("动物发出叫声");
	}
	
}
class Dog extends Animal{
	//继承了Animal类所有的成员变量和成员方法
	void shout() {
		System.out.println("汪汪");
	}
	public void printName() {
		System.out.println("name="+name);
	}
}
public class E01 {
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Dog dog=new Dog();
		dog.name="泰迪";
		dog.printName();
		dog.shout();

	}

}

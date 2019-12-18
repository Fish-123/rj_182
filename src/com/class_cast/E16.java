package com.class_cast;

interface Animal{
	void shout();

}
class Cat implements Animal{
	public void shout() {
		System.out.println("喵喵....");
	}
	public void catchMouse() {
		System.out.println("小猫抓老鼠");
	}
}
 class Dog implements Animal{
	public void shout() {
		System.out.println("汪汪...");
	}

	
}
public class E16 {

	public static void main(String[] args) {
		Animal an1 =new Dog();
		

		
		if(an1 instanceof Cat) {
			Cat cat1=(Cat) an1;
			cat1.shout();
			cat1.catchMouse();
		}else {
			System.out.println("该类型的对象不是Cat类型！");
		}
	}
}

package com.inner_class;
@FunctionalInterface
interface Animal{
	void shout();
}
@FunctionalInterface
interface Calculate{
	int sum(int a,int b);
}
class Cat implements Animal{

	@Override
	public void shout() {
		System.out.println("wangwang");
		
	}
	
}
public class E21 {

	public static void main(String[] args) {
		Cat cat=new Cat();
		cat.shout();
		//第二种方式
		animalShout(new Animal() {
			
			@Override
			public void shout() {
				System.out.println("miaomiao");
				
			}
		});
		//第三种方式用Lambda表达式实现
		animalShout(()->System.out.println("aoao..."));
		showSum(10,20,(x,y)->x+y);
	}
		


	private static void showSum(int i, int j, Calculate Calculate) {
		System.out.println(i+"+"+j+"的和为:"+Calculate.sum(i,j));
		
	}



	private static void animalShout(Animal animal) {
		animal.shout();
		
	}
}
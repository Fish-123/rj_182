package com.inner_class;
//定义内部类Outer
class Outer{
	static 	int m=0;
	void test1() {
		System.out.println("外部类成员方法");
	}
	static class Inner{
		int n=1;
		void show() {
			System.out.println("外部类静态变量m="+m);
			
		}
	}
	void test2(){
		class Inner{
		int n=1;
		void show() {
			System.out.println("外部类成员变量m="+m);
			
		}
	}
		Inner inner=new Inner();
		System.out.println("内部类成员变量n="+inner.n);
		inner.show();
	}
}

	

public class E18 {

	public static void main(String[] args) {
		Outer outer =new Outer();
		outer.test2();
		Outer.Inner inner=new Outer.Inner();
		inner.show();
	}

}

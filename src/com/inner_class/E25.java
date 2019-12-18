package com.inner_class;
@FunctionalInterface
interface Printable{
	void print (String str);
}
class StringUtils{
	public void printUpperCase(String str) {
		System.out.println(str.toUpperCase());
	}
	
}
public class E25 {

	public static void main(String[] args) {
		StringUtils stu=new StringUtils();
		printUpper("Hello",t->stu.printUpperCase(t));
		printUpper("world",stu::printUpperCase);
		

	}

	private static void printUpper(String str, Printable pt) {
		// TODO 自动生成的方法存根
		pt.print(str);
	}

}

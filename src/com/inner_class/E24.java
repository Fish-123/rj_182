package com.inner_class;

import javax.print.attribute.PrintJobAttributeSet;

@FunctionalInterface
interface Calcable{
	int calc(int num);
}
class Math{
	public static int abs(int num) {
		if (num>=0) {
			return num;
		}
		else {
			return -num;
		}
	}
}
public class E24 {

	public static void main(String[] args) {
		printAbs(-50,n->Math.abs(n));
		printAbs(-40,Math::abs);
	}

	private static void printAbs(int i, Calcable C) {
		
		System.out.println(C.calc(i));
		
	}

}

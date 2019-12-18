package com.leimingyingyunfangfa;



@FunctionalInterface
interface Printable{
	void print (StringUtils su, String str);
}
class StringUtils{
	public void printUpperCase(String str) {
		System.out.println(str.toUpperCase());
	}
	
}
public class E27 {

	public static void main(String[] args) {
		StringUtils stu=new StringUtils();
		printUpper(new StringUtils(),"Hello",(object,t)->object.printUpperCase(t));
		printUpper(new StringUtils(),"world",StringUtils::printUpperCase);
		

	}

	private static void printUpper(StringUtils su, String str, Printable pt) {
		pt.print(su,str);
		
	}

	

}

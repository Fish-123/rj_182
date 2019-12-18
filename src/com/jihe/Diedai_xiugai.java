package com.jihe;

import java.util.ArrayList;
import java.util.Iterator;

public class Diedai_xiugai {

	public static void main(String[] args) {
		ArrayList<String> arrayList=new ArrayList<String>();
		arrayList.add("student1");
		arrayList.add("student2");
		arrayList.add("student3");
		arrayList.add("student4");
		Iterator<String> diedai=arrayList.iterator();
		while (diedai.hasNext()) {
			String string=(String) diedai.next();
			if(string.equals("student2")) {
				diedai.remove();
				
			}
		}
		System.out.println(arrayList);
	}

}

package com.api;

import java.util.*;

public class System_test {

	public static void main(String[] args) {
		Properties shuxing=System.getProperties();
		System.out.println(shuxing);
		Set<String>shuxingming=shuxing.stringPropertyNames();
		for (String Key:shuxingming) {
			String value=System.getProperty(Key);
			System.out.println(Key+"--->"+value);
		}
	}

}

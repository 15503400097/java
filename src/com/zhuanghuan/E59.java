package com.zhuanghuan;

import java.util.*;

public class E59 {

	public static void main(String[] args) {
		Properties s1=System.getProperties();
		System.out.println(s1);
		Set<String> PropertyNames=s1.stringPropertyNames();
		for (String key : PropertyNames) {
			String value=System.getProperty(key);
			System.out.println(key+"--->"+value);
		}
	}

}

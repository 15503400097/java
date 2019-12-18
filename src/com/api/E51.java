package com.api;

public class E51 {

	public static void main(String[] args) {
		String str1="没有构造方法的初始化字符";
		String str2=new String("有构造方法切有初始化字符");
		String str3=new String();
		char [] sz= {'a','b','c','d'};
		String str4=new String(sz);
		System.out.println(str1);
		System.out.println(str2);
		System.out.println("ab"+str3+"c ");
		System.out.println(str4);
	}

}

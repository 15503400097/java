package com.zhuanghuan;

public class String_StringBuffer {

	public static void main(String[] args) {
		String s1="abc";
		String s2="abc";
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
		StringBuffer sb1=new StringBuffer("abc");
		StringBuffer Sb2=new StringBuffer("abc");
		System.out.println(sb1.equals(Sb2));
		System.out.println(sb1==Sb2);
	}

}

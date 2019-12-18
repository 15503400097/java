package com.zhuanghuan;

public class E55 {

	public static void main(String[] args) {
		String s1="java";
		System.out.println("字符串里的字符改为大写后:"+s1.toUpperCase());
		System.out.println("整数12改为String后的结果为："+String.valueOf(12));
		String s= "h  t tp  /  w ww .  ba  i du .c om";
		System.out.println("去掉前后空格后的结果为:"+s.trim());
		System.out.println("去掉所有空格后的结果为:"+s.replace(" ", ""));
		System.out.println("去掉所有空格后的结果为:"+s.replaceAll("\\S+", ""));
	}            

}

package com.runtime;

public class Pckage_class {

	public static void main(String[] args) {
		int a=20;
		Integer b=a;
		int c=b;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		String s="88";
		String s1=s+10;
		System.out.println(s1);
		System.out.println("NO.1:valueOf方法--->"+(Integer.valueOf(s)+10));
		System.out.println("NO.2:parseXXX方法--->"+(Integer.parseInt(s)+10));
		System.out.println("NO.3:构造方法--->"+(new Integer(s)+10));
		Integer zs=88;
		System.out.println("NO.1:valueOf方法--->"+String.valueOf(zs));
		System.out.println("NO.2:toString方法--->"+zs.toString());
		System.out.println("NO.3:构造方法--->"+" "+zs+"");
	}

}

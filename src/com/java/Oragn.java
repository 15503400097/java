package com.java;

public class Oragn {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int i=1;
		int j=1;
		System.out.println("后加:"+(i++));
		System.out.println("后加:"+(++j));
		System.out.println("不管先加后加都是:"+i);
		System.out.println("不管先加后加都是:"+j);
		int a=2; a+=3;
		System.out.println(a);
		String s1="hello";
		String s2="hello";
		E02 e1=new E02();
		E02 e2=new E02();
		System.out.println(s1==s2);
		System.out.println(e1==e2);
		
	}

}

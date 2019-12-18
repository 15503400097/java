package com.jhart;

public class Feibona {
	public static int add(int n) {
		if(n==1) {
			n=0;
			return n;
		}
		if(n==2) {
			n=1;
			return n;
		}
		n=add(n-1)+add(n-2);
		return n;
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int a=20;
		System.out.println("斐波那契数列第"+a+"个数是"+add(a));
	}

}

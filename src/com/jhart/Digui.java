package com.jhart;

public class Digui {
	public static int getSum(int n) {
		if (n==1) {
			return 1;
		}
		int temp=getSum(n-1);
		return temp+n;
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.println("1到1000的和为:"+getSum(1000));
	}

}

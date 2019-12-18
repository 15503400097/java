package com.java;

public class E_06 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int x=0,y=0,z=0;
		boolean a,b;
		a=x>0&y++>1;
		System.out.println("a="+a);
		System.out.println("y="+y);
		b=x>0&&z++>1;
		System.out.println("b="+b);
		System.out.println("z="+z);
		int x1=0,y1=0,z1=0;
		boolean a1,b1;
		a1=x1>=0 | y1++>1;
		System.out.println("a1="+a1);
		System.out.println("y1="+y1);
		b1=x1>=0||z1++>1;
		System.out.println("b1="+b1);
		System.out.println("z1="+z1);
		
		int store=115;
		System.out.println(store<=0?"没有库存了！":(store>100?"库存太多了！":"库存量为:"+store));
	}

}

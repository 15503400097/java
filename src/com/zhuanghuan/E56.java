package com.zhuanghuan;

public class E56 {

	public static void main(String[] args) {
		//substring截取
		String s="2019-10-12";
		System.out.println("今年是"+s.substring(0,4)+"年");
		System.out.println("今天是"+s.substring(5,7)+"月");
		System.out.println("今天是"+s.substring(8)+"日");
		//split分割
		String[] zfszs=s.split("-");
		System.out.println("今天是"+zfszs[0]+"年"+zfszs[1]+"月"+zfszs[2]+"日");
		
	}

}

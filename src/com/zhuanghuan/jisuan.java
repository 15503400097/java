package com.zhuanghuan;

public class jisuan {

	public static void main(String[] args) {
		long kssj=System.currentTimeMillis();
		int sum=0;
		for(long i=0;i<1000l;i++) {
			sum+=i;
		}
		long jssj=System.currentTimeMillis();
		System.out.println("0到100亿运行时间为:"+(jssj-kssj)+"毫秒");
	}

}

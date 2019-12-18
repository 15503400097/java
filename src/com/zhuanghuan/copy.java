package com.zhuanghuan;

public class copy {

	public static void main(String[] args) {
		int [] a= {1,2,3,4,5,6};
		int [] b= {75,887,878,74,445,857};
		System.arraycopy(a, 2, b, 0, 2);
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]+"  ");
		}
	}
	

}

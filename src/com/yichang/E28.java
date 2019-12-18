package com.yichang;

public class E28 {

	public static void main(String[] args) {
		try {
			int result=divide(4,0);
			System.out.println(result);
		} catch (Exception e) {
			System.out.println("捕获的运行时的异常信息为:"+e.getMessage());
		}
	
	}

	private static int divide(int i, int j) {
		int result=i/j;
		return result;
	}

}

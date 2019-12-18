package com.yichang;

public class E29 {

	public static void main(String[] args) {
		
			int result=divide(4,2);
			if(result==-1) {
			System.out.println("运行错误");
			}
			else {
				System.out.println(result);
			}
	
	}

	private static int divide(int i, int j) {
		try {
			int result=i/j;
			return result;
		} catch (Exception e) {
			System.out.println("捕获到运行时的异常"+e.getMessage());
		}finally {
			System.out.println("无论怎样都要执行finally语句");
		}
		return -1;
		
	}


	}



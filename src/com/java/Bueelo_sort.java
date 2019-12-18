package com.java;

public class Bueelo_sort {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[] arr = { 9, 8, 3, 5, 2 };
		System.out.println("这个数组的字节是" + arr.length);
		for (int szys:arr) {
			System.out.print(szys+ " ");
		 }
		System.out.println();
		for (int m = 1; m < arr.length; m++) {
			for (int n = 0; n < arr.length - m; n++) {
				if (arr[n] > arr[n + 1]) {
					int temp = arr[n];
					arr[n] = arr[n + 1];
					arr[n + 1] = temp;

				}

			}
		}
		for (int szys:arr) {
			System.out.print(szys + " ");
		}

	}
}

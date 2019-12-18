package com.abstract_;
import java.util.Arrays;
public class Arrays_test {

	public static void main(String[] args) {
	
		int[] arr= {9,8,3,5,2};
		System.out.print("排序前:");
		printArray(arr);
		Arrays.sort(arr);
		System.out.print("\n排序后:");
		printArray(arr);
		
		int index=Arrays.binarySearch(arr, 9);
		System.out.println("\n元素9在排序后得数组中得索引是："+index);	
		//拷贝数组
		int[] copied=Arrays.copyOfRange(arr, 1, 7);
		for (int i=0;i<copied.length;i++) {
			System.out.print(copied[i]+"");
		}
		//替换数组
		Arrays.fill(arr, 8);
		for(int i=0;i<arr.length;i++) {
			System.out.println(i+":"+arr[i]);
		}
	}
	private static void printArray(int[] arr) {
		// TODO 自动生成的方法存根
		System.out.print("[");
		for (int x=0;x<arr.length;x++) {
			if (x!=arr.length-1) {
				System.out.print(arr[x]+",");
	}
			else {
				System.out.print(arr[x]+"]");
				}
			}
		}
	}

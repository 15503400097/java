package com.thread;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Thread_test16 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		//创建第一个线程，从1加到10
		CompletableFuture<Integer> cf1=CompletableFuture.supplyAsync(()->{
			int sum=0;
			for(int i=1;i<11;i++) {
				sum+=i;
				System.out.println(Thread.currentThread().getName()+"线程正在执行加i"+i);
			}
			return sum;
		});
		//创建第二个线程，从11加到20
		CompletableFuture<Integer> cf2=CompletableFuture.supplyAsync(()->{
			int sum=0;
			for(int j=11;j<21;j++) {
				sum+=j;
				System.out.println(Thread.currentThread().getName()+"线程正在执行加i"+j);
			}
			return sum;
		});
		int total=cf1.get()+cf2.get();
		System.out.println("两个线程的和是："+total);
	}

}

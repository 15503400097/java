package com.thread;

import java.util.ArrayList;
import java.util.List;

public class Produce_Consume {

	public static void main(String[] args) {
		// 定义集合类，用来存储商品
		List<Object> goods=new ArrayList<Object>();
		//定义线程开始时间
		long start=System.currentTimeMillis();
		//创建生产者线程,并启动
		Thread t1=new Thread(()->{
			int i=0;
			while(System.currentTimeMillis()-start<50) {
				goods.add("商品"+(++i));
				System.out.println("生产商品"+i);
			}
		} ,"生产者线程");  
		//创建消费者线程，并启动
		Thread t2=new Thread(()->{
			int j=0;
			while(System.currentTimeMillis()-start<100) {
				synchronized (goods) {
					if (goods.size()<=0) {
						//唤醒线程
						goods.notify();
					}else {
						goods.add("商品"+(++j));
						System.out.println("消费商品"+j);
					}
				}
				
			}
		} ,"消费者线程");  
		//同时启动
		t1.start();
		t2.start();

	}

}

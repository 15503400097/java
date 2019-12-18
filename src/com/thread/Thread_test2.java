package com.thread;


class MyThread2 implements Runnable{
	public void run() {
		int i=0;
		while (i++<5) {
			System.out.println(Thread.currentThread().getName()+"的run()方法在运行");
		}
	}
}
public class Thread_test2{
	public static void main(String[] args) {
		MyThread2 mt1=new MyThread2();
		Thread t1=new Thread(mt1,"线程1");
		t1.start();
		MyThread2 mt2=new MyThread2();
		Thread t2=new Thread(mt2,"线程1");
		t2.start();
	}
}

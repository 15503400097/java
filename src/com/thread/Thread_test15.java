package com.thread;
//1.定义一个实现了Callable接口的线程类

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class MyThread6 implements Callable<Object>{
	@Override
	public Object call() throws Exception{
		int i=0; 
		while (i++<5) {
			System.out.println(Thread.currentThread().getName()+"的call()方法正在运行");
		}
		return i;
	}
}
public class Thread_test15 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// 2.创建Callable接口实现类的对象
		MyThread6 mt6=new MyThread6();
		//3.使用Excutors线程执行器创建可扩展的线程池
		ExecutorService pool=Executors.newCachedThreadPool();
		//4.将Callable接口实现类的对象提交到线程池进行管理
		Future<Object> result1=pool.submit(mt6);
		Future<Object> result2=pool.submit(mt6);
		//5.关闭线程池
		pool.shutdown();
		//6.对于有返回值的线程任务，获取执行结果
		System.out.println("thread-1返回结果"+result1.get());
		System.out.println("thread-2返回结果"+result2.get());
	}
}



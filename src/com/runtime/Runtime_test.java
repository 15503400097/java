package com.runtime;

import java.io.IOException;

public class Runtime_test {

	public static void main(String[] args) throws IOException, InterruptedException {
		Runtime rt=Runtime.getRuntime();
		System.out.println("本机的处理器个数为:"+rt.availableProcessors()+"个");
		System.out.println("空闲内存大小:"+rt.freeMemory()/1024/1024+"MB");
		System.out.println("最大可用内存:"+rt.maxMemory()/1024/1024+"MB");
		Process jincheng=rt.exec("notepad");
		Thread.sleep(3000);
		jincheng.destroy();
	}

}

package com.runtime;

import java.util.Random;

public class Random_test {

	public static void main(String[] args) {
		System.out.println("生成一个大于等于0小于60的随机值:"+(int)(Math.random()*60));
		Random t=new Random();
		System.out.println("生成一个大于等于0小于60的随机值:"+t.nextInt(60));
	}

}

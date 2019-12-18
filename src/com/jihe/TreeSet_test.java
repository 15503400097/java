package com.jihe;

import java.util.TreeSet;

public class TreeSet_test {

	public static void main(String[] args) {
		TreeSet<Integer> ts=new TreeSet<Integer>();
		ts.add(25);
		ts.add(17);
		ts.add(1);
		ts.add(8);
		ts.add(15);
		ts.add(11);
		ts.add(13);
		System.out.println("按TreeSet元素排列"+ts);
		System.out.println("TreeSet元素排列的首元素为"+ts.first());
		System.out.println("TreeSet元素小于等于9的最大元素是"+ts.floor(9));
		System.out.println("TreeSet元素大于等于9的最小元素是"+ts.higher(9));
		ts.pollLast();
		System.out.println("删除最后一个元素的TreeSet元素排列"+ts);
	}

}

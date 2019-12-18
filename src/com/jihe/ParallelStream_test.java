package com.jihe;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ParallelStream_test {

	public static void main(String[] args) {
		//创建一个LISI集合数据源
		List<String>list=Arrays.asList("张三","李四","张阳","李小明");
		//直接使用Collection接口的parallelStream()创建并行流
		Stream<String>parallelStream=list.parallelStream();
		System.out.println(parallelStream.isParallel());
		//创建一个Stream串行流
		Stream<String>stream=Stream.of("张三","李四","张阳","李小明");
		//直接使用BaseStream接口的parallel()方法将串行流转变成为并行流
		Stream<String>parallel=stream.parallel();
		System.out.println(parallel.isParallel());
	}

}

package com.IOliu;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class Files_test {

	public static void main(String[] args) throws IOException {
		// 定义一个目录路径的对象
		Path lujing=Paths.get("D:\\360Downloads333\\444");
		//用Files工具根据path对像创建多级目录
		Files.createDirectories(lujing);
		
		Path wj=Paths.get("D:\\360Downloads333\\444\\test.txt");
		//Files.createFile(wj);
		
		List<String> neirong=new  ArrayList<>();
		neirong.add("这是一个测试文件");
		//Files.write(wj, neirong, StandardOpenOption.APPEND);
		
		List<String> list=Files.readAllLines(wj);
		System.out.println("文件的内容"+list);
		System.out.println("文件大小为"+Files.size(wj)+"个字节");
	}

}

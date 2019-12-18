package com.IOliu;

import java.io.File;

public class FileList_test {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		File file=new File("E:\\");
		fileDir(file);
	}
	private static void fileDir(File file) {
		// TODO 自动生成的方法存根
		File[] listFiles=file.listFiles();
		for(File files:listFiles) {
			if(files.isDirectory()) {
				fileDir(files);
			}
			System.out.println(files);
		}
	}
}

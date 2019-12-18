package com.IOliu;

import java.io.File;
import java.util.Date;
import java.text.SimpleDateFormat;
public class File_test {
	public static void main(String[] args) {
		File file=new File("d:\\wq\\w.txt");
		System.out.println("文件名是:"+file.getName());
		System.out.println("文件的相对路径是："+file.getPath());
		System.out.println("文件的绝对路径是："+file.getAbsolutePath());
		System.out.println("文件的父路径是:"+file.getParent());
		System.out.println(file.canRead()?"文件可读":"文件不可读");
		System.out.println(file.canWrite()?"文件可写":"文件不可写");
		System.out.println(file.isFile()?"是一个文件":"是一个目录");
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
		System.out.println("最后修改时间是"+sdf.format(new Date(file.lastModified())));
		
	}

}

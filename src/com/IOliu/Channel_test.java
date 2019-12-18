package com.IOliu;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;

public class Channel_test {

	public static void main(String[] args) throws IOException {
		// TODO 自动生成的方法存根
		RandomAccessFile ywj=new RandomAccessFile("d:\\fds.zip","rw");
		FileChannel fc=ywj.getChannel();
		RandomAccessFile mbwj=new RandomAccessFile("d:\\fds2.zip","rw");
		FileChannel mbfc=mbwj.getChannel();
		long transferTo=fc.transferTo(0, fc.size(), mbfc);
		if(transferTo>0) {
			System.out.println("复制成功！");
		}
		ywj.close();
		fc.close();
		mbwj.close();
		mbfc.close();
	}

}

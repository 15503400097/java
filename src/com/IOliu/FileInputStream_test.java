package com.IOliu;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStream_test {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO 自动生成的方法存根
		 FileInputStream in=new FileInputStream("d://tp.jpg");
		 FileOutputStream fout=new FileOutputStream("tp.jpg");
		 long kssj=System.currentTimeMillis();
		 byte[]zjhc=new byte[2048];
		 int b=in.read(zjhc);
		 while (b!=-1) {
			// System.out.print((char)b);
			 fout.write(zjhc,0,b);
			 b=in.read(zjhc);
			
		}
		 long jssj=System.currentTimeMillis();
		 System.out.println("拷贝图片文件耗时"+(jssj-kssj)+"毫秒");
		 //fout.write(",come on".getBytes());
		 in.close();
		 fout.close();
	}

}

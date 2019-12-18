package com.net.chat;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClient {

	public static void main(String[] args) throws Exception {
		File wjj=new File("d:\\upload");
		File[] wjjh=wjj.listFiles();
		for(File wj:wjjh) {
			wj.getName();
		}
		
		//创建客户端套接字要带上服务器的IP地址和端口
		Socket khdtjz=new Socket("10.2.103.31",8899);
		//通过客户端套接字获取写入网络的输入流
		OutputStream os=khdtjz.getOutputStream();
		//定义要上传的文件输入流
		FileInputStream fin=new FileInputStream("d:\\1.jpg");
		//通过文件输入流读取文件，并写入网络
		byte[]zjhc=new byte[1024];
		int b=fin.read(zjhc);
		while (b!=-1) {
			//System.out.println((char)b);
			os.write(zjhc,0,b);
			b=fin.read(zjhc);
		}
		khdtjz.shutdownOutput();
		//通过客户端套接字获取网络上传来的输入流
		InputStream is=khdtjz.getInputStream();
		//将缓冲区中的内容读入到输入流中，最后放到整形变量b中
		b=is.read(zjhc);
		while(b!=-1) {
			//将字节缓冲信息转换成可以识别的字符串写到控制台
			System.out.println(new String(zjhc,0,b));
			b=is.read(zjhc);
		}
		is.close();
		khdtjz.close();

	}

}

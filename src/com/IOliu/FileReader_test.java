package com.IOliu;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReader_test {

	public static void main(String[] args) throws IOException {
		// TODO 自动生成的方法存根
		FileReader fr=new FileReader("d:\\poem.txt");
		FileWriter fw=new FileWriter("poem1.txt");
		char[]buff=new char[1024];
		int b=fr.read(buff);
		while (b!=-1) {
			fw.write(buff,0,b);
			b=fr.read(buff);
			
		}
		fr.close();
		fw.close();
	}

}

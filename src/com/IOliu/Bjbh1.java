package com.IOliu;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Bjbh1 {

	public static void main(String[] args) throws IOException {
		// TODO 自动生成的方法存根
		Path wj=Paths.get("D:\\班级信息.txt");
		Path bjmc=Paths.get("d:\\求班级编号.txt");
		Path bjbh=Paths.get("D:\\班级编号3.txt");
		List<String> neirong=new ArrayList<>();
		
		Files.createFile(bjbh);
		List<String> list=Files.readAllLines(wj);
		List<String> names=Files.readAllLines(bjmc);
		Map<String,String> map=new HashMap<>();
		for (String line:list) {
			String[] zfcsz=line.split("\t");
			map.put(zfcsz[1],zfcsz[0]);
		}
		for (String name:names) {
			neirong.add(map.get(name));
		}
		Files.write(bjbh, neirong,StandardOpenOption.APPEND);
	}

}

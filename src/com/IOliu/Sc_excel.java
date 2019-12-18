package com.IOliu;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class Sc_excel {

	public static void main(String[] args) throws IOException {
		// TODO 自动生成的方法存根
		HSSFWorkbook wb=new HSSFWorkbook();		
		HSSFSheet sheet=wb.createSheet("测试环境");
		HSSFRow row0=sheet.createRow(0);
		row0.createCell(0).setCellValue("年纪");
		row0.createCell(1).setCellValue("班级编号");
		row0.createCell(2).setCellValue("班级名称");
		row0.createCell(3).setCellValue("项目名称");
		row0.createCell(4).setCellValue("测试老师");
		row0.createCell(5).setCellValue("测试时间");
		row0.createCell(6).setCellValue("测试地点");
		row0.createCell(7).setCellValue("测试器材");
		row0.createCell(8).setCellValue("测试方式");
		Path bjxx=Paths.get("d:\\班级信息.txt");
		List<String> lines=Files.readAllLines(bjxx);
		int j=0;
		for (j=0;j<lines.size();j++) {
			String[] zfcsz=lines.get(j).split("\t");
		
		for (int i = j*10+1; i < j*10+11; i++) {
			HSSFRow rowi=sheet.createRow(i);
			rowi.createCell(0).setCellValue("42");
			rowi.createCell(1).setCellValue(zfcsz[0]);
			rowi.createCell(2).setCellValue(zfcsz[1]);
			 
			if (i%10==1) {
			rowi.createCell(3).setCellValue("身高");
			rowi.createCell(4).setCellValue("高家明");
			rowi.createCell(5).setCellValue("2019/10/29");
			rowi.createCell(6).setCellValue("体育馆");
			rowi.createCell(7).setCellValue("");
			rowi.createCell(8).setCellValue("2");
			}
			if (i%10==2) {
				rowi.createCell(3).setCellValue("体重");
				rowi.createCell(4).setCellValue("王大楠");
				rowi.createCell(5).setCellValue("2019/10/29");
				rowi.createCell(6).setCellValue("田径场");
				rowi.createCell(7).setCellValue("");
				rowi.createCell(8).setCellValue("1");
			}
			if (i%10==3) {
				rowi.createCell(3).setCellValue("体重");
				rowi.createCell(4).setCellValue("任小彦");
				rowi.createCell(5).setCellValue("2019/10/29");
				rowi.createCell(6).setCellValue("体育馆");
				rowi.createCell(7).setCellValue("");
				rowi.createCell(8).setCellValue("2");
			}
			if (i%10==4) {
				
				rowi.createCell(3).setCellValue("坐位体前驱");
				rowi.createCell(4).setCellValue("马大脚");
				rowi.createCell(5).setCellValue("2019/10/29");
				rowi.createCell(6).setCellValue("体育馆");
				rowi.createCell(7).setCellValue("");
				rowi.createCell(8).setCellValue("2");
			}
				
			if (i%10==5) {
					rowi.createCell(3).setCellValue("坐位体前驱");
					rowi.createCell(4).setCellValue("张宝强");
					rowi.createCell(5).setCellValue("2019/10/29");
					rowi.createCell(6).setCellValue("体育馆");
					rowi.createCell(7).setCellValue("");
					rowi.createCell(8).setCellValue("2");
			}
			if (i%10==6) {
					rowi.createCell(3).setCellValue("坐位体前驱");
					rowi.createCell(4).setCellValue("王滴滴");
					rowi.createCell(5).setCellValue("2019/10/29");
					rowi.createCell(6).setCellValue("体育馆");
					rowi.createCell(7).setCellValue("");
					rowi.createCell(8).setCellValue("2");
			}
			if (i%10==7) {
					rowi.createCell(3).setCellValue("跳远");
					rowi.createCell(4).setCellValue("马哈哈");
					rowi.createCell(5).setCellValue("2019/10/29");
					rowi.createCell(6).setCellValue("体育馆");
					rowi.createCell(7).setCellValue("");
					rowi.createCell(8).setCellValue("1");
			}
			if (i%10==8) {
					rowi.createCell(3).setCellValue("坐位体前驱");
					rowi.createCell(4).setCellValue("天赐");
					rowi.createCell(5).setCellValue("2019/10/29");
					rowi.createCell(6).setCellValue("体育馆");
					rowi.createCell(7).setCellValue("");
					rowi.createCell(8).setCellValue("4");
			}
			if (i%10==9) {
					rowi.createCell(3).setCellValue("身高");
					rowi.createCell(4).setCellValue("魏滴滴");
					rowi.createCell(5).setCellValue("2019/10/29");
					rowi.createCell(6).setCellValue("体育馆");
					rowi.createCell(7).setCellValue("");
					rowi.createCell(8).setCellValue("1");
			}
			if (i%10==0) {
					rowi.createCell(3).setCellValue("体重");
					rowi.createCell(4).setCellValue("盼盼");
					rowi.createCell(5).setCellValue("2019/10/29");
					rowi.createCell(6).setCellValue("体育馆");
					rowi.createCell(7).setCellValue("");
					rowi.createCell(8).setCellValue("1");		
			}	
		}
		}
		FileOutputStream fout=new FileOutputStream("d:\\测试模板.xls");
		wb.write(fout);
		fout.close();		
	}
}

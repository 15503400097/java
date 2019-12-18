package com.runtime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Year;
import java.time.YearMonth;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

public class Date_test {

	public static void main(String[] args) throws ParseException {
		System.out.println(System.currentTimeMillis()); 
		Date date1=new Date();
		Date date2=new Date(System.currentTimeMillis());
		Date date3=new Date(System.currentTimeMillis()+1000);
		System.out.println(date1);
		System.out.println(date2);
		System.out.println(date3);
		SimpleDateFormat gsh=new SimpleDateFormat("Gyyyy年MM月dd日 HH:mm:ss E");
		System.out.println(gsh.format(date1));
		Calendar rili=Calendar.getInstance();
		int year=rili.get(Calendar.YEAR);
		int month=rili.get(Calendar.MONTH)+1;
		int date=rili.get(Calendar.DATE);
		int hour=rili.get(Calendar.HOUR);
		int minute=rili.get(Calendar.MINUTE);
		int second=rili.get(Calendar.SECOND);
		System.out.println(""+year+"年"+month+"月"+date+"日"+hour+"时"+minute+"分"+second+"秒");
		
		
		 rili.add(Calendar.DATE, 100);
		 year=rili.get(Calendar.YEAR);
		 month=rili.get(Calendar.MONTH)+1;
		 date=rili.get(Calendar.DATE);
		 hour=rili.get(Calendar.HOUR);
		 minute=rili.get(Calendar.MINUTE);
		 second=rili.get(Calendar.SECOND);
		System.out.println("一百天之后是"+year+"年"+month+"月"+date+"日"+hour+"时"+minute+"分"+second+"秒");
		
		SimpleDateFormat gsh1=new SimpleDateFormat("yyyy-MM-dd");
		LocalDate ldf=LocalDate.now();
		//用gsh1对象来解析当前日期加100天
		//simpleDateFormat:parse方法将字符串解析为Date类的对象
		//simpleDateFormat:format方法将Date类的对象格式化化为字符串
		Date date4=gsh1.parse(""+ldf.plusDays(100));
		SimpleDateFormat gsh2=new SimpleDateFormat("yyyy年M月dd日");
		System.out.println("一百天之后是"+gsh2.format(date4));
		
		System.out.println("今年是"+Year.now()+"年");
		SimpleDateFormat gsh3=new SimpleDateFormat("yyyy-MM");
		Date date5=gsh3.parse(""+YearMonth.now());
		SimpleDateFormat gsh4=new SimpleDateFormat("yyyy年M月");
		System.out.println("当前年月是"+gsh4.format(date5));
	
		ZoneId zoneId=ZoneId.systemDefault();
		System.out.println("当前电脑的时区是"+zoneId);
		Instant instant=Instant.now();
		System.out.println("当前时间为"+instant);
	}

}

package com.java;

public class danxunhuan {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String[] qiudui= {"管理学院","音乐学院","设计学院","教育学院","演艺学院","中专部","饮食文化学院","轮空"};
		/*队伍 0 1 2 3 4 5
		 * 第一轮对阵
		 * 0vs5 1vs4 2vs3
		 * 第二轮对阵
		 * 最后一只队放在第一只队伍后面
		 * 0 5 1 2 3 4 
		 * 0vs4 5vs3 1vs2
		 * 第三轮对阵
		 * 最后一只队放在第一只队伍后面
		 * 0 4 5 1 2 3  
		 * 0vs3 4vs2 5vs1
		 * 第四轮对阵
		 * 最后一只队放在第一只队伍后面
		 * 0 3 4 5 1 2 
		 * 0vs2 3vs1 4vs5
		 * 第五轮对阵
		 * 最后一只队放在第一只队伍后面
		 * 0 2 3 4 5 1 
		 * 0vs1 2vs5 3vs4
		 */
		System.out.println("第九届江汉艺术职业学院篮球比赛对阵表");
		for (int i = 1; i < qiudui.length; i++) {
			System.out.println("第"+i+"轮");
			if(i>1){
				 int a =qiudui.length-1;
				 String stmep=qiudui[qiudui.length-1];
				 	for (; a>1; a--) 
				 		qiudui[a]=qiudui[a-1];
						
					
				 qiudui[1]=stmep;
				 
			}
			for (int j = 0; j < qiudui.length/2; j++) {
				
					System.out.println(qiudui[j]+"VS"+qiudui[qiudui.length-j-1]);
					
			
				
			}
			
		}
	}

}

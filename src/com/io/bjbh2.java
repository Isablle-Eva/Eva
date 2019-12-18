package com.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class bjbh2 {

	public static void main(String[] args) throws Exception {
		//定义一个文件的对象
				Path wj=Paths.get("D:\\班级信息.txt");
				Path bjmc=Paths.get("D:\\求班级编号.txt");
				Path bjbh=Paths.get("D:\\班级编号.txt");
				List<String> neirong=new ArrayList<>();
				Files.createFile(bjbh);
				//读取文件中的内容
				List<String>lines=Files.readAllLines(wj);
				List<String>names=Files.readAllLines(bjmc);
				
				Map<String,String>map=new HashMap<>();
				for(String line : lines) {
					String[] zfcsz=line.split("\t");
				}

	}

}

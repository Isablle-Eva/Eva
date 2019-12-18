package com.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class Files_test {

	public static void main(String[] args) throws Exception {
		//定义一个目录路径的对象
		Path lujing=Paths.get("D:\\360Downliads333\\44");
		//用Files工具类根据Path对象创建多级目录
		Files.createDirectories(lujing);
		//定义一个文件的对象
		Path wj=Paths.get("D:\\360Downliads333\\44\\test.txt");
		//用files工具类根据path对象创建文件
		//Files.createFile(wj);
		//向集合添加内容
		List<String> neirong=new ArrayList<>();
		neirong.add("这是张大可爱的文件");
		//把集合里面的内容写入文件
		//Files.write(wj,neirong,StandardOpenOption.APPEND);
		//读取文件中的内容
		List<String>list=Files.readAllLines(wj);
		System.out.println("文件的内容为"+list);
		System.out.println("文件的大小为"+Files.size(wj)+"字节");
	}

}

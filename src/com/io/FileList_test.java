package com.io;

import java.io.File;
import java.io.FileDescriptor;
import java.util.Arrays;

import javax.management.loading.MLet;

public class FileList_test {

	public static void main(String[] args) {
		File ml=new File("D:\\Favorites");
		fliedir(ml);

	}

	private static void fliedir(File ml) {
	File[]	wjsz=ml.listFiles();
	for(File file : wjsz) {
		if(file.isDirectory()) {
			FileDir(file);
		}else if(file.isFile()) {
			if(file.getName().endsWith(".txt"))
				System.out.println(file);
		}
	}
		
	}

	private static void FileDir(File file) {
		// TODO 自动生成的方法存根
		
	}

}

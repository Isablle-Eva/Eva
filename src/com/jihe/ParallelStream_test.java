package com.jihe;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ParallelStream_test {

	public static void main(String[] args) {
		//创建一个list集合数据源
		List<String>list=Arrays.asList("张三","李四","张晓明","张阳");
		//直接使用collection接口的parallelstream（）创建并行流
		Stream<String>parallelStream=list.parallelStream();
		System.out.println(parallelStream.isParallel());
		//创建一个stream串行流
		Stream<String>stream=Stream.of("张三","李四","张晓明","张阳");
		//使用basestream接口的parallel（）方法将串行流
		Stream<String>parallel=stream.parallel();
		System.out.println(parallel.isParallel());

	}

}

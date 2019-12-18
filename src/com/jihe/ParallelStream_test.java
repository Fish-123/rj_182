package com.jihe;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ParallelStream_test {

	public static void main(String[] args) {
		List<String>  list=Arrays.asList("张三","李四","张小明","张阳");
		Stream<String> parallelstream=list.parallelStream();
		System.out.println(parallelstream.isParallel());
		Stream<String> stream=Stream.of("张三","李四","张小明","张阳");
		Stream<String> parallel=stream.parallel();
		System.out.println(parallelstream.isParallel());
		
	}

}

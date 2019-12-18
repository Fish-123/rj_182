package com.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class Bjbh {

	public static void main(String[] args) throws Exception {
		//定义一个文件的对象
		Path wj=Paths.get("D:\\班级信息.txt");
		Path bjmc=Paths.get("D:\\求班级编号.txt");
		Path bjbh=Paths.get("D:\\班级编号.txt");
		List<String> neirong=new ArrayList<>();
		Files.createFile(bjbh);
		//读取文件中的内容
		List<String> lines=Files.readAllLines(wj);
		List<String> names=Files.readAllLines(bjmc);
		for (String name : names) {
			for (String line : lines) {
			String[] zfcsz=line.split("\t");
			if (name.equals(zfcsz[1])) {
				System.out.println(zfcsz[0]);
				neirong.add(zfcsz[0]);
			
			}
			//System.out.println("班级编号："+zfcsz[0]);
			//System.out.println("班级名称："+zfcsz[1]);
		}
		//System.out.println("文件的内容为"+lines);
		//System.out.println("文件的大小为"+Files.size(wj)+"个字节");
		
		}
		//把集合里的内容写入文件
		Files.write(bjbh, neirong, StandardOpenOption.APPEND);
	}

}

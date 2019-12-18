package com.io;

import java.io.File;
import java.io.FileDescriptor;
import java.util.Arrays;


public class FileList_test {

	public static void main(String[] args) {
		File ml=new File("E:\\java基础");
		FileDir(ml);
		}
	private static void FileDir(File file) {
		File[] wjsz=file.listFiles();
		//foreach
		for (File ml:wjsz) {
			if(file.isDirectory()) {
				FileDir(file);
			//String[] zml=ml.list((dir,name)->name.endsWith(".java"));
			//Arrays.stream(zml).forEach(f->System.out.println(f));
		}else if(file.isFile()) {
			if(file.isDirectory())
				System.out.println(file);
		}
		
	}

}
}
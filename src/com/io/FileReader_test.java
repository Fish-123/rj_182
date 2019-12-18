package com.io;


import java.awt.Frame;
import java.io.FileFilter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReader_test {

	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("d:\\pom1.txt");
		FileWriter fw=new FileWriter("pom1.txt");
		fw.write("轻轻的我走了，\r\n");
		fw.write("正如我轻轻的来；\r\n");
		fw.write("我轻轻的招手，\r\n");
		fw.write("作别西天的云彩。\r\n");
		char[] buff=new char[1024];
		int b=0;
		while(b!=-1) {
			fw.write(buff,0,b);
			b=fr.read(buff);
		}
		fr.close();
		fw.close();
	}

}

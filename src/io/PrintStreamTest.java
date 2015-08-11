package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamTest {
	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("E:\\workplace1\\review\\src\\io\\demo.txt");
		PrintStream ps = new PrintStream(fos);
		ps.print("普通字符串");
		ps.println(new PrintStreamTest());
		ps.close();
	}
}

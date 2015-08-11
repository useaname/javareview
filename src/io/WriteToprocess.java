package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class WriteToprocess {
	public static void main(String[] args) {
			PrintStream ps = null;
			
			try {
				//运行java ReadStandard 返回运行该命令的子进程
				Process p = Runtime.getRuntime().getRuntime().exec("java ReadStandard");
				//以p进程的输出流创建PrintStream对象
				//这个输出流对本程序是输出流,对p进程则是输入流
				ps = new PrintStream(p.getOutputStream());
				//向ReadStandard程序写入内容,江北ReadStandard读取
				ps.println("普通字符串");
				ps.println(new WriteToprocess());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				if (null != ps) {
					ps.close();
				}
			}
	}
}

class ReadStandard{
	public static void main(String[] args) {
		
		try {
			Scanner sc = new Scanner(System.in);
			PrintStream ps = new PrintStream(new FileOutputStream("out.txt"));
			sc.useDelimiter("\n");
			while (sc.hasNext()) {
				System.out.println("键盘输入的内容是:" + sc.next());
			}
			ps.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
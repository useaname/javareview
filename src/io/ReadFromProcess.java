package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadFromProcess {
	public static void main(String[] args) {
		BufferedReader br = null;	
		try {
			//运行javac命令,返回运行该命令的子进程
			Process p = Runtime.getRuntime().exec("javac");
			//以p进程的错误流创建BufferedReader对象
			//这个错误流对本程序是输入流,对p进程是输出流
			br = new BufferedReader(new InputStreamReader(p.getErrorStream(),"GBK"));
			String buff = null;
			//循环方式读取p进程的错误输出
			while ((buff = br.readLine()) != null) {
				System.out.println(buff);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
}

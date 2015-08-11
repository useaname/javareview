package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class RedirectOut {
	public static void main(String[] args) {
		
		PrintStream ps = null;
		
		try {
			//创建重定向需要的输出流
			ps = new PrintStream(new FileOutputStream("out.txt"));
			//将标准输出流重定向到ps输出流
			System.setOut(ps);
			//测试输出
			System.out.println("普通字符串");
			System.out.println(new RedirectOut());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (null != ps) {
				ps.close();
			}
		}
		
		
	}
}

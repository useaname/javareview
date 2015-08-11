package io;

import java.io.IOException;
import java.io.RandomAccessFile;

public class AppendContent {
	public static void main(String[] args) {
		
		RandomAccessFile raf = null;
		
		try {
			raf = new RandomAccessFile(".//src//io//out.txt", "rw");
			raf.seek(raf.length());
			raf.write("我是追加的内容\r\n".getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (null != raf) {
				try {
					raf.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
}

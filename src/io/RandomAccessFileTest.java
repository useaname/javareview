package io;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {
	public static void main(String[] args) {
		RandomAccessFile raf = null;
		try {
			raf = new RandomAccessFile(".//src//io//RandomAccessFileTest.java", "r");
			System.out.println("文件初始位置" + raf.getFilePointer());
			raf.seek(300);
			byte[] buf = new byte[1024];
			int hasRead = 0;
			while ((hasRead = raf.read(buf)) > 0) {
				System.out.println(new String(buf,0,hasRead));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (null != raf){
				try {
					raf.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
}

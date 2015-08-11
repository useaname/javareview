package test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class BufferedOutputStreamTest {
	public static void main(String[] args) {
		BufferedOutputStream bos = null;
		BufferedInputStream bis = null;
		byte[] bbuf = new byte[1024];
		int hasRead = 0;
		try {
			bis = new BufferedInputStream(new FileInputStream("E:\\workplace1\\review\\demo.txt"));
			//bos = new BufferedOutputStream(new FileOutputStream("E:\\workplace1\readfile.txt"));
			while ((hasRead = bis.read(bbuf))!= -1) {
				//bos.write(bbuf, 0, hasRead);
				System.out.println(new String(bbuf, 0, hasRead,"gbk"));
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

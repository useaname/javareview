package test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class InPutTest {
	public static void main(String[] args) {
		FileOutputStream fos = null;

		FileInputStream fis = null;

		byte[] cbuf = new byte[1024];
		int hasRead = 0;
		try {
			//新建输入流 读取文件
			fis = new FileInputStream("E:\\workplace1\\review\\src\\test\\InPutTest.java");
			//新建输出流 写入文件
			fos = new FileOutputStream("dddemo.txt");
			while ((hasRead = fis.read(cbuf)) > 0) {
				fos.write(cbuf, 0, hasRead);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}

package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;

public class InsertContent {
	public static void main(String[] args) throws IOException {
		insert(".//src//io//InsertContent.java",45,"插入的内容");
	}
	
	
	
	public static void insert(String fileName,long pos,String insertContent) throws IOException {
		RandomAccessFile raf = null;
		try {
			File tmp = File.createTempFile("tmp", null);
			FileOutputStream tmpOut = null;
			FileInputStream tmpIn = null;
			tmp.deleteOnExit();
			
			raf = new RandomAccessFile(fileName, "rw");
			tmpOut = new FileOutputStream(tmp);
			tmpIn = new FileInputStream(tmp);
			raf.seek(pos);
			/**
			 * 将插入点后的文件内容读入到临时文件中
			 */
			byte[] buf = new byte[64];
			
			int hasRead = 0;
			//循环读取插入点后的文件内容
			while ((hasRead = raf.read(buf)) > 0) {
				//将内容写入临时文件
				tmpOut.write(buf,0,hasRead);
			}
			//从新定位文件指针
			raf.seek(pos);
			//写入插入内容
			raf.write(insertContent.getBytes());
			//追加临时文件中的内容
			while ((hasRead = tmpIn.read(buf)) > 0) {
				raf.write(buf,0,hasRead);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (null != raf ) {
				raf.close();
			}
		}
	}
}

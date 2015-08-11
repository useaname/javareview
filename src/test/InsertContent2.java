package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.RandomAccessFile;

public class InsertContent2 {
	public static void main(String[] args) {
		insert(".//src//test//InsertContent2.java",30L,"ABC\r\n");
	}
	
	public static void insert(String fileName,long pos,String insertContent) {
		RandomAccessFile raf = null;
		try {
			raf = new RandomAccessFile(fileName, "rw");
			File tmpFile = File.createTempFile("temp", null);
			tmpFile.deleteOnExit();
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(tmpFile)));
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(tmpFile)));
			//设置文件指针位置
			raf.seek(pos);
			String content;
			/**
			 * 将插入点内容保存在临时文件中
			 * 读取插入点后所有文件内容
			 */
			while ((content = raf.readLine()) != null) {
					//将数据写入临时文件
					bw.write(content);
			}
			bw.flush();
			bw.close();
			//重新设置指针位置
			raf.seek(pos);
			//插入内容
			raf.write(insertContent.getBytes());
			//追加临时文件中内容
			while ((content = br.readLine()) != null) {
				raf.write(content.getBytes());
			}
			br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				raf.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
}
